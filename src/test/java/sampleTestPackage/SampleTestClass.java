package sampleTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mainpackage.MainClass;
import pageObjectPackage.SignUpObjects;

public class SampleTestClass extends MainClass{
	//WebDriver driver;
	
	@Test
	void sampleForm() {
		SignUpObjects obj=new SignUpObjects(driver);
		obj.signUpCode();
	
		}
}
