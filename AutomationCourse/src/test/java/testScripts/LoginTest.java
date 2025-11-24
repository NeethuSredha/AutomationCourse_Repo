package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;
import utilities.ExcelUtility;

public class LoginTest extends DemoBase{
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() throws IOException {
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.loginButtonClick();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInValidPassword() throws IOException {
		String userNameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.loginButtonClick();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndValidPassword() throws IOException {
		String userNameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.loginButtonClick();
	}
	
	@Test
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndInValidPassword() throws IOException {
		String userNameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userNameValue);
		loginPage.enterPasswordOnPasswordField(passwordValue);
		loginPage.loginButtonClick();
	}
}
