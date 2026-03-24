package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class K_TCs_Groups_Execution_From_XML {
	WebDriver driver;

	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test(groups="bug")
	public void jira() {
		driver.get("https://www.jira.com");
	}
	@Test(groups="ai")
	public void chatgpt() {
		driver.get("https://www.chatgpt.com");
	}
	@Test(groups="tech")
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(groups="ai")
	public void grok() {
		driver.get("https://www.grok.com");
	}
	@Test(groups="bug")
	public void mantisbt() {
		driver.get("https://www.mantisbt.org");
	}
	@Test(groups={"search", "ai"})
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups="bug")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test(groups="tech")
	public void techlearn() {
		driver.get("https://www.techlearn.in/admin");
	}
	@Test(groups="bug")
	public void bugzilla() {
		driver.get("https://www.bugzilla.org");
	}

	@BeforeTest(groups="ai")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	//	driver.quit();
	}

}
