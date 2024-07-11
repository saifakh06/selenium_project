package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_006Flipkart {

	public static void main(String[] args) 
	{
		
		WebDriver driver;
		
		String project_path=System.getProperty("user.dir");
//		System.out.println(project_path);
		
		System.setProperty("webdriver.chrome.driver",project_path+"\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search_box=driver.findElement(By.name("q"));
		
		WebElement seller=driver.findElement(By.linkText("Become a Seller"));
		System.out.println(seller.getText());
		
//		search_box.sendKeys("shoes"+Keys.ENTER);
		
//		driver.close();

	}

}
