package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base1 {
	
	public WebDriver OpenEdgeBrowser() 
	{
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	public WebDriver OpenFirefoxBrowser()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	public WebDriver OpenSafariBrowser()
	{
		WebDriver driver = new SafariDriver();
		return driver;
	}
}
