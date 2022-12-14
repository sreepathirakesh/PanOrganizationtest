package TestScripts;

import TestPages.HomePage;
import TestPages.RegisterNewUser;



public class TC1_Register extends TestUtils.TestBase{
	public static HomePage homePage;
	public static RegisterNewUser registerNewUser;

	public static void main(String[] args) {
		
		//invokeBrowser();
		invokeBrowser();
		
				homePage=new HomePage(driver);
			
		homePage.clickRegisterLink();
		System.out.println("First............");
		
				registerNewUser=new RegisterNewUser(driver);
			
		System.out.println("Second............");
		registerNewUser.enterRegisterName("rakeshs");
		registerNewUser.enterRegisterFatherName("Rajaiah");
		registerNewUser.enterRegisterDOB("20-jan-1985");
		registerNewUser.enterRegisterAdar("724600128329");
		registerNewUser.enterRegisterPanNo("DBAPS4435R");
		registerNewUser.enterFirstMobile("9100585881");
		registerNewUser.enterSecondMobileNo("9866993043");
		registerNewUser.eneterWhatsNo();
		registerNewUser.enterRegisterEmail("rakesh.charana@gmail.com");
		registerNewUser.enterregShopName("Jyothi Meeseva");
		registerNewUser.enterregCurrentAddress("1-84/b vellampally tekumatla jayashankar");
		registerNewUser.Register_State();
		registerNewUser.enterRegDist("Jayashankar Bhupalapalli");
		registerNewUser.enterRegPIN("506356");
		registerNewUser.eneterSameAsCurrentAddress();
	/*egisterNewUser.enterregPertAddress("1-84/b vellampally tekumatla jayashanka");
		registerNewUser.PerRegister_State();
		registerNewUser.enterPerRegDist("Jayashankar Bhupalapalli");
		registerNewUser.enterPerRegPIN("506356");*/
		registerNewUser.enterregBankAccountName("Sreepathi Rakesh");
		registerNewUser.enterregBankAccountNo("20130118299");
		registerNewUser.enterregBankName("Sbi");
		registerNewUser.enterregBankIFSC("SBIN0003422");
		System.out.println("Befor");
		registerNewUser.UploadPhoto();
		System.out.println("After");
	
}
}
