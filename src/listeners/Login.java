package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void loginViaEmail() {
		System.out.println("Login Via Email");
		Assert.assertEquals("Sinan", "Sinan1");// esitlik olmadigi halde test gecti gorunuyor try catch kullandigim icin
		
	}

	@Test
	public void loginViaFaceBook() {
		System.out.println("Login Via FaceBook");

	}
	
	@Test
	public void loginViaTwitter() {
		System.out.println("Login Via Twitter");
	}

}
