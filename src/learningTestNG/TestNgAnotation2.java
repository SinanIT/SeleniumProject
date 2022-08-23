package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnotation2 {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Staring test NG");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Start test execution");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Initialize Selenium class 2");
		
	}
	
	@Test
	public void tets3() {
		System.out.println("inside test 3");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Destroy selenium for class 2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Stop execution");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("Stopping test NG");
	}

}
