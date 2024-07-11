package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_004Path {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		String pro_path=System.getProperty("user.dir");
//		System.out.println(pro_path);
		
		System.setProperty("webdriver.chrome.driver",pro_path+"\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","path");
	}

}
