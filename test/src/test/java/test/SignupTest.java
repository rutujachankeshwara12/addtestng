package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignupPage;

public class SignupTest {

	private static WebDriver driver= null;

	@BeforeTest
   public void browsers() {
	  // driver= new ChromeDriver();
		driver= new ChromeDriver();	
   }
	
	@Test
	public void signup() {
		SignupPage s1= new SignupPage(driver);
		driver.get("https://beta.synkdup.com/");
		s1.Text();
		s1.setTextInBox1("ada");
		s1.setTextInBox2("asd");
		s1.setTextInBox3("testmar17@grr.la");
		s1.setTextInBox4("2132132112");
		s1.setTextInBox5("123456");
		s1.setTextInBox6("123456");
		s1.clickOnButton();
}
	
	@AfterTest
	   public void close() {
		   driver.quit();
	   }
}
