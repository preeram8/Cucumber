package stepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {

	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);
    
	@Given("^User is on Login page$")
	public void userIsOnLoginPage() {
		driver.get("https://www.training-support.net/selenium/login-form");
	} 
	@When("^User enters username and password$")
	public void Userentersusernameandpassword() {
		driver.findElement(By.name("Username")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
    @Then("^Read the page title and confirmation message$")
   public void readTitleAndHeading() {
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
       String pageTitle = driver.getTitle();
       String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
       System.out.println("Page title is: " + pageTitle);
       System.out.println("Login message is: " + confirmMessage);
	
    }
    
    @And("^Close the Browser$")
   public void closeBrowser() {
    	driver.close();
  }
}
