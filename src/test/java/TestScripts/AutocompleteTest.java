package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutocompleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://jqueryui.com/autocomplete/");
		  driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		  driver.findElement(By.id("tags")).sendKeys("a");
		  //Thread.sleep(20);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1 > li"));
		  
		  //to know the number of matchingitems
		  System.out.println("number of matching itesm..."+items.size());
		  //to get text of each item
		  for(WebElement item : items) {
			  System.out.println(item.getText());
			//to get text of each item
			  if(item.getText().equalsIgnoreCase("Javascript")) {
				  //to select exp text
				  item.click();
				  break;
			  }
		  }
		  
	}

}
