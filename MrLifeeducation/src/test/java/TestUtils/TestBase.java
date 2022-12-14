package TestUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		System.out.println("first");
		driver=new ChromeDriver();
		System.out.println("first......");
		driver.get("https://www.securemrlifeeducation.com/");
		driver.manage().window().maximize();
		
	}

}
