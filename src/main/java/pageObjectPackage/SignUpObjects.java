package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpObjects {
	WebDriver driver;
	@FindBy(xpath="//input[@name='name']") 
	public WebElement inp_name;
	
	@FindBy(xpath="//input[@name='email']") 
	public WebElement inp_email;
	
	@FindBy(xpath="//input[@name='user_signup']") 
	public WebElement inp_signup;
	
	public SignUpObjects(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void signUpCode()
	{
		driver.findElement(By.xpath("//a[@href='https://www.mycontactform.com/signup.php']")).click();
		inp_name.sendKeys("krishnaraj");
		inp_email.sendKeys("a.krishraj14@gmail.com");
		inp_signup.sendKeys("Krishnaraj Anbalagan");

	}
}
