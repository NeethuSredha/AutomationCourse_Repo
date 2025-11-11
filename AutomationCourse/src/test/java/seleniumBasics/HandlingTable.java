package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends BasePgm{
public void verifyTable() {
	driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement table=driver.findElement(By.id("dataTable"));
	System.out.println(table.getText());
	WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
	System.out.println(tableRow.getText());
	}
	public static void main(String[] args) {
		HandlingTable table=new HandlingTable();
		table.initializeBrowser();
		table.verifyTable();

	}

}
