package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail1']")
	WebElement txt_email;

	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement button;
	
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setTextInBox1(String text) {
		txt_email.sendKeys(text);
	}
	
	public void setTextInBox2(String text) {
		txt_pass.sendKeys(text);
	}
	
	public void clickOnButton() {
		button.click();
	}
}
