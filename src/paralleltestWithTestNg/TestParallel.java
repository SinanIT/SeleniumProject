package paralleltestWithTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallel {
	
	@DataProvider(parallel = true)
	public Object [][] getData() {
		return new Object [][] {{"Test 1"}, {"Test 2"}, {"Test 3"}};}
	
	@Test(dataProvider = "getData")
	public void test(String value) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.xpath("(//i[@class='fa'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys(value);
		
		driver.quit();
	}
}
