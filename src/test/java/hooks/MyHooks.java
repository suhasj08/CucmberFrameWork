package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.Driverfactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.ConfigReader;


public class MyHooks {
	
		WebDriver driver;

		@Before
		public void setup() {
			
			Properties prop=ConfigReader.InitializeProperties();
			Driverfactory.initializeBrowser(prop.getProperty("browser")); 
			driver = Driverfactory.getDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url"));
		}
		
		public void tearDown(Scenario scenario) {
			
			String scenarioName= scenario.getName().replaceAll(" ", "_");
			
			if(scenario.isFailed()) {
				byte[] srcScrennShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(srcScrennShot, "image/png", scenarioName);
			}
			
			driver.quit();
		}
		
}
