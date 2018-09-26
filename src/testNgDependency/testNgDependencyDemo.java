package testNgDependency;

import org.testng.annotations.Test;

public class testNgDependencyDemo {

//	@Test(dependsOnMethods = { "test2", "test3" })
	public void test1() {
		System.out.println("I am inside Test_1");
	}

	@Test(dependsOnGroups = {"abc"})
	public void test2() {
		System.out.println("I am inside Test_2");
	}

	@Test(groups="abc")
	public void test3() {
		System.out.println("I am inside Test_3");
	}
	

	@Test(groups="abc")
	public void test4() {
		System.out.println("I am inside Test_4");
	}
	

	@Test(groups="xyz")
	public void test5() {
		System.out.println("I am inside Test_5");
	}
}
