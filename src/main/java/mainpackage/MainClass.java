package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MainClass {

	public WebDriver driver;
	@BeforeTest
	public void driverLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mycontactform.com/samples.php/");
	}
	
	@AfterTest
	public void driverCLose()
	{
		driver.close();
	}
}
