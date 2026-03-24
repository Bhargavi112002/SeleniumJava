package pagescrolldownup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownUp {
	WebDriver driver;
  @Test
  public void scrollDown() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("scrollTo(0,4000);");
		  
	  driver.findElement(By.xpath("/html/body/div/main/div[11]/div/div/p/a")).click();
  }
  
  @Test
  public void scrollUp() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("scrollTo(0,4000);");
	  
	  Thread.sleep(3000);
	  js.executeScript("scrollTo(0,-3500);");
  
  }
  
  @Test 
  public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
  {
      WebElement element = (WebElement) driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']"));
      Coordinates coordinate = ((Locatable)element).getCoordinates(); 
      coordinate.onPage(); 
      coordinate.inViewPort();
       }    
  driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']")).click();
    }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
