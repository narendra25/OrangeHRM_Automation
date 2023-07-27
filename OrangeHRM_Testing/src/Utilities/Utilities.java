package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

import TestBase.TestBase;

public class Utilities extends TestBase{
	public void screen(String stn) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile,new File("./OrangeHRM_Testing/Screenshots/"+stn+".png"));
	}
//	@BeforeClass
//	public static void deleteScreenshot() throws Throwable {
//		File directory = new File("./Screenshots");
//		java.nio.file.Files.cleanDirectory(directory);
//	}
	//passing random alphabetic 
	public static String generateRandomString(int length){
		return RandomStringUtils.randomAlphabetic(length);
	} 

	//for passing random numbers 
	public static String generateRandomNumber(int length){
		return RandomStringUtils.randomNumeric(length);
	} 
	//for passing alpha numeric
	public static String generateRandomAlphanumeric(int length) {
		return RandomStringUtils.randomAlphanumeric(length);
	}

	//add the dynamic wait 
	public void Wait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
public static WebElement WaitForElementPresent(WebDriver driver,By locator,int timeout) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	return driver.findElement(locator);
}

}
