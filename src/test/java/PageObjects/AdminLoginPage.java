package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
	
	public static WebDriver driver;
	
	public AdminLoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtuId")
	WebElement txtusename;
	
	@FindBy(id="txtPword")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	
	public void SetUsername(String uname) {
		
		txtusename.sendKeys(uname);
	}
	
	public void SetPassword(String pword) {
		txtpassword.sendKeys(pword);
	}
	
	public void ClickLoginbtn() {
		btnLogin.click();
	}

}
