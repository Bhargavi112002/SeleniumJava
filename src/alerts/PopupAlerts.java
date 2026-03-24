package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopupAlerts {
	WebDriver driver;

	/*@Test
	public void alertOkButton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}*/
	
	/*@Test
	public void alertCancelButton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}*/
	
	@Test
	public void alertSendTextOkCancelButton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Girish Kumar");
		a.accept();
		
	//	driver.switchTo().alert().sendKeys("Girish");
	//	driver.switchTo().alert().accept();
		
	}
	
	/*@Test
	public void NoalertSendTextOkCancelButton() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin/");
		Thread.sleep(3000);		
		driver.switchTo().alert().accept();
		
		// NoAlertPresentException:
		
	}*/

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
