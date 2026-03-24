package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class G_TCs_DependsOnMethod {
	WebDriver driver;

	@Test(dependsOnMethods="method2")
	public void method1() {
		driver.findElement(By.id("user_login")).sendKeys("BhargaviM");
		driver.findElement(By.id("user_pass")).sendKeys("Hello@123");
	}
	
	@Test
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
