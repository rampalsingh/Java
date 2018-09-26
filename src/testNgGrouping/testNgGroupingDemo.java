package testNgGrouping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testNgGroupingDemo {

	public static WebDriver driver = null;
	public static String sysPath = System.getProperty("user.dir");
	public static String chrome = sysPath + "\\drivers\\chromedriver.exe";
	public static String firefox = sysPath + "\\drivers\\geckodriver.exe";

	@Test(groups = { "sanity" })
	public void test1() throws Exception {
		System.out.println("Inside Test_1 Block || " + Thread.currentThread().getName());

	}

	@Test(groups = { "sanity", "smoke" })
	public void test2() throws Exception {
		System.out.println("Inside Test_2 Block || " + Thread.currentThread().getName());
	}

	@Test(groups = { "regression" })
	public void test3() throws Exception {
		System.out.println("Inside Test_3 Block || " + Thread.currentThread().getName());

	}

	@Test
	public void test4() throws Exception {
		System.out.println("Inside Test_4 Block || " + Thread.currentThread().getName());
	}
}
