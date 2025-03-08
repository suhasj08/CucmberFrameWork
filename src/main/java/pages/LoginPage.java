package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginButton;
	
	@FindBy(id="input-email")
	private WebElement EntervalidEmailAddress;
	
	@FindBy(id="input-password")
	private WebElement EnterValidPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement ClickOnLoginButton;
	
	@FindBy(xpath="//div[contains(@class, 'alert alert-danger')]")
	private WebElement getWarningMessage;
	
	
	public void clickonmyAccount() {
		
		myAccountDropMenu.click();
		
	}
	
	public void clickOnLoginButton(){
		loginButton.click();
	}
	
	public void entervalidEmailAddress(String emailText) {
		EntervalidEmailAddress.sendKeys(emailText);
	}
	
	public void enterValidPassword(String passwordText) {
		EnterValidPassword.sendKeys(passwordText);
	}
	
	public void clickLoginButton() {
		ClickOnLoginButton.click();
	}
	
	public String VerifygetWarningMessage() {
		 return getWarningMessage.getText();
	}
	
}
