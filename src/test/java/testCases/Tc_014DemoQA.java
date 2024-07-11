package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_014DemoQA {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//step 1
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://demoqa.com/buttons");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Click Me']")));
		
		System.out.println("Button is present");

		
		driver.close();
		
		driver.findElement(By.id("username")).sendKeys("ReGrow");
		
		
		
	}

}