package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(3000);
		WebElement from = driver.findElement(By.id("draggable"));
		//action.moveToElement(from).perform();
		WebElement to = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		//System.out.println("drag text: "+ from.getText());
		System.out.println("drop text: "+ to.getText());
	}

}
