package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POC_Parameterization_NOP {
	
	WebDriver driver;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txt_username;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txt_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_btn;
	
	
	public POC_Parameterization_NOP(WebDriver d){
		
		driver=d;
		PageFactory.initElements(driver, this);
		
	}

	public void setUsername(String username) {
		
		txt_username.clear();
		txt_username.sendKeys(username);

	}

	public void setPassword(String password) {
		txt_password.clear();
		txt_password.sendKeys(password);
	}

	public void click_LoginBtn() {
		login_btn.click();
	}
	
	

}
