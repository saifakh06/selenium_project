package testCases;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_018SelectClass {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_125.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/select-menu");
		
		//Step 1- find select tag
		WebElement sel=driver.findElement(By.id("oldSelectMenu"));
		
		//step 2 - create object of select class
		Select sc=new Select(sel);
		
		//select values in the dropdown
		//type 1
		sc.selectByVisibleText("Purple");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.selectByIndex(8);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.selectByValue("10");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> all_options=sc.getOptions();
		
		for(WebElement op:all_options) {
			System.out.println(op.getText());
		}
		
		
		//driver.close();
		
	}

}