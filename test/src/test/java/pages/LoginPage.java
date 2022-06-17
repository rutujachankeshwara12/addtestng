package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
 
	private static WebElement element=null;
	
  public static WebElement textbox_email(WebDriver driver) {
	  element= driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")) ;
     return element;
  }	

  public static WebElement textbox_pass(WebDriver driver) {
	  element= driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")) ;
     return element;
  }	
  
  public static WebElement button(WebDriver driver) {
	  element= driver.findElement(By.xpath("//button[@type='submit']")) ;
     return element;
  }	
  
}
