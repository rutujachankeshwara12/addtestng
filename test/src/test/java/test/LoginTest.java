package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginTest {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://synkdup.com/user/login/jobseeker");
		LoginPage.textbox_email(driver).sendKeys("rutujachankeshwara12@gmail.com");
		LoginPage.textbox_pass(driver).sendKeys("123456");
		LoginPage.button(driver).click();
}
}