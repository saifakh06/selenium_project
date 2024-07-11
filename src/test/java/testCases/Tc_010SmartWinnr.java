package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_010SmartWinnr {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.smartwinnr.com/");
		
		WebElement logo=driver.findElement(By.id("navbar-logo"));
		
		boolean res=logo.isDisplayed();
		
		
		if(res==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		
		WebElement login=driver.findElement(By.id("log-in"));
		
		boolean res1=login.isEnabled();
		
		if(res1)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		
		boolean res2=logo.isSelected();
		System.out.println(res2);
		driver.close();
		
	}

}