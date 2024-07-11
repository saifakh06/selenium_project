package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_001 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		String pro_path=System.getProperty("user.dir");
//		System.out.println(pro_path);
		
		System.setProperty("webdriver.chrome.driver", pro_path+"\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();
		System.out.println("The title is "+title);
		
		String curr_url=driver.getCurrentUrl();
		System.out.println("The url is "+curr_url);
	
		driver.close();
		
		
		
		
		
	}

}
