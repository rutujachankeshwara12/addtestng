package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class testngwithExtentReport {
	public ExtentReports extent;
	public ExtentSparkReporter spark; 
	WebDriver driver;
	
	@BeforeSuite
	public void beforsuite() {
	    extent = new ExtentReports();
	  spark = new ExtentSparkReporter("target/extent.html");
		extent.attachReporter(spark);

	}

	@BeforeTest
	public void befortest() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		driver= new ChromeDriver();
		driver.get("https://synkdup.com/user/login/jobseeker");
	}
	@Test
	public void login() throws Exception {
		ExtentTest test= extent.createTest("Verify login functionality");
		test.info("login");
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("rutujachankeshwara12@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.addScreenCaptureFromPath(capture(driver));
	}
	
	public static String capture(WebDriver driver) throws IOException {
		File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File des= new File("C:/Users/LENOVO/eclipse-workspace/test/images/ss"+System.currentTimeMillis()+".png");
		String path= des.getAbsolutePath();
		FileUtils.copyFile(srcfile, des);
		return path;
	}

	@AfterTest
	public void aftertest() {
		extent.flush();
	}

	@AfterSuite
	public void afetrsuite() {
		driver.close();
	}

}
