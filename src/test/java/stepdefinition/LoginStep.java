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
public class LoginStep{

	WebDriverWait wait;
	WebElement login, lost, reset;
	String expectedResult;
	String path = "C:\\Users\\roshi\\Documents\\Selenium Folder\\drivers\\chromedriver.exe";
	WebDriver driver;
	
	@Given("^After Initialising the Chrome browser user is on Eduma homepage$")
    public void initialising_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
        driver.get("http://sethuonline.com/lms/");
    }
	
	@When("^user click on login which opens the login page, user click on lost your password$")
    public void user_click_on_login_which_opens_the_login_page_user_click_on_lost_your_password() throws Throwable {
		wait = new WebDriverWait(driver, 10);
		login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='thim-widget-login-popup thim-widget-login-popup-base']")));
		login.click();
		lost = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='lost-pass-link']")));
		lost.click();
    }

    @Then("^user get the result displayed = (.+)$")
    public void user_get_the_result_displayed_(String condition) throws Throwable {
    	String result = driver.getCurrentUrl();
    	System.out.println(result + "" + condition);
    }

    @And("^user enters (.+) and click Reset Password$")
    public void user_enters_and_click_reset_password(String usernameoremail) throws Throwable {
    	 driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(usernameoremail);
	    	reset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Reset password']")));
			reset.click();
    }
    @And("^user close the browser$")
    public void user_close_the_browser() throws Throwable {
     driver.quit();   
    }
	
}





























































/*package stepdefinition;

import static org.junit.Assert.assertEquals;

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
import cucumber.api.junit.Cucumber;/*

/*@RunWith(Cucumber.class)
public class LoginStep {
	
	WebDriver driver;
	String baseUrl = "http://sethuonline.com/lms/";
	WebDriverWait wait;
	WebElement login, lost, reset;
	String expectedResult;
	String path = "C:\\Users\\roshi\\Documents\\Selenium Folder\\drivers\\chromedriver.exe";
	
	
	    @Given("^validate the broswer$")
	    public void validate_the_broswer() throws Throwable {
	        System.setProperty("webdriver.chrome.driver", path);
	        driver.get(baseUrl);
	    }

	    @Given("^User is on Eduma homepage$")
	    public void user_is_on_eduma_homepage() throws Throwable {
	        driver.getTitle();
	    }

	    @When("^the browser is triggered$")
	    public void the_browser_is_triggered() throws Throwable {
	        driver = new ChromeDriver();
	    }
	
	    @When("^user click on Login link $")
	    public void user_click_on_login_link() throws Throwable {
			wait = new WebDriverWait(driver, 10);
			login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='thim-widget-login-popup thim-widget-login-popup-base']")));
			login.click();
	    }

	    @Then("^the browser is started$")
	    public void the_browser_is_started() throws Throwable {
	        System.out.println(driver.getTitle());
	       
	    }

	    @Then("^User should see the result displayed = (.+)$")
	    public void user_should_see_the_result_displayed_(String condition) throws Throwable {
	        String result = driver.getCurrentUrl();
	    	System.out.println(result + "" + condition);
	    }

	    @And("^click on Lost your password link$")
	    public void click_on_lost_your_password_link() throws Throwable {
	        lost = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='lost-pass-link']")));
			lost.click();
	    }

	    @And("^User enters (.+) and click Reset Password button$")
	    public void user_enters_and_click_reset_password_button(String usernameoremail) throws Throwable {
	        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(usernameoremail);
	    	reset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Reset password']")));
			reset.click();	
	    }

	    @And("^user close the browser$")
	    public void user_close_the_browser() throws Throwable {
	        driver.quit();
	    }

	//Initialising browser
	/*@Given("^validate the broswer$")
    public void validate_the_broswer() throws Throwable {
		System.setProperty("webdriver.chrome.driver", path);
    }

    @When("^the browser is triggered$")
    public void the_browser_is_triggered() throws Throwable {
        driver = new ChromeDriver();
    }

    @Then("^the browser is started$")
    public void the_browser_is_started() throws Throwable {
        driver.get(baseUrl);
    }*/
//----------------------------------------------------------	
    //Scenario Forgot password functionality
	/* @Given("^On Eduma homepage$")
	    public void on_eduma_homepage() throws Throwable {
		 System.out.println(driver.getTitle());

	    }
	 @When("^user click on Login link $")
	    public void user_click_on_login_link() throws Throwable {
		 wait = new WebDriverWait(driver, 10);
		    login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='thim-widget-login-popup thim-widget-login-popup-base']")));
		    login.click();
	    }
	   
    @Then("^User should see the result displayed = (.+)$")
    public void user_should_see_the_result_displayed_(String condition) throws Throwable {
    	String result = driver.getCurrentUrl();
    	System.out.println(result + "" + condition);
    	
    	assertEquals(condition, result);
    	//System.out.println(condition + " " + result);
    }   
    @And("^click on Lost your password link$")
    public void click_on_lost_your_password_link() throws Throwable {
    	lost = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='lost-pass-link']")));
		lost.click();
    }	
    
    @And("^User enters (.+) and click Reset Password button$")
    public void user_enters_and_click_reset_password_button(String usernameoremail) throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(usernameoremail);
    	reset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Reset password']")));
		reset.click();	
    }
    @And("^user close the browser$")
    public void user_close_the_browser() throws Throwable {
        driver.quit();
    }*/

    
    

	
   

//}
