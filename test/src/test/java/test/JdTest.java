package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageFactory.JdPage;

public class JdTest {
private static WebDriver driver= null;
	
	public static void main(String[] args) throws Exception {
		jd();
	}

	public static void jd() throws Exception {
		
		driver= new ChromeDriver();
		JdPage j1=new JdPage(driver);
		driver.get("https://beta.amazjobs.com/findjobs");
		j1.setTextInBox1("jsdkjshdk");
		j1.setTextInBox2("test@grr.la");
		j1.setTextInBox3("1234567890");
		j1.clickOnButton();	
		
	}


}
