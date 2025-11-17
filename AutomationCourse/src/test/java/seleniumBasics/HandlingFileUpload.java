package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends BasePgm {
	public void verifyFileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
		fileUpload.sendKeys(
				"C:\\Users\\Lenovo\\git\\AutomationCourse_Repo\\AutomationCourse\\src\\test\\resources\\Assignment 11.pdf");
		WebElement checkBox = driver.findElement(By.id("terms"));
		checkBox.click();
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();

	}

	public void verifyFileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileUpload = driver.findElement(By.id("pickfiles"));
		fileUpload.click();
		StringSelection se = new StringSelection(
				"C:\\Users\\Lenovo\\git\\AutomationCourse_Repo\\AutomationCourse\\src\\test\\resources\\Assignment 11.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);

		Robot r = new Robot();
		r.delay(2500); // 2500 ms
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		HandlingFileUpload handlingFileUpload = new HandlingFileUpload();
		handlingFileUpload.initializeBrowser();
		// handlingFileUpload.verifyFileUploadUsingSendKeys();
		// handlingFileUpload.browserCloseAndQuit();
		try {
			handlingFileUpload.verifyFileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
