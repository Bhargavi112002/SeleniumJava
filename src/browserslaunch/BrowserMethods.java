package browserslaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);   // Java wait command
	//	driver.manage().window().minimize();  // Selenium 4 
	//	driver.manage().window().fullscreen(); // S-4
	//	driver.close();
	//	driver.quit();
	}

}
