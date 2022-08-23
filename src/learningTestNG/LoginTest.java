package learningTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginViaEmail() {
		System.out.println("Login Via Email");
		
		try {
			Assert.assertEquals("Sinan", "Sinan1");// esitlik olmadigi halde test gecti gorunuyor try catch kullandigim icin
		} catch (Throwable e) {
			System.out.println(e);
		}
		System.out.println("After asset condition ");
	}

	@Test
	public void loginViaFaceBook() {
		System.out.println("Login Via FaceBook");
		
		//throw new SkipException("Facebook functionality not supported");  // we can skip the test
	}
	
	@Test
	public void loginViaTwitter() {
		System.out.println("Login Via Twitter");
	}
}
