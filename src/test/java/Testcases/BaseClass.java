package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Utilities.ReadConfig;

public class BaseClass {
	
	public WebDriver driver;
	
	ReadConfig rc=new ReadConfig();
	public String url=rc.getApplicationURL();
	
	@BeforeClass
	@Parameters("browser")
	public void OpenApplication(String br) {
	
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.get("http://primusbank.qedgetech.com/");
		
		
	}
	
	public void CloseApplication() {
		driver.close();
	}

}
