package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.login;

public class login_Pf {
private static WebDriver driver= null;
	
	public static void main(String[] args) {
		login1();
	}

	public static void login1() {
		
		driver= new ChromeDriver();
		login l1=new login(driver);
		driver.get("https://synkdup.com/user/login/jobseeker");
		l1.setTextInBox1("rutujachankeshwara12@gmail.com");
		l1.setTextInBox2("123456");
		l1.clickOnButton();	
		
	}

}
