package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends BasePgm{
	public void verifyWebElementCommands() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
	messageTextBox.sendKeys("Neethu");
	WebElement showMessagebutton=driver.findElement(By.id("button-one"));
	showMessagebutton.click();
	WebElement text=driver.findElement(By.id("message-one"));
	System.out.println(text.getText());
	System.out.println(text.getTagName());
	messageTextBox.clear();
	System.out.println(showMessagebutton.getCssValue("background-color"));
}
	public static void main(String[] args) {
		WebElementCommands webElementCommands=new WebElementCommands();
		webElementCommands.initializeBrowser();
		webElementCommands.verifyWebElementCommands();

	}

}
