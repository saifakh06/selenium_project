package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_017FrameSwitch {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		WebElement txt=driver.findElement(By.id("sampleHeading"));
		
		System.out.println(txt.getText());
		
		driver.close();
		
	}

}