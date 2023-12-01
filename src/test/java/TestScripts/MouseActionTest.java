package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions action = new Actions(driver);
		driver.get("https://demo.opencart.com/");
//		WebElement srcBox= driver.findElement(By.name("search"));
//		//right click
//		action.contextClick(srcBox).perform();
		
		WebElement menu = driver.findElement(By.xpath("(//a[contains(text(),'Components')])[1]"));
		//action.moveToElement(menu).perform()
		WebElement menuitem = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
		
		action.moveToElement(menu).click(menuitem).build().perform();
				
				
		
		
	}

}
