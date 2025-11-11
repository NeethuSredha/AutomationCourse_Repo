package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends BasePgm{
public void verifySimpleAlert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement simpleAlert=driver.findElement(By.id("alertButton"));
	simpleAlert.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}

public void verifyConfirmAlert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement confirmAlert=driver.findElement(By.id("confirmButton"));
	confirmAlert.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	//alert.dismiss();
}

	public static void main(String[] args) {
		HandlingAlert handlingAlert=new HandlingAlert();
		handlingAlert.initializeBrowser();
		//handlingAlert.verifySimpleAlert();
		handlingAlert.verifyConfirmAlert();
	}

}
