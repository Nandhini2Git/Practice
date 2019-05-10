import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Parallel 
{
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void testParallel(String browser)
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		
		if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		/*else if(browser.equals("chrome"))
			driver=new ChromeDriver();*/
		else
			driver=new InternetExplorerDriver();
	}
	
}
