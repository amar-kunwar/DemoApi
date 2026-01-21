package src.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownsTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions actions = new Actions(driver);
		//Thread.sleep(6000);
		// FireFox driver ...
	//	WebDriver driver1 = new FirefoxDriver();
		// Edge browser...
	//	WebDriver driver2 = new EdgeDriver();		
		// mozila driver ...		
		//WebDriver driver3 = new 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		
		//Select select = new Select();

	}

}
