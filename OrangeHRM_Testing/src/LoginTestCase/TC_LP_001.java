package LoginTestCase;

import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import TestBase.TestBase;

public class TC_LP_001 extends TestBase{
	LoginPageObjects LPO;
	@Test(priority=2)
	public void TC_OO1_Login() throws InterruptedException {
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
