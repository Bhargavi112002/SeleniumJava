package tabtextappurlapptext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabURLAppText {
	WebDriver driver;

	@Test
	public void verifytabtext() {
		driver.get("https://www.google.com");
		
		String exptabtext = "Google";
		System.out.println("Expected Tab Text is :"+exptabtext);
		String acttabtext = driver.getTitle();
		System.out.println("Actual Tab Text is :"+acttabtext);

		Assert.assertEquals(acttabtext, exptabtext);
	}
	
	@Test
	public void verifyapplicationurl() {
		driver.get("https://www.google.com");
		
		String expurl = "https://www.google.com/";
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
	
	}
	@Test
	public void verifyapplicationtext() {
		driver.get("https://www.google.com");
		
		String expgmailtext = "Gmail";
		String actgmailtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a")).getText();
		Assert.assertEquals(actgmailtext, expgmailtext);	
		
		String expimgtext = "Image";
		String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[2]/a")).getText();
		Assert.assertEquals(actimgtext, expimgtext);	
	
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
