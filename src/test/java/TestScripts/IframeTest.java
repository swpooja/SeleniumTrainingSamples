package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		  //from mainpage to frame 1
		  driver.switchTo().frame("frame1");
		  WebElement inpBox =driver.findElement(By.xpath("//input[@type='text']"));
		  inpBox.sendKeys("Hello welcome");
		  
		  //from frame 1 to frame 3 ,checkbox
		  //driver.switchTo().frame("frame3");
		  driver.switchTo().frame(0);
		  driver.findElement(By.id("a")).click();
		  
		  //frame 3 to frame 1
		  //driver.switchTo().frame("frame1");
		  //can't go back from frame 1 by id coz its searching it inside frame 3 for this
		  //u need to use below method
//		  driver.switchTo().parentFrame(); //immediate parent of frame 3 means frame 1
//		   inpBox =driver.findElement(By.xpath("//input[@type='text']"));
//		  inpBox.clear();
//		  inpBox.sendKeys("Hello welcome pooja");
//		  
//		  //from frame 1 to default content
//		  driver.switchTo().defaultContent();
//		  System.out.println(driver.findElement(By.xpath("//label//span")).getText());
//		  
//		  //select dropdowntext
//		  driver.switchTo().frame(3);
//		  Select dropdown =new Select(driver.findElement(By.id("animals")));
//		  dropdown.selectByVisibleText("Avatar");
//		  
//		  
//		  
		  
		  
		  
		  
				  
	}

}
