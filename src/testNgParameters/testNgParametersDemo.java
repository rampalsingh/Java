package testNgParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNgParametersDemo {

	@Test
	@Parameters({ "MyName" })
	public void test1(@Optional("this is optional message") String name) {
		System.out.println("Name is : " + name);
	}
}
