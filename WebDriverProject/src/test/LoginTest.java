package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	WebDriver driver;
	
	public static void main(String[] args) {
		LoginTest obj = new LoginTest();
		obj.Setup();
		obj.Login();
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "F:\\SIMPLILEARN\\Program\\phase_5\\WebDriverProject\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "F:\\SIMPLILEARN\\Program\\phase_5\\WebDriverProject\\drivers\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FireFoxDriver(); //for firefox
		
		driver.get("https://www.simplilearn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);*/
		
		/*WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement tbEmail = driver.findElement(By.name("user_login"));
		tbEmail.sendKeys("abc@xyz.com");
		
		WebElement tbPwd = driver.findElement(By.name("user_pwd"));
		tbPwd.sendKeys("abc123");
		
		WebElement chRemember = driver.findElement(By.className("rememberMe"));
		chRemember.click();
		
		WebElement btnLogin = driver.findElement(By.name("btn_login"));
		btnLogin.click();*/
	}
	
	public void Setup(){
		System.setProperty("webdriver.chrome.driver", "F:\\SIMPLILEARN\\Program\\phase_5\\WebDriverProject\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "F:\\SIMPLILEARN\\Program\\phase_5\\WebDriverProject\\drivers\\geckodriver.exe");

		 driver = new ChromeDriver();
		//WebDriver driver = new FireFoxDriver(); //for firefox
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
	}
	
	public void Login(){
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement tbEmail = driver.findElement(By.name("user_login"));
		tbEmail.sendKeys("abc@xyz.com");
		
		WebElement tbPwd = driver.findElement(By.name("user_pwd"));
		tbPwd.sendKeys("abc123");
		
		WebElement chRemember = driver.findElement(By.className("rememberMe"));
		chRemember.click();
		
		WebElement btnLogin = driver.findElement(By.name("btn_login"));
		btnLogin.click();
	}

}
