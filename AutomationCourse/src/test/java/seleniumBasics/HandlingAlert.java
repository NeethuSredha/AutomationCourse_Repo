package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends BasePgm {
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement al = driver.findElement(By.id("alertButton"));
		al.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement al = driver.findElement(By.id("confirmButton"));
		al.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// alert.dismiss();
	}

	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement al = driver.findElement(By.id("promtButton"));
		al.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Neethu");
		alert.accept();
	}

	public static void main(String[] args) {
		HandlingAlert handlingAlert = new HandlingAlert();
		handlingAlert.initializeBrowser();
		// handlingAlert.verifySimpleAlert();
		// handlingAlert.verifyConfirmAlert();
		handlingAlert.verifyPromptAlert();
	}

}
