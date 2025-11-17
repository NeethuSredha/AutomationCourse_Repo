package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends BasePgm {
	public void verifyMultipleWindowHandling() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentId = driver.getWindowHandle();
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String> handleIds = driver.getWindowHandles();
		Iterator<String> it = handleIds.iterator();
		while (it.hasNext()) {
			String currentId = it.next();
			if (!currentId.equals(parentId)) {
				driver.switchTo().window(currentId);
				WebElement emailIdBox = driver.findElement(By.name("emailid"));
				emailIdBox.sendKeys("demo@gmail.com");
				WebElement submitButton = driver.findElement(By.name("btnLogin"));
				submitButton.click();
			}
		}

	}

	public static void main(String[] args) {
		MultipleWindowHandling windowHandling = new MultipleWindowHandling();
		windowHandling.initializeBrowser();
		windowHandling.verifyMultipleWindowHandling();
	}

}
