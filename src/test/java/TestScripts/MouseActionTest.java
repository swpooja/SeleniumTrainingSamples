package TestScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions action = new Actions(driver);
		//driver.get("https://demo.opencart.com/");
//		WebElement srcBox= driver.findElement(By.name("search"));
//		//right click
//		action.contextClick(srcBox).perform();
		
//		WebElement menu = driver.findElement(By.xpath("(//a[contains(text(),'Components')])[1]"));
//		//action.moveToElement(menu).perform()
//		WebElement menuitem = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
//		
//		action.moveToElement(menu).click(menuitem).build().perform();
		
		//double click
//		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
//		WebElement btn=driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
//		action.doubleClick(btn).build().perform();
		//action.doubleClick(btn).doubleClick(btn).build().perform();
		
		//scroll
//		driver.get("https://demo.opencart.com/");
//		WebElement menu = driver.findElement(By.xpath("(//a[contains(text(),'Components')])[1]"));
//		WebElement menuitem = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
//		action.moveToElement(menu).click(menuitem).build().perform();
//		WebElement img=driver.findElement(By.cssSelector("div.col-12.text-center"));
//		action.scrollToElement(img).perform();
//		action.scrollByAmount(10, 400).perform();
		
		//screenshot
		driver.get("https://demo.opencart.com/");
		WebElement menu = driver.findElement(By.xpath("(//a[contains(text(),'Components')])[1]"));
		WebElement menuitem = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
		action.moveToElement(menu).click(menuitem).build().perform();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src =screen.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src, new File(path));
		
		WebElement img=driver.findElement(By.cssSelector("div.col-12.text-center"));
		Thread.sleep(3000);
		action.scrollByAmount(10,480).perform();
		
		File src1=img.getScreenshotAs(OutputType.FILE);
		String path1=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src1, new File(path1));
		
		
		
		
				
		
		
	}

}
