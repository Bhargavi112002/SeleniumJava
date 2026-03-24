package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RCDCDDMHKF {
	WebDriver driver;

	@Test
	public void rightclickfeature() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-4704\"]/a"))).build().perform();
	}
	
	@Test
	public void doubleclickfeature() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/double-tap/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
		
	}
	
	@Test
	public void draganddropfeature() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/drag-and-drop/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
		
		act.dragAndDrop(source, target).build().perform();		
		
	}
	
	@Test
	public void mousehover() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a"))).click().build().perform();
	//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-45\"]/a")).click();
		
			
		
	}
	
	
	
	@Test
	public void keyboardfeature() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
				
		
	}
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
