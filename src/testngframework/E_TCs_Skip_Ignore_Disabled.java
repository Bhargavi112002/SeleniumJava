package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class E_TCs_Skip_Ignore_Disabled {
	WebDriver driver;

	@Test(enabled=false, priority=0)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(priority=3)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Ignore
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test(priority=1)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(priority=2, enabled=false)
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(enabled=true)
	public void techlearn() {
		driver.get("https://www.techlearn.in/admin");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
