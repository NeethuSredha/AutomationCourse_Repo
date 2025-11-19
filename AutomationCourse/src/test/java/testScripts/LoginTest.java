package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase{
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() {
		WebElement txtUserName=driver.findElement(By.id("user-name"));
		txtUserName.sendKeys("standard_user");
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("secret_sauce");
		
		WebElement buttonLogin=driver.findElement(By.id("login-button"));
		buttonLogin.click();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInValidPassword() {
		WebElement txtUserName=driver.findElement(By.id("user-name"));
		txtUserName.sendKeys("locked_out_user");
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("secret_sauce1");
		
		WebElement buttonLogin=driver.findElement(By.id("login-button"));
		buttonLogin.click();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndValidPassword() {
		WebElement txtUserName=driver.findElement(By.id("user-name"));
		txtUserName.sendKeys("locked_out_user1");
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("secret_sauce");
		
		WebElement buttonLogin=driver.findElement(By.id("login-button"));
		buttonLogin.click();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndInValidPassword() {
		WebElement txtUserName=driver.findElement(By.id("user-name"));
		txtUserName.sendKeys("problem_user2");
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("secret_sauce2");
		
		WebElement buttonLogin=driver.findElement(By.id("login-button"));
		buttonLogin.click();
	}
}
