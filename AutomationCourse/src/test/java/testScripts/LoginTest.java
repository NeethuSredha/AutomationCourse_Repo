package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase{
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() {
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInValidPassword() {
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("locked_out_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce1");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndValidPassword() {
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("locked_out_user1");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndInValidPassword() {
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("problem_user2");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce2");
		
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
}
