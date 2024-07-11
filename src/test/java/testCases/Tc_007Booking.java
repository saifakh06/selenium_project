package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_007Booking {

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		
//		String project_path=System.getProperty("user.dir");
//		System.out.println(project_path);
		
		System.setProperty("webdriver.chrome.driver","D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_124.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement place=driver.findElement(By.id(":re:"));
		place.sendKeys("Jamshedpur"+Keys.ENTER);
		
		WebElement dateButton=driver.findElement(By.className("a1139161bf"));
		dateButton.click();
		
		WebElement startDate=driver.findElement(By.xpath("//span[@data-date='2024-04-11']"));
		startDate.click();
		
		WebElement endDate=driver.findElement(By.xpath("//span[@data-date='2024-04-19']"));
		endDate.click();
		
		
		
		

	}

}
