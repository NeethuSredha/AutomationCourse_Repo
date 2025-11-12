package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrame extends BasePgm {
	public void verifyFrame() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());
	}

	public static void main(String[] args) {
		HandlingFrame frame = new HandlingFrame();
		frame.initializeBrowser();
		frame.verifyFrame();
	}

}
