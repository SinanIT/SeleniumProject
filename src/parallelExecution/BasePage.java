package parallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	
	public static ThreadLocal<WebDriver> threadDriver = new  ThreadLocal<WebDriver>();
	
	
	@BeforeMethod
	public void beforeMethod() throws IllegalAccessException {
		WebDriver driver = new Driver().create("Chrome");
		setWebDriver(driver);
		getWebDriver().manage().window().maximize();
		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void setWebDriver(WebDriver driver) {
		threadDriver.set(driver);
	}
	public WebDriver getWebDriver() {
		return threadDriver.get();
	}
	
	@AfterMethod
	public void afterMethod() {
		getWebDriver().quit();
		threadDriver.set(null);
	}

}
