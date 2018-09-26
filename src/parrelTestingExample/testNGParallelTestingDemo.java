package parrelTestingExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNGParallelTestingDemo {
	WebDriver driver = null;
	public static String sysPath = System.getProperty("user.dir");
	public static String chrome = sysPath + "\\drivers\\chromedriver.exe";
	public static String firefox = sysPath + "\\drivers\\geckodriver.exe";

	@Test
	public void test1() throws Exception {
		System.out.println("Inside Test_2 Block || " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", chrome);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		Thread.sleep(2000);
		driver.quit();

	}

	@Test
	public void test2() throws Exception {
		System.out.println("Inside Test_1 Block || " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", chrome);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test3() throws Exception {
		System.out.println("Inside Test_3 Block ||  " + Thread.currentThread().getId());
	}
}
