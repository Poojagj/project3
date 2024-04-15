package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example1_PageObjectClass_Facebook {
	
	WebDriver driver;
	
	By UserName_Loc =By.id("email");//locator
	By Password_loc=By.id("pass");
	By LoginBtn_Loc=By.tagName("button");
	
	Example1_PageObjectClass_Facebook(WebDriver d){
		
		driver =d;//global var-driver takes value from 'd' parameter --> takes value from driver of main Class
		
	}
	
	
	//Action Methods
	
	public void setUserName(String usrnm) {
		driver.findElement(UserName_Loc).sendKeys(usrnm);
	}
	
	public void setPassword(String pwrd) {
		driver.findElement(Password_loc).sendKeys(pwrd);
	}
	
	public void clickLoginBtn() {
		
		driver.findElement(LoginBtn_Loc).click();
	}
	
	

}
