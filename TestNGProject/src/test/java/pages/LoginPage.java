package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void loginMethod(String Username, String Password) {
		
		
		WebElement loginLink = driver.findElement(By.partialLinkText("Log "));
		loginLink.click();
		
		WebElement tbEmail = driver.findElement(By.name("user_login"));
		tbEmail.sendKeys(Username);
		
		WebElement tbPwd = driver.findElement(By.name("user_pwd"));
		tbPwd.sendKeys(Password);
		
		WebElement chRemember = driver.findElement(By.className("rememberMe"));
		chRemember.click();
		
		WebElement btnLogin = driver.findElement(By.name("btn_login"));
		btnLogin.click();
		
		WebElement error = driver.findElement(By.id("msg_box"));
		
		String actMsg = error.getText();
		String expMsg = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(expMsg, actMsg);
		
	}

}
