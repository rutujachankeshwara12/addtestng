package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngMutiBrowser {
	 WebDriver driver= null;

	@Parameters("browserName")
	@BeforeTest
   public void browsers(String browserName) {
		System.out.println("Browser name is: "+ browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
   }
	
	 @Test
		public void login() {
		   driver.get("https://beta.synkdup.com/");
	       driver.findElement(By.xpath("//a[@class='px-2 pb-0 py-2 semi-bold']")).click();
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rutujachankeshwara12@gmail.com");
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }

	 @AfterTest
	   public void close() {
		   driver.quit();
	   }

}
