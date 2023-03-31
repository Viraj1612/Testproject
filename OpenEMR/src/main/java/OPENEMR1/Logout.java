package OPENEMR1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy(xpath = "//i[@id=\"user_icon\"]")
	private WebElement Account;
	
	@FindBy(xpath = "//li[@data-bind=\"click: logout\"]")
	private WebElement Logout;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Account()
	{
		Account.click();
	}
	public void Logout()
	{
		Logout.click();
	}	
}
