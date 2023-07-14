package AdminTestCases;

import org.testng.annotations.Test;

import PageObjects.AdminPageObjects;
import PageObjects.LoginPageObjects;

public class TC_AP_001 {
	LoginPageObjects LPO;
	AdminPageObjects APO;
	@Test(description="Click On Admin Menu")
	public void TC_AP_001() throws InterruptedException {
		LPO=new LoginPageObjects();
		APO=new AdminPageObjects();
		LPO.OpenBrowser();
		Thread.sleep(4000);
		LPO.Enter_The_UserName();
		Thread.sleep(4000);
		LPO.Enter_The_Password();
		Thread.sleep(4000);
		LPO.Click_On_Login_Button();
		Thread.sleep(4000);
		APO.Click_On_AdminMenu();
		Thread.sleep(4000);
		LPO.CloseBrowser();
	}

}
