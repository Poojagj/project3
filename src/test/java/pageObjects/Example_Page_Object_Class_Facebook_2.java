package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Example_Page_Object_Class_Facebook_2 {

	WebDriver driver;
	
	Example_Page_Object_Class_Facebook_2(WebDriver d) // Constructor created--takes driver value as parameter
	{
		driver = d; // global driver takes value from d parameter
		
		PageFactory.initElements(d,this);  // to understand @FindBY annotation 

	}
	
	@FindBy(how = How.ID, using = "email")
	WebElement Username;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement Password;

	@FindBy(tagName = "button")
	WebElement LoginBtn;

	public void setUserName(String usrnm) {

		Username.sendKeys(usrnm);
	}

	public void setPassword(String pwrd) {

		Password.sendKeys(pwrd);
	}

	public void clickLoginBtn() {

		LoginBtn.click();
	}

}
