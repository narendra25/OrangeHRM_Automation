package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import TestBase.TestBase;
@Listeners(Listner_Demo.ListnerTest.class)
public class LoginPageObjects extends TestBase{
	public LoginPageObjects(){
		PageFactory.initElements(driver, this);
	}
		//Enter The User Name 
	//@Parameters("Username")
		//public void Enter_The_UserName(String Username) {
			public void Enter_The_UserName() {
			WebElement UserName=driver.findElement(By.xpath(prop.getProperty("UserName")));
			//UserName.sendKeys(Username);
			UserName.sendKeys(prop.getProperty("username"));
			Assert.assertTrue(false);
		}
		
		//Enter The Password
		public void Enter_The_Password() {
			WebElement Password=driver.findElement(By.xpath(prop.getProperty("Password")));
			Password.sendKeys(prop.getProperty("password"));
		}
		
		//Click On Login Button
		public void Click_On_Login_Button() {
			WebElement LoginButton=driver.findElement(By.xpath(prop.getProperty("LoginButton")));
			LoginButton.click();
		}
}
