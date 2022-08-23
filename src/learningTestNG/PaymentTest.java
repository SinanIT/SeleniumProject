package learningTestNG;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test
	public void PaymentInDollar() {
		System.out.println("Payment in Dollar");
	}
	
	@Test
	public void PaymentInTL() {
		System.out.println("Payment in TL");
	}

}
