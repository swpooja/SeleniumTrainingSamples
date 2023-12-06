package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("115");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://automationbookstore.dev/");
		System.out.println(driver.getTitle());
//		String strplaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
//		System.out.println(strplaceholder);
//		WebElement closeicon = driver.findElement(By.cssSelector("a[title='clear text']"));
//		System.out.println(closeicon.isDisplayed());
//		if(closeicon.isDisplayed()) {
//			closeicon.click();
//		}
//		
	}

}
