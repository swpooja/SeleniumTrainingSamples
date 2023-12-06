package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinPopupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://stqatools.com/demo/Windows.php");
		  String parentWin = driver.getWindowHandle();
		  System.out.println("Parent Win: "+parentWin);
		  
		  WebElement tabBtn =driver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
		  tabBtn.click();
		  Set<String> tabs =driver.getWindowHandles();
		  System.out.println("Number of windows..."+tabs.size());
		  for(String child:tabs) {
			  System.out.println("Windows..."+child);
			  if(!child.equalsIgnoreCase(parentWin)) {
				  driver.switchTo().window(child);
				  
				  System.out.println("child Win title.."+driver.getTitle());
				  
			  }
		  }
		  driver.switchTo().window(parentWin);
		  driver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
	}

}
