package learnigParameters;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "data")
	public static Object[][] testData(Method m){
		Object[][] obj = null;
		if (m.getName().equals("registerUSer")) {
			obj = new Object[3][4];
			
			obj[0][0] = "John";
			obj[0][1] = "Doo";
			obj[0][2] = "johndo@gmail.com";
			obj[0][3] = "12345";
			
			obj[1][0] = "David";
			obj[1][1] = "Cameron";
			obj[1][2] = "david@gmail.com";
			obj[1][3] = "0808985";
			
			obj[2][0] = "Frank";
			obj[2][1] = "Funny";
			obj[2][2] = "frank@gmail.com";
			obj[2][3] = "88585858";
		}
		
		if (m.getName().equals("loginUser")) {
			obj = new Object[3][2];
			
			obj[0][0] = "johndo@gmail.com";
			obj[0][1] = "12345";
			
			obj[1][0] = "david@gmail.com";
			obj[1][1] = "0808985";
			

			obj[2][0] = "frank@gmail.com";
			obj[2][1] = "88585858";
		}
		
		return obj;
		
	}

}
