package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class J_TCs_Execution_From_TestNG_XML_File {
	WebDriver driver;

	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	public void chatgpt() {
		driver.get("https://www.chatgpt.com");
	}
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void grok() {
		driver.get("https://www.grok.com");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test
	public void techlearn() {
		driver.get("https://www.techlearn.in/admin");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
