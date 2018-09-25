package parrelTestingExample;

import org.testng.annotations.Test;

public class testNGParallelTestingDemo {
	
	@Test
	public void test1() {
		System.out.println("Inside Test_1 Block");
	}
	
	@Test
	public void test2() {
		System.out.println("Inside Test_2 Block");
	}
	
	@Test
	public void test3() {
		System.out.println("Inside Test_3 Block");
	}
}
