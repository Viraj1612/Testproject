package OPENEMR1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath = "//a[text()='https://demo.openemr.io/openemr']")
	private WebElement Loginlink;

	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement Password;
	
	@FindBy(xpath = "//button[text()=\"Login\"]")
	private WebElement Login;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Loginlink()
	{
		Loginlink.click();
	}	
	public void Username()
	{
		Username.sendKeys("admin");
	}
	public void Password()
	{
		Password.sendKeys("pass");
	}
	public void Login()
	{
		Login.click();
	}	
}
