package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPageObjects;

public class LoginPageTest {
	
	private static WebDriver driver= null;
	
	public static void main(String[] args) {
		login();
	}

	public static void login() {
		
		driver= new ChromeDriver();
		LoginPageObjects l1=new LoginPageObjects(driver);
		driver.get("https://synkdup.com/user/login/jobseeker");
		l1.setTextInBox1("rutujachankeshwara12@gmail.com");
		l1.setTextInBox2("123456");
		l1.clickOnButton();
		
		
	}
}
