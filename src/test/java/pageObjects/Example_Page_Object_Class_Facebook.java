package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example_Page_Object_Class_Facebook {

	WebDriver driver; // Creating reference variable for WebDriver

	By Username = By.id("email");
	By Password = By.xpath("//input[@id='pass']");
	By LoginBtn = By.tagName("button");

	Example_Page_Object_Class_Facebook(WebDriver d) // Constructor created--takes driver value as parameter
	{
		driver = d; // global driver takes value from d parameter

	}

	
	public void setUserName(String usrnm) {

		driver.findElement(Username);
	}

	public void setPassword(String pwrd) {

		driver.findElement(Password);
	}
	
	public void clickLoginBtn() {
		
		driver.findElement(LoginBtn).click();
	}
}
