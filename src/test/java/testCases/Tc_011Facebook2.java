package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_011Facebook2 {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement login=driver.findElement(By.name("logiN"));
		String att1=login.getAttribute("class");
		
		System.out.println("Button's class:"+att1);
		
		System.out.println("Button's data-testid: "+ login.getAttribute("data-testid"));
		
		String tagName=login.getTagName();
		System.out.println("Tag Name is "+tagName);
		
		System.out.println("Text:"+login.getText());
		
		
	}

}