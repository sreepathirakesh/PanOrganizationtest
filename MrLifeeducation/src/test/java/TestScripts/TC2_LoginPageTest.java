package TestScripts;

import TestPages.HomePage;
import TestPages.LoginPage;
import TestUtils.TestBase;

public class TC2_LoginPageTest extends TestBase {
	public static HomePage homePage;
	public static LoginPage loginPage;

	public static void main(String[] args) {
		invokeBrowser();
		homePage=new HomePage(driver);
		homePage.clickLoginLink();
		loginPage=new LoginPage(driver);
		loginPage.enterLoginUserName("9100585881");
		loginPage.enterLoginPassword("Rakesh1@");
		loginPage.submitSigninutton();
		loginPage.clickForgotPassLink();
		

	}

}
