package stepdefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login {
	
	WebDriver driver;

	LoginPage loginpage = new LoginPage(driver);
	
	@Given("User navigate to login page")
	public void User_navigate_to_login_page() {
		
		driver=Driverfactory.getDriver();
	//	LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonmyAccount();
		loginpage.clickOnLoginButton();
		
	}

	@When("User has entered valid email address {string} into email field")
	public void user_has_entered_valid_email_address_into_email_field(String emailText) {
		loginpage.entervalidEmailAddress(emailText);
	}

	@And("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String validpassword) {
		loginpage.enterValidPassword(validpassword);
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginpage.clickLoginButton();
	}

	@Then("user should get not successfully logged in")
	public void user_should_get_successfully_logged_in() {
		String warningText =loginpage.VerifygetWarningMessage();
		Assert.assertEquals(warningText,"Warning: No match for E-Mail Address and/or Password.","warning message displayed");
	}

	@When("User has entered invalid email address {string} into email field")
	public void user_has_entered_invalid_email_address_into_email_field(String invalidemail) {
		
		driver.findElement(By.id("input-email")).sendKeys(invalidemail);;
	}

	@And("User has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String invalidpassword) {
		driver.findElement(By.id("input-password")).sendKeys(invalidpassword);
	}

	@Then("user should get warning message")
	public void user_should_get_warning_message() {
		
		String warningText =driver.findElement(By.xpath("//div[contains(@class, 'alert alert-danger')]")).getText();
		Assert.assertEquals(warningText,"Warning: No match for E-Mail Address and/or Password.","warning message displayed");
		
		
	}
	
}
