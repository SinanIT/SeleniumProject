package testNGPriority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TEstNGPriority {
	
	/*
	 * @Test(priority = 1) public void login() { System.out.println("Login"); }
	 * 
	 * @Test(priority = 3) public void logout() { System.out.println("Log out"); }
	 * 
	 * @Test(priority = 2) public void navigatng() {
	 * System.out.println("Navigating"); }
	 */
	
	@Test
	public void login() {
		System.out.println("Login");
		Assert.assertEquals("String1", "String1");
	}
	
	@Test(dependsOnMethods = {"login"})
	public void navigating() {
		System.out.println("Navigating");
	}

	@Test(dependsOnMethods = {"login", "navigating"})
	public void logout() {
		System.out.println("Log out");
		
	}
	
}
