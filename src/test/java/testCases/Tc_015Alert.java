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

public class Tc_015Alert {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement btn_scroll=driver.findElement(By.id("timerAlertButton"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",btn_scroll);
		
		driver.findElement(By.id("alertButton")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Function 1: Switch to the alert and click on OK
		driver.switchTo().alert().accept();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		WebElement btn=driver.findElement(By.id("confirmButton"));
		btn.click();
		
		//Function 2: Switch to the alert and click on CANCEL
		driver.switchTo().alert().dismiss();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Function 3: switching to the alert and getting the text
		btn.click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("promtButton")).click();
		
		//Function 4: switching to the alert and setting the text
		driver.switchTo().alert().sendKeys("We are a little out of time");
		driver.switchTo().alert().accept();
	}

}