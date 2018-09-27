package testNgIgnore;

import org.testng.annotations.Test;

//@Ignore
public class testNgIgnoreDemo  {

	@Test
	public void test1() {
		System.out.println("Inside Test_1 Block");
	}

	@Test
	public void test2() {
		System.out.println("Inside Test_2 Block");
	}
}
