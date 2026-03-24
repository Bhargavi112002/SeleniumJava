package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H_TCs_TimeOutFeature {
	WebDriver driver;

	@Test
	public void techlearnlogin() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("bhargavi");
		driver.findElement(By.name("pwd")).sendKeys("1234");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.className("wp-login-lost-password")).click();
		driver.findElement(By.id("user_login")).sendKeys("bhargavi123@gmail.com");
		driver.findElement(By.name("wp-submit")).click();
	}
	
	@Test(timeOut=4000)
	public void hellologin() {
		driver.get("https://www.hellowtea.com/admin");
		driver.findElement(By.id("user_login")).sendKeys("bhargavi");
		driver.findElement(By.name("pwd")).sendKeys("1234");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.className("wp-login-lost-password")).click();
		driver.findElement(By.id("user_login")).sendKeys("bhargavi123@gmail.com");
		driver.findElement(By.name("wp-submit")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
