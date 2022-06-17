package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
	
	WebDriver driver=null;
	By textbox_email= By.xpath("//input[@id='exampleInputEmail1']");
	By textbox_pass= By.xpath("//input[@id='exampleInputPassword1']");
	By button= By.xpath("//button[@type='submit']");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextInBox1(String text) {
		driver.findElement(textbox_email).sendKeys(text);
	}
	
	public void setTextInBox2(String text) {
		driver.findElement(textbox_pass).sendKeys(text);
	}
	
	public void clickOnButton() {
		driver.findElement(button).click();
	}
}
