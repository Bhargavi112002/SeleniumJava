package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoOne {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void facebook() {
	driver.get("https://www.facebook.com");
	}
	@Disabled  // This is applicable only for Junit 5
	@Test
	void twitter() {
		driver.get("https://www.x.com");	
	} 
	@Test
	void google() {
		driver.get("https://www.google.com");	
		}
	@Ignore  // This is applicable for only Junit 3 and 4
	@Test
	void gmail() {
		driver.get("https://www.gmail.com");	
		}
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");	}
	@Disabled
	@Test
	void techlearn() {
		driver.get("https://www.techlearn.in/admin");	}

}
