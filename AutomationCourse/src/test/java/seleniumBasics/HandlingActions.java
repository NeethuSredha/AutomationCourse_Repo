package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends BasePgm {
	public void verifyRightClick() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.contextClick(others).build().perform();
	}

	public void verifyMouseHover() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.moveToElement(others).build().perform();
	}

	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragMe, dropHere).build().perform();
	}

	public void verifyKeyboardActions() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		HandlingActions actions = new HandlingActions();
		actions.initializeBrowser();
		// actions.verifyRightClick();
		// actions.verifyMouseHover();
		// actions.verifyDragAndDrop();
		try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
