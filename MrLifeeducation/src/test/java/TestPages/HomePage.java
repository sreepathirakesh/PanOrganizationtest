package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
	public static WebDriver driver;
	public HomePage(WebDriver driver)
	{
		HomePage.driver=driver;
	}
	By registerlink=By.xpath("//u");
	
	public void clickRegisterLink()
	{
		driver.findElement(registerlink).click();
	}
	By loginLink=By.xpath("//*[@id=\"topNavbar\"]/ul/li[7]/a");
	public void clickLoginLink()
	{
		driver.findElement(loginLink).click();
	}

}
