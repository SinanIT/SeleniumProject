package learnigParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LearningParameters {
	
	@Parameters("email")// not recommended
	@Test
	public void login(String email) {
		System.out.println("Inside login");
		System.out.println(email);
	}

}
