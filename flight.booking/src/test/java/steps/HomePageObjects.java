package steps;
import org.openqa.selenium.By;
public class HomePageObjects {
	public By one = By.id("oneway");
	public By two = By.id("roundTrip");
	public By multiCity = By.id("multiCity");
	public By from = By.id("gosuggest_inputSrc");
	public By dest= By.id("gosuggest_inputDest");	
	public By departure = By.id("departureCalendar");
	public By traveller = By.id("pax_link_common");
	public By search = By.id("gi_search_btn");
	public By book = By.xpath("//span[contains (text(),'Cheapest')]/ancestor::div[@class='dF justifyBetween']/following-sibling::div//button[text()='BOOK']");
	public By review = By.xpath("//div[contains(@class,'justifyBetween alignItemsCenter')]//span");
	public By amount = By.xpath("//span[contains(text(),'Total Amount')]//parent::div/following-sibling::div/child::div//span");
}
