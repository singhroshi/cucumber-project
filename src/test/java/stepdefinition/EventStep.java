package stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class EventStep {
	
	WebDriver driver;
	String path = "C:\\Users\\roshi\\Documents\\Selenium Folder\\drivers\\chromedriver.exe";
	WebElement eventClick, upcoming, expired, happening;	
	WebDriverWait wait;
	
	@Given("^User is on Eduma homepage after the browser initialise$")
    public void user_is_on_eduma_homepage_after_the_browser_initialise() throws Throwable {
		System.out.println("this is the event");
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("http://sethuonline.com/lms/");
    }			
	   
    @When("^user click on Events which opens the Events page$")
    public void click_on_events() throws Throwable {
    	wait = new WebDriverWait(driver, 10);
    	eventClick = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"menu-item-8149\"]/a"))));
        eventClick.click();
    }
    @Then("^user get the list of events for the clicked event title$")
    public void user_get_the_list_of_events_for_the_clicked_event_title() throws Throwable {
    	
        
    }
    @And("^user click on Happening, Upcoming or Expired event$")
    public void user_click_on_happening_upcoming_or_expired_event() throws Throwable {
    	upcoming = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Upcoming')]"))));
    	upcoming.click();
    	
    	
    	happening = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Happening')]"))));
    	happening.click();
    	
    	
    	expired = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Expired')]"))));
        expired.click();
    }
    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
        driver.quit();
    }

}
