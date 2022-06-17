package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver;
		//driver= new FirefoxDriver();
		driver= new ChromeDriver();
		driver.get("https://synkdup.com/user/login/jobseeker");
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("rutujachankeshwara12@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.quit();

	}

}
