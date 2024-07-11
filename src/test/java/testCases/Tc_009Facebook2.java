package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_009Facebook2 {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("regrowtech123@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("regrow");
		
//		driver.findElement(By.id("loginbutton")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("email")).clear();
		
		
	}

}