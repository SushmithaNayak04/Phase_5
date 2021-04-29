package testsuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		

		System.setProperty("webdriver.chrome.driver", "F:\\SIMPLILEARN\\Program\\phase_5\\WebDriverProject\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\SIMPLILEARN\\Program\\phase_5\\WebDriverProject\\drivers\\geckodriver.exe");
        
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		String HubURL="http://192.168.56.1:4444/wd/hub";
		
		//WebDriver driver= new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new RemoteWebDriver(new URL(HubURL),cap);
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.quit();
	}

}
