package locators;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Disabled
	@Test
	void googlesearch() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("GitHub");
		
	}
	@Disabled
	@Test
	void idnameclassname() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("purushothamk");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Test@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("wp-login-lost-password")).click();
	}
	
	@Test
	void cssselectorlocator() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.cssSelector("#user_login")).sendKeys("girishm");
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("a.button button-primary button-large")).click();
	//	driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
	}
	@Disabled
	@Test
	void linktextandpartiallinktext() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost")).click();
		
	}
	@Disabled
	@Test
	void locators() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys("BhargaviM");
		
		WebElement passowrd = driver.findElement(By.name("pwd"));
		passowrd.sendKeys("Test");
		
		WebElement checkbox = driver.findElement(By.name("rememberme"));
		checkbox.click();
		
	}
	@Disabled
	@Test
	void totallinks() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links :"+links.size());
		System.out.println(links.size());
		
		
	}
	
	
	@Test
	void totalimages() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(2000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total image on redmine home page :"+images.size());		
		
	}
	
	

}
