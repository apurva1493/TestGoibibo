package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects{

	//public WebDriver driver;
	
	// constructor
	//public HomePageObjects(WebDriver driver)
	//
	//{
	//	this.driver=driver;
	//}
	
	public By one = By.id("oneway");
	public By two = By.id("roundTrip");
	public By three = By.id("multiCity");
	public By from = By.id("gosuggest_inputSrc");
	public By dest= By.id("gosuggest_inputDest");	
	public By departure = By.id("departureCalendar");
	public By traveller = By.id("pax_link_common");
	public By search = By.id("gi_search_btn");
	public By book = By.xpath("//span[contains (text(),'Cheapest')]//parent::span//parent::div//parent::div/following-sibling::div/child::div)[2]/child::div/following-sibling::div/child::div//button[contains(text(),'BOOK')]");
	public By review = By.xpath("//div[contains(@class,'justifyBetween alignItemsCenter')]//span");
	public By amount = By.xpath("//span[contains(text(),'Total Amount')]//parent::div/following-sibling::div/child::div//span");
	
	
	
	
	
	
	
}
