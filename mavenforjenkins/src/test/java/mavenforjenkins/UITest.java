package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Parameters("Browser")
	@Test
	public  void startBrowser(String browserName) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		System.out.println("Parameter Value is"+browserName);
		if(browserName.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pandu.damera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pandu.damera\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	    driver.get("https://www.google.com/");	
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());
	    System.out.println(driver.getTitle());
	    driver.quit();

	}

}
