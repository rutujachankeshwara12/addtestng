package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver=null;
	By text= By.linkText("Signup");
	By fname= By.id("fname");
	By lname= By.id("lname");
	By email= By.id("email-address");
	By pnumber= By.id("phoneno");
	By pass= By.id("password");
	By cpass= By.id("confirm_password");
	By button= 	By.xpath("//input[@id='formSubmit']");
	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Text() {
		driver.findElement(text).click();
	}
	
	public void setTextInBox1(String text) {
		driver.findElement(fname).sendKeys(text);
	}
	
	public void setTextInBox2(String text) {
		driver.findElement(lname).sendKeys(text);
	}
	
	public void setTextInBox3(String text) {
		driver.findElement(email).sendKeys(text);
	}
	
	public void setTextInBox4(String text) {
		driver.findElement(pnumber).sendKeys(text);
	}
	
	public void setTextInBox5(String text) {
		driver.findElement(pass).sendKeys(text);
	}
	
	public void setTextInBox6(String text) {
		driver.findElement(cpass).sendKeys(text);
	}
	
	public void clickOnButton() {
		driver.findElement(button).click();
	}

	
}
