package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Main title.."+driver.getTitle());
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("selenium tutorial");
		Thread.sleep(2000);
//		srcBox.sendKeys(Keys.ENTER);
//		System.out.println("URL.."+ driver.getCurrentUrl());
//		driver.navigate().back();
//		System.out.println("Main title.."+driver.getTitle());
//		driver.navigate().forward();
//		System.out.println("current title.."+driver.getTitle());
//		System.out.println("URL.."+ driver.getCurrentUrl());
		//select from the dropdownoption which is deplayed below search bar in google once u type anything in search bar.those dropdowns order is not same everytime that's why used below logic. 
		List<WebElement> listitems = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println("total item: "+ listitems.size());
//		for(int i=0; i < listitems.size(); i++) {
//			
//			System.out.println(listitems.get(i).getText());
//			if(listitems.get(i).getText().equalsIgnoreCase("selenium tutorial python"));
//			{
//				listitems.get(i).click();
//				break;
//			}
			
//		}
		
		
		
	}

}
