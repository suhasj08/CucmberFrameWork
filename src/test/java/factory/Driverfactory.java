package factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ConfigReader;

public class Driverfactory {

	static Properties prop=ConfigReader.InitializeProperties();
	
	static WebDriver driver=null;
	public static void initializeBrowser( String browserName) {
		
		if(browserName.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		}
		
	}
	
	public static WebDriver getDriver() {
		
		 return driver;
	}
	
}
