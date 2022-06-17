package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JdPage {

WebDriver driver;
	
	@FindBy(id = "name")
	WebElement txt_name;

	@FindBy(id = "mail")
	WebElement txt_email;
	
	@FindBy(id = "phoneNumber")
	WebElement phone;
	
	@FindBy(id="submit-apply")
	WebElement button;
	
	public JdPage(WebDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		Thread.sleep(3000);
	}
	 
	public void setTextInBox1(String text) {
		txt_name.sendKeys(text);
	}
	
	public void setTextInBox2(String text) {
		txt_email.sendKeys(text);
	}
	
	public void setTextInBox3(String text) {
		phone.sendKeys(text);
	}
	
	public void clickOnButton() {
		button.click();
	}
}
