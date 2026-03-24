package dropdownselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownOption {
	WebDriver driver;
	@Test
	public void selectdropdownvalues() throws InterruptedException {
		driver.get("https://www.redmine.org");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("bhargavi@gmail.com");
		Thread.sleep(3000);
		Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		obj.selectByContainsVisibleText("Ru");
	//	obj.selectByIndex(7);
	//	obj.selectByValue("ja");
	//	obj.selectByVisibleText("Hungarian (Magyar)");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
