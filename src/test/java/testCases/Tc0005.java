package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc0005 {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\\\JavaCodes\\\\SeleniumForMarch2024\\\\SeleniumForMarch2024\\\\Drivers\\\\chromedriver_124.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.scaler.com/topics/javascript-disable-button/");
		driver.manage().window().maximize();
		WebElement logo= driver.findElement(By.className("Header_header_signin__H8u_q cursor hide-in-tablet"));
		boolean res = logo.isEnabled();
		if(res) {
			System.out.println("Button is Enabled");
		}else {
			System.out.println("Button is disabled");
		}
		boolean res2 =logo. isSelected();
		System.out.println(res2);
		driver.close();
}

	
}


