package src.test;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfMouseKeyborad {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(3000);
		Actions aa = new Actions(driver);
		//aa.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		WebElement element = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		aa.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
		aa.moveToElement(element).contextClick().build().perform();
		//aa.doubleClick(element).build().perform();
		//aa.clickAndHold(element).build().perform();
		
		
	}

}
