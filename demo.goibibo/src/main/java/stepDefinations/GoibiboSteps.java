package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.HomePageObjects;

public class GoibiboSteps {

	public WebDriver driver;
	
	HomePageObjects homePageObjects = new HomePageObjects());
	@Given("^Navigate to goibibo_oneway$")
	public void navigate_to_goibibo_oneway() throws Throwable {
		
		System.out.println("Scenario-1 Releated to One Way");
	    // Write code here that turns the phrase above into concrete actions
		this.driver.get("https://www.goibibo.com/");
		this.driver.manage().window().maximize();
		
	}

	@When("^Provide the inputs to all fields_oneway$")
	public void provide_the_inputs_to_all_fields_oneway() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.driver.findElement(homePageObjects.one).click();
		
		this.FillDetails("Pune", "Mumbai","one", false);	
	}

	@Then("^Review the page_oneway$")
	public void review_the_page_oneway() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	/*
	
	@Given("^Navigate to goibibo_roundtrip$")
	public void navigate_to_goibibo_roundtrip() throws Throwable {
		System.out.println("HEllo in Case-2");
	    // Write code here that turns the phrase above into concrete actions
		this.driver.get("https://www.goibibo.com/");
		this.driver.manage().window().maximize();
	}

	@When("^Provide the inputs to all fields_roundtrip$")
	public void provide_the_inputs_to_all_fields_roundtrip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Review the page_roundtrip$")
	public void review_the_page_roundtrip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^Navigate to goibibo_multicity$")
	public void navigate_to_goibibo_multicity() throws Throwable {
		System.out.println("HEllo in Case-3");
	    // Write code here that turns the phrase above into concrete actions
		this.driver.get("https://www.goibibo.com/");
		this.driver.manage().window().maximize();
	}

	@When("^Provide the inputs to all fields_multicity$")
	public void provide_the_inputs_to_all_fields_multicity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Review the page_multicity$")
	public void review_the_page_multicity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	*/
	@Before
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
		// Enter Destination
		this.driver.findElement(homePageObjects.dest).sendKeys(destiNation);
		
		// Date selectors.
		this.DateSelector(travelType);
		// For Multicity
		if(isMultiCity)
		{
			
			// Add further logic for fields
			
			
		}
		
		// Search Button
		this.driver.findElement(homePageObjects.search).click();
		
		
	}
	
	public void DateSelector(String type)
	{
		
	// Current Date selected for travel Start
	this.driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--selected")).click();
	
	if(type != "one")
	{
	// Next Month arrow
	this.driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
	this.driver.findElement(By.className("DayPicker-Day")).findElement(By.tagName("div")).click();
		
	}
}
}