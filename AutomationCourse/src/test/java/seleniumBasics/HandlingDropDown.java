package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends BasePgm {
	public void verifyDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropDown1);
		// select.selectByIndex(1);
		// select.selectByValue("python");
		select.selectByVisibleText("SQL");
		WebElement dropDown2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select select2 = new Select(dropDown2);
		// select2.selectByIndex(3);
		// select2.selectByValue("testng");
		select2.selectByVisibleText("Maven");
	}

	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
	}

	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButtonOrange = driver.findElement(By.xpath("//input[@value='orange']"));
		radioButtonOrange.click();
	}

	public static void main(String[] args) {
		HandlingDropDown handlingDropDown = new HandlingDropDown();
		handlingDropDown.initializeBrowser();
		//handlingDropDown.verifyDropDown();
		handlingDropDown.verifyCheckBox();
		//handlingDropDown.verifyRadioButton();
	}

}
