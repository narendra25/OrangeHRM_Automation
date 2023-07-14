package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import TestBase.TestBase;

public class TC_002_Login extends TestBase {
	LoginPageObjects LPO;
	@Test(priority=2)
	public void TC_002_Login() throws InterruptedException {
		LPO=new LoginPageObjects();
		LPO.OpenBrowser();
		Thread.sleep(4000);
		LPO.Enter_The_UserName();
		Thread.sleep(4000);
		LPO.Enter_The_Password();
		Thread.sleep(4000);
		LPO.Click_On_Login_Button();
		LPO.CloseBrowser();
	}

}
