package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_008Flipkart2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		
		String project_path=System.getProperty("user.dir");
//		System.out.println(project_path);
		
		System.setProperty("webdriver.chrome.driver",project_path+"\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
//		List<WebElement> spanelem=driver.findElements(By.tagName("span"));
		
		driver.findElement(By.xpath("//a[text()='Become a Seller']")).click();
		

	}

}
