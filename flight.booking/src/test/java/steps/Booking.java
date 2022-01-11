package steps;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class Booking {
	public WebDriver driver;
	public String travelDate = null;
	HomePageObjects homePageObjects = new HomePageObjects();
	@Given("Navigate to goibibo_oneway")
	public void navigate_to_goibibo_oneway() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario-1 Releated to One Way");
		// Write code here that turns the phrase above into concrete actions
		this.driver.get("https://www.goibibo.com/");
		this.driver.manage().window().maximize();
		
		 //String envRootDir = System.getProperty("user.dir");
		 //System.out.println("PATH IS >>"+ envRootDir);	
	}

	@When("Provide the inputs to all fields_oneway")
	public void provide_the_inputs_to_all_fields_oneway() {
		System.out.println("Test 2");
		//For One way booking
		this.driver.findElement(homePageObjects.one).click();

		this.FillDetails("Pune", "Mumbai","one", false);	
	}

	@Then("Review the page_oneway")
	public void review_the_page_oneway() throws InterruptedException {
		System.out.println("Test 3");
		// Validate on review page
		this.BookCheapFlight();
		this.ValidateDetails("Pune", "Mumbai");
	}

	@Given("^Navigate to goibibo_roundtrip$")
	public void navigate_to_goibibo_roundtrip() throws Throwable {
		System.out.println("Scenario-2 Releated to Round Trip");
		// Write code here that turns the phrase above into concrete actions
		this.driver.get("https://www.goibibo.com/");
		this.driver.manage().window().maximize();
	}

	@When("^Provide the inputs to all fields_roundtrip$")
	public void provide_the_inputs_to_all_fields_roundtrip() throws Throwable {
		//For Two way booking
		this.driver.findElement(homePageObjects.two).click();
		this.FillDetails("Pune", "Dubai","two", false);	
	}

	@Then("^Review the page_roundtrip$")
	public void review_the_page_roundtrip() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Validate on review page
		this.BookCheapFlight();
		this.ValidateDetails("Pune", "Dubai");
	}

	@Given("^Navigate to goibibo_multicity$")
	public void navigate_to_goibibo_multicity() throws Throwable {
		System.out.println("Scenario-3 Releated to Round Trip");
		this.driver.get("https://www.goibibo.com/");
		this.driver.manage().window().maximize();
	}

	@When("^Provide the inputs to all fields_multicity$")
	public void provide_the_inputs_to_all_fields_multicity() throws Throwable {
		//For Two way booking
				this.driver.findElement(homePageObjects.multiCity).click();
				this.FillDetails("Pune", "Dubai","multi", true);	
	}

	@Then("^Review the page_multicity$")
	public void review_the_page_multicity() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// CLick on book buton
		this.driver.findElement(By.cssSelector(".button.orange.fr")).click();
		Thread.sleep(10000);
		this.ValidateDetailsMultiWay();
	}

	@Before  //cucumber hooks
	public void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@After
	public void end() {
	
		this.driver.quit();
	}

	// Required functions
	public void FillDetails(String from, String destiNation, String travelType, Boolean isMultiCity)
	{
		// Enter From
		this.driver.findElement(homePageObjects.from).sendKeys(from);
		this.driver.findElement(homePageObjects.from).findElements(By.xpath("following-sibling::ul//li")).get(0).click();

		// Enter Destination
		this.driver.findElement(homePageObjects.dest).sendKeys(destiNation);
		this.driver.findElement(homePageObjects.dest).findElements(By.xpath("following-sibling::ul//li")).get(0).click();
		// Date selectors.
		this.DateSelector(travelType);

		// Search Button
		this.driver.findElement(homePageObjects.search).click();
	}

	public void DateSelector(String type)
	{
		if(type == "one")
		{
			//Need to select one date only
			// Next Month arrow and first date
			this.driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
			travelDate = this.driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(0).getAttribute("aria-label");

			System.out.println("Date calculated" + this.travelDate);
			this.driver.findElements(By.xpath("//div[@class='DayPicker-Day']//div")).get(0).click();

		}
		else
		{
			travelDate = this.driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--selected')]/following-sibling::div")).getAttribute("aria-label");
			// Current Date selected for travel Start
			this.driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--selected')]/following-sibling::div")).click();	

			// For Return date
			if(type == "two")
			{
				// Next Month arrow
				this.driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();

				System.out.println("Date calculated" + this.travelDate);
				this.driver.findElements(By.xpath("//div[@class='DayPicker-Day']//div")).get(0).click();
			}
			else
			{
				this.driver.findElements(homePageObjects.dest).get(1).sendKeys("Pune");
				this.driver.findElements(homePageObjects.dest).get(1).findElement(By.xpath("following-sibling::ul//li")).click();
				
				// Next Month arrow
				this.driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();

				System.out.println("Date calculated" + this.travelDate);
				this.driver.findElements(By.xpath("//div[@class='DayPicker-Day']//div")).get(0).click();
			}
		}
	}

	public void BookCheapFlight() throws InterruptedException
	{
		Thread.sleep(5000);
		if(this.driver.findElement(homePageObjects.book).isDisplayed())
		{
			this.driver.findElement(homePageObjects.book).click();	
		}
		Thread.sleep(10000);
	}

	public void ValidateDetails(String from, String to)
	{
		// Check From and To
		String journeyDetail = this.driver.findElement(homePageObjects.review).getText(); 
		String fromBookingPage = journeyDetail.split("-")[0].trim();
		String toBookingPage = journeyDetail.split("-")[1].trim();

		// Get Date from booking Page
		String travelDateFromBookingPage = this.driver.findElement(By.xpath("//div[contains(@class,'flight-detailstyles__FltReviewDetailCont')]//span[@class='black']")).getText();
		Assert.assertTrue(fromBookingPage.contains(from) && toBookingPage.contains(to));

		System.out.println("Date calculated" + this.travelDate);
		System.out.println("Final Date "+travelDateFromBookingPage);
		Assert.assertTrue(travelDate.equals(travelDateFromBookingPage));

		System.out.println("Validation Done");
	}
	
	public void ValidateDetailsMultiWay()
	{
    	// Get Date from booking Page
		String travelDateFromBookingPage = this.driver.findElement(By.xpath("//div[contains(@class,'bkFlt ')]//span[contains(@class,'co12 db grey')]")).getText();
			System.out.println("Date calculated" + this.travelDate);
		System.out.println("Final Date "+travelDateFromBookingPage);
		Assert.assertTrue(travelDate.equals(travelDateFromBookingPage));

		System.out.println("Validation Done");
	}
}
