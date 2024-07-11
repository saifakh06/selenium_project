package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_019FacebookActions {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("regrow").keyUp(Keys.SHIFT).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		action.moveToElement(pass).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		action.contextClick(pass).perform();
		
		
//		driver.findElement(By.id("loginbutton")).click();
		
	}

}