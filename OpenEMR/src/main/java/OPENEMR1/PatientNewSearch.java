package OPENEMR1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientNewSearch {
	
	@FindBy(xpath = "//div[text()=\"New/Search\"]")
	private WebElement NewSearch;
	
	public PatientNewSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NewSearch()
	{
		NewSearch.click();
	}
}
