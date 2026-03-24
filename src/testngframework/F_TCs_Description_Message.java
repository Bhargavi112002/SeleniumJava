package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class F_TCs_Description_Message {
	WebDriver driver;

	@Test(description="Verify Zomato Application")
	public void tc1() {
		driver.get("https://www.zomato.com");
	}
	@Test(description="Verify Facebook Application")
	public void tc2() {
		driver.get("www.facebook.com");
	}
	@Test(description="Verify Twitter Application")
	public void tc3() {
		driver.get("https://www.x.com");
	}
	@Test(description="Verify Selenium Application")
	public void tc4() {
		driver.get("https://www.selenium.dev");
	}
	@Test(description="Verify Google Application")
	public void tc5() {
		driver.get("www.google.com");
	}
	@Test(description="Verify Techlearn Application")
	public void tc6() {
		driver.get("https://www.techlearn.in/admin");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
