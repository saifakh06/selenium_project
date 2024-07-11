package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_012Facebook3 {
	public static void main (String args[]) {
		WebDriver driver;
		System.setProperty( "webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		String pgsrc=driver.getPageSource();
//		System.out.println(pgsrc);
		
//		String curr_tab=driver.getWindowHandle();
//		System.out.println(curr_tab);
		
		Set<String> allTabs=driver.getWindowHandles();
		
		for(String each:allTabs)
		{
			System.out.println(each);
		}
		
		
		
	}

}