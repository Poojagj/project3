package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_FBLogin {
	
	WebDriver driver;

	public PO_FBLogin(WebDriver d){
		
		driver =d;                                //global var-driver takes value from 'd' parameter --> takes value from driver of main Class
		PageFactory.initElements(d, this);         // to understand @FindBy annotations
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement UserName_ele;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement Password_ele;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement Loginbtn_ele;
	
	public void setUserName(String usrnm) {
		UserName_ele.sendKeys(usrnm);
	}
	
	public void setPassword(String pwrd) {
		Password_ele.sendKeys(pwrd);
	}
	
	public void clickLoginBtn() {
		Loginbtn_ele.click();
	
	}

}
