package stepdefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	WebDriver driver;

	@Given("User navigates Register Account page")
	public void user_navigates_register_account_page() {
	
		driver=Driverfactory.getDriver();
		driver.findElement(By.xpath(""));
	}

	@When("User enters the below fields")
	public void user_enters_the_below_fields(DataTable dataTable) {
		Map<String, String> dataMap=dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firtName"));
		driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
		
		
	}
	
	@When("User selects privacy policy")
	public void user_selects_privacy_policy() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
