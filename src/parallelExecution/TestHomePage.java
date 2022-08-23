package parallelExecution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

	@Test
	public void test_01() throws InterruptedException {
		getWebDriver().get("https://www.google.com/");
		Thread.sleep(3);

	}
}