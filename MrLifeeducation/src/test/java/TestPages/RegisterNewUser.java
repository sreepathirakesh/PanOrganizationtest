package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterNewUser {
	 public static WebDriver driver;
	 public RegisterNewUser(WebDriver driver)
		{
		 RegisterNewUser.driver=driver;
		}
	 
	 
		By registerpageName=By.id("name");
	
		By registerpagefathername=By.id("father");
		By registerpageDOB=By.xpath("//*[@id=\"dob\"]");
		By registerpageADARNo=By.xpath("//*[@id=\"Aadhaar\"]");
		By registerpagePANNO=By.xpath("//*[@id=\"panno\"]");
		By registerpageMobileNo=By.xpath("//*[@id=\"mobile\"]");
		By registerpageMobileno2=By.xpath("//*[@id=\"mobile2\"]");
		//By registerpageWhatsappNo=By.xpath("//*[@id=\"whatsapp\"]");
		By registerpageEmailid=By.xpath("//*[@id=\"emailid\"]");
		By registerpageShopName=By.xpath("//*[@id=\"shopname\"]");
		By registerpageCurrentAddress=By.xpath("//*[@id=\"c_Address\"]");
		By registerpageCurrentDist=By.xpath("//*[@id=\"c_city\"]");
		//By registerpageCurrentState=By.name("RememberMe");
		By registerpageCurrentPIN=By.xpath("//*[@id=\"c_pin\"]");
		By registerpageSameaddressCheckbox=By.xpath("//*[@id=\"home\"]/div[1]/div/div/div/form/div/div[2]/div[2]/fieldset[2]/legend/div/div/label/input");
		By registerpagePermanentAddress=By.xpath("//*[@id=\"p_Address\"]");
		By registerpagePermanentDist=By.xpath("//*[@id=\"p_city\"]");
		//By registerpagePermanentState=By.name("RememberMe");
		By registerpagePermanentPIN=By.xpath("//*[@id=\"p_pin\"]");
		By registerpageBankAccountName=By.xpath("//*[@id=\"bank_ac_name\"]");
		By registerpageBankAccountNo=By.xpath("//*[@id=\"bank_ac_no\"]");
		By registerpageBankName=By.xpath("//*[@id=\"bank\"]");
		By registerpageBankIFSC=By.xpath("//*[@id=\"ifsc\"]");
		By registerpageAttachPhoto=By.xpath("//*[@id=\"home\"]/div[1]/div/div/div/form/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/button");
		By registerpageAttachAdar=By.name("RememberMe");
		By registerpageAttachPan=By.name("RememberMe");
		By registerpageSubmit=By.name("RememberMe");
		public void enterRegisterName(String regName)
		{
			driver.findElement(registerpageName).sendKeys(regName);
		}
		public void enterRegisterFatherName(String regFatherName)
		{
			driver.findElement(registerpagefathername).sendKeys(regFatherName);
		}
		public void enterRegisterDOB(String regDOB)
		{
			driver.findElement(registerpageDOB).sendKeys(regDOB);
		}
		public void enterRegisterAdar(String regADAR)
		{
			driver.findElement(registerpageADARNo).sendKeys(regADAR);
		}
		public void enterRegisterPanNo(String panno)
		{
			driver.findElement(registerpagePANNO).sendKeys(panno);
		}
		public void enterFirstMobile(String fmobileno)
		{
			driver.findElement(registerpageMobileNo).sendKeys(fmobileno);
		}
		public void enterSecondMobileNo(String smobileno)
		{
			driver.findElement(registerpageMobileno2).sendKeys(smobileno);
		}
		public void eneterWhatsNo()
		{
			Select se = new Select(driver.findElement(By.xpath("//*[@id=\"whatsapp\"]")));
			
			// Select the option by index
			se.selectByIndex(1);
			//se.selectByValue("9100585881");
			//driver.findElement(registerpageWhatsappNo).sendKeys(whatsupNo);
		}
		public void enterRegisterEmail(String registerEmail)
		{
			driver.findElement(registerpageEmailid).sendKeys(registerEmail);
		}
		public void enterregShopName(String ShopName)
		{
			driver.findElement(registerpageShopName).sendKeys(ShopName);
		}
		public void enterregCurrentAddress(String caddress)
		{
			driver.findElement(registerpageCurrentAddress).sendKeys(caddress);
		}
		public void enterRegDist(String regDist)
		{
			driver.findElement(registerpageCurrentDist).sendKeys(regDist);
		}
		public void Register_State()
		{
			Select se=new Select(driver.findElement(By.xpath("//*[@id=\"c_state\"]")));
			se.selectByIndex(32);
			//se.selectByValue("Telangana");
		}
		public void enterRegPIN(String regPin)
		{
			driver.findElement(registerpageCurrentPIN).sendKeys(regPin);
		}
		public void eneterSameAsCurrentAddress()
		{
			driver.findElement(registerpageSameaddressCheckbox).click();
		}
		//perminent Address.
		public void enterregPertAddress(String Peraddress)
		{
			driver.findElement(registerpagePermanentAddress).sendKeys(Peraddress);
		}
		public void enterPerRegDist(String regPerDist)
		{
			driver.findElement(registerpagePermanentDist).sendKeys(regPerDist);
		}
		public void PerRegister_State()
		{
			Select se=new Select(driver.findElement(By.xpath("//*[@id=\"p_state\"]")));
			se.selectByIndex(32);
			//se.selectByValue("Telangana");
		}
		public void enterPerRegPIN(String regregPerPin)
		{
			driver.findElement(registerpagePermanentPIN).sendKeys(regregPerPin);
		}
		
		//Bank Account Details
		public void enterregBankAccountName(String bankAcName)
		{
			driver.findElement(registerpageBankAccountName).sendKeys(bankAcName);
		}
		public void enterregBankAccountNo(String bankAcNo)
		{
			driver.findElement(registerpageBankAccountNo).sendKeys(bankAcNo);
		}
		public void enterregBankName(String bankName)
		{
			driver.findElement(registerpageBankName).sendKeys(bankName);
		}
		public void enterregBankIFSC(String bankIFSC)
		{
			driver.findElement(registerpageBankIFSC).sendKeys(bankIFSC);
		}
		public void UploadPhoto() {
			
			//*[@id="home"]/div[1]/div/div/div/form/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/button
		WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div/div/div/form/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/button"));
		chooseFile.sendKeys("C:\\Users\\user\\pic.jpg");
		driver.findElement(registerpageAttachPhoto).click();
		}
		
}
