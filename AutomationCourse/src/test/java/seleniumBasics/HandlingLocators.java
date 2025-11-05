package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators extends BasePgm{
	public void verifyLocator() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	driver.findElement(By.id("button-one"));
	driver.findElement(By.tagName("button"));
	driver.findElement(By.className("btn btn-primary"));
	driver.findElement(By.name("viewport"));
	driver.findElement(By.linkText("Ajax Form Submit"));
	driver.findElement(By.partialLinkText("Ajax"));
	driver.findElement(By.cssSelector("button[id='button-one']"));
	driver.findElement(By.xpath("//input[@id='single-input-field'])"));
	driver.findElement(By.xpath("//button[text()='Show Message']"));
	driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
	driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	}
	
	public static void main(String[] args) {
		

	}

}
