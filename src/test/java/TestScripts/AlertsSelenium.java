package TestScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		  Actions action = new Actions(driver);
		  action.scrollByAmount(10,530).perform();
//		  driver.findElement(By.xpath("//button[contains(text(),'Click me!')][1]")).click();
//		  Alert alert =driver.switchTo().alert();
//		  System.out.println("Alert Text: " +alert.getText());
//		  alert.accept();
		  
		  //handling confirmation alert
//		  driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
//		  Alert confirm =driver.switchTo().alert();
//		  System.out.println("Alert Text: "+confirm.getText());
//		  confirm.dismiss();
//		  
		  //handling prompt alert
		  driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		  Alert prompt =driver.switchTo().alert();
		  System.out.println("Alert Text: "+prompt.getText());
		  prompt.sendKeys("Hello welcome");
		  prompt.accept();
		  //prompt.dismiss();
	}

}
