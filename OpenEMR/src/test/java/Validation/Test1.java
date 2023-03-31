package Validation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base1;
import OPENEMR1.Login;
import OPENEMR1.Logout;
import OPENEMR1.MainUI;
import OPENEMR1.PatientNewSearch;

public class Test1 extends Base1 {
	
	WebDriver driver;
	Login login;
	Logout logout;
	MainUI mainui;
	PatientNewSearch patientnewsearch;
	
	@Parameters("browser")
	
	@BeforeTest
	public void OpenBrowser(String Browsername)
	{
		System.out.println(Browsername);
		if(Browsername.equals("Edge"))
		{
		driver=OpenEdgeBrowser();
		}
		if(Browsername.equals("Firefox"))
		{
	    driver=OpenFirefoxBrowser();
		}
		driver.manage().window().maximize();
		driver.get("https://demo.openemr.io/openemr/interface/login/login.php?site=default");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@BeforeClass
	public void BeforeClass()
	{
		login= new Login(driver);
		logout= new Logout(driver);
		mainui = new MainUI(driver);
		patientnewsearch = new PatientNewSearch(driver);
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		//login.Loginlink();
		login.Username();
		login.Password();
		login.Login();
	}
	@Test
	public void Test()
	{
		mainui.Patient1();
		patientnewsearch.NewSearch();		
	}
	@AfterMethod
	public void AfterMethod()
	{
		logout.Account();
		logout.Logout();
	}
	@AfterClass
	public void AfterClass()
	{
		login=null;
		logout=null;
		mainui=null;
		patientnewsearch=null;
	}
	@AfterTest
	public void AfterTest()
	{
		driver.close();
		System.gc();
	}
}
