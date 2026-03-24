package withoutbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless {
	
  @Test
  public void techlearnlogin() throws InterruptedException {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 */
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("headless");
	  WebDriver driver = new ChromeDriver(co);
	  
	  
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("bhragavim");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Hello@12345");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
  }
}
