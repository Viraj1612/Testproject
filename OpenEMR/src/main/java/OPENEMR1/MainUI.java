package OPENEMR1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainUI {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//div[text()=\"Patient\"]")
	private WebElement Patient;
		
	public MainUI(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Patient()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Patient).perform();
	}	
	public void Patient1()
	{
		Patient.click();
	}
	
}
