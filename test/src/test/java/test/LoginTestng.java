 package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPageObjects;

public class LoginTestng {

private static WebDriver driver= null;

	@BeforeTest
   public void browsers() {
	  // driver= new ChromeDriver();
		driver= new ChromeDriver();	
   }
	
   @Test
	public void login() {
	   LoginPageObjects l1=new LoginPageObjects(driver);
	  driver.get("https://synkdup.com/user/login/jobseeker");
	   l1.setTextInBox1("rutujachankeshwara12@gmail.com");
		l1.setTextInBox2("123456");
		l1.clickOnButton();
		
//		driver.get("https://synkdup.com/user/login/jobseeker");
//		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("rutujachankeshwara12@gmail.com");
//		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
   
  @AfterTest
   public void close() {
	   driver.quit();
   }

}