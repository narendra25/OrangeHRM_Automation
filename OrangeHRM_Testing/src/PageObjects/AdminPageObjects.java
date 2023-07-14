package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class AdminPageObjects extends TestBase{
	public AdminPageObjects(){
		PageFactory.initElements(driver, this);
	}
	public void Click_On_AdminMenu() {
		WebElement AdminMenu=driver.findElement(By.xpath(prop.getProperty("AdminMenu")));
		AdminMenu.click();
	}
}
