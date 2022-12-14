package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 public static WebDriver driver;
	 public LoginPage(WebDriver driver)
		{
		 LoginPage.driver=driver;
		}
	 By loginUserName=By.xpath("//input[@id='inputEmail']");
	 By loginPassword=By.xpath("//input[@id='Password']");
	 By signinButton=By.xpath("//button[@type='button']");
	 By forgotPass=By.xpath("//a[@href='/account/Forgetpwd']");
	 public void enterLoginUserName(String loginName)
	 {
		 driver.findElement(loginUserName).sendKeys(loginName);
	 }
	 public void enterLoginPassword(String loginPass)
	 {
		 driver.findElement(loginPassword).sendKeys(loginPass);
	 }
	 public void submitSigninutton()
	 {
		 driver.findElement(signinButton).click();
	 }
	 public void clickForgotPassLink()
	 {
		 driver.findElement(forgotPass).click();
	 }

}
