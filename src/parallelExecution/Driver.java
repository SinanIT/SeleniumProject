package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	static WebDriver create(String type) throws IllegalAccessException {
		WebDriver driver;
		
		switch (type) {
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;	
			
		default :
			throw new IllegalAccessException();
		}
	return driver;
	}
	

}
