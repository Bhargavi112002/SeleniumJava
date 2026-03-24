package isdisplayedisenabledisselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IsDisplayedIsEnabledIsSelected {
	WebDriver driver;

	@Test
	public void isDisplyedMethod() {
		driver.get("https://www.techlearn.in/admin");
		boolean lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).isDisplayed();
		
		if(lyp==true)
		{
			System.out.println("Lost your password link is displayed in login page");
			driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		}
		else
		{
			System.out.println("Lost your password link is Not displayed in login page");
		}
	}
	
	@Test
	public void isEnabledMethod() {
		driver.get("https://www.techlearn.in/admin");
		
		boolean user = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).isEnabled();
		
		if(user==true)
		{
			System.out.println("Username text field is enabled to the enter username or email id");
			driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("bhargavim");
		}
		else
		{
			System.out.println("Username text field is Not enabled to the enter username or email id");		
		}
		
		
	}
	
	@Test
	public void isSelectedMethod() {
		driver.get("https://www.techlearn.in/admin");
		
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		
		boolean check = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();		
		
		if(check==true)
		{
			System.out.println("Remember me check box is Selected");
		}
		
		else
		{
			System.out.println("Rememeber me check box is not selected");
		}
				
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
