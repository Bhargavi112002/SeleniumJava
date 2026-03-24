package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;

	@Test
	public void frameshandles() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		
	//	WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	//	driver.switchTo().frame(obj);
		
	//	driver.switchTo().frame(0);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
		

		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("getwebsitebtn")).click();
	}
	
	@Test
	public void noframeshandles() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.switchTo().frame(1); //NoSuchFrameException: no such frame
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("MDemo");
		
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
