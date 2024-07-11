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

public class Tc_016TabSwitch {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/browser-windows");
		
		
		WebElement next_btn=driver.findElement(By.id("windowButton"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",next_btn);
		
		driver.findElement(By.id("tabButton")).click();
		
		String curr_tab=driver.getWindowHandle();
		
		Set<String> all_tabs=driver.getWindowHandles();
		
		for(String ele:all_tabs)
		{
			if(!ele.equals(curr_tab))
			{
				driver.switchTo().window(ele);
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}

}