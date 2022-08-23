package learnigParameters;

import org.testng.annotations.Test;

public class LearningDataParameters {

	@Test(dataProviderClass = TestData.class, dataProvider = "data")
	public void registerUSer(String firstname, 
							 String lastname, 
							 String email, 
							 String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
	}
	
	@Test(dataProviderClass = TestData.class, dataProvider = "data")
	public void loginUser(String email, 
						  String password) {
		System.out.println(email);
		System.out.println(password);
	}
	
	
}
