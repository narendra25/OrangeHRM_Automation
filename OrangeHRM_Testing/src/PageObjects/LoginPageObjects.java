package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class LoginPageObjects extends TestBase{
	 //Enter The User Name 
		public static void Enter_The_UserName() {
			WebElement UserName=driver.findElement(By.xpath(prop.getProperty("UserName")));
			UserName.sendKeys(prop.getProperty("username"));
		}
		
		//Enter The Password
		public static void Enter_The_Password() {
			WebElement Password=driver.findElement(By.xpath(prop.getProperty("Password")));
			Password.sendKeys(prop.getProperty("password"));
		}
		
		//Click On Login Button
		public static void Click_On_Login_Button() {
			WebElement LoginButton=driver.findElement(By.xpath(prop.getProperty("LoginButton")));
			LoginButton.click();
		}
}
