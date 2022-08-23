package parallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestWebSite extends BasePage {

	@Test
	public void test_01() throws InterruptedException {
		getWebDriver().get("https://www.w3schools.com/");
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Tutorials ')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Learn CSS')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'HTML')])[1]")).click();
		Thread.sleep(3);

	}

	@Test
	public void test_02() throws InterruptedException {
		getWebDriver().get("https://www.w3schools.com/");
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Tutorials ')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Learn CSS')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'HTML')])[1]")).click();
		Thread.sleep(3);

	}
	@Test
	public void test_03() throws InterruptedException {
		getWebDriver().get("https://www.w3schools.com/");
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Tutorials ')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Learn CSS')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'HTML')])[1]")).click();
		Thread.sleep(3);

	}
	@Test
	public void test_04() throws InterruptedException {
		getWebDriver().get("https://www.w3schools.com/");
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Tutorials ')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'Learn CSS')])[1]")).click();
		Thread.sleep(3);
		getWebDriver().findElement(By.xpath("(//a[contains(text(),'HTML')])[1]")).click();
		Thread.sleep(3);

	}
	
}