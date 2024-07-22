package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver", "D:\\JavaCodes\\SeleniumForMarch2024\\SeleniumForMarch2024\\Drivers\\chromedriver_125.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 //driver.findElement(By.name("q")).sendKeys("Peanut Butter",Keys.ENTER);
		// driver.navigate().back();
		 WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
		 login.click();
		 WebElement mobil=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 mobil.click();
		 mobil.sendKeys("6200411361");
		 WebElement button=driver.findElement(By.xpath("//*[text()='Request OTP']"));
		 button.click();
		 //driver.close();
		 


	}

}
