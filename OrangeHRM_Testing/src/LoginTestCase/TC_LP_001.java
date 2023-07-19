package LoginTestCase;

import java.io.IOException;


import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import TestBase.TestBase;
import Utilities.Utilities;

public class TC_LP_001 extends TestBase{
	LoginPageObjects LPO;
	Utilities UT;
	@Test(description="Login test case")
	public void TC_OO1_Login() throws InterruptedException, IOException {
		LPO=new LoginPageObjects();
		LPO.OpenBrowser();
		UT.Wait();
		//Thread.sleep(4000);
		LPO.Enter_The_UserName();
		UT.Wait();
		//Thread.sleep(4000);
		LPO.Enter_The_Password();
		UT.Wait();
		//Thread.sleep(4000);
		LPO.Click_On_Login_Button();
		UT.Wait();
		LPO.CloseBrowser();
	}
}
