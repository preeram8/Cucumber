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

public class LoginParameterization {

	WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);
    
	@Given("^User is on Login page parameterization$")
	public void userIsOnLoginPage() {
		driver.get("https://www.training-support.net/selenium/login-form");
	} 
	
	@When("^User enters parameterization \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.name("Username")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
    @Then("^Read the page title and confirmation message parameterization$")
   public void readTitleAndHeading() {
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
       String pageTitle = driver.getTitle();
       String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
       System.out.println("Page title is: " + pageTitle);
       System.out.println("Login message is: " + confirmMessage);
	
    }
    
    @And("^Close the parameterization Browser$")
   public void closeBrowser() {
    	driver.close();
  }
}
