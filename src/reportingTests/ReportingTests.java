package reportingTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTests {
	
	@Test
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void logout() {
		Assert.assertEquals("TEst", "Test1"); // this test will fail
	}
}
