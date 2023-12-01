package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select Singlesel =new Select(driver.findElement(By.id("select-demo")));
		Singlesel.selectByValue("Monday");
		
		Select MultiSel = new Select(driver.findElement(By.id("multi-select")));
		if(MultiSel.isMultiple()) {
			MultiSel.selectByIndex(0);
			MultiSel.selectByValue("Florida");
			MultiSel.selectByVisibleText("Washington");
		}
		List<WebElement> items = MultiSel.getAllSelectedOptions();
		System.out.println("Items selected :"+ items.size());
		MultiSel.deselectByValue("Florida");
		
	}

}
