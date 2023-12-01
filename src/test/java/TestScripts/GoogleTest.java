package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Main title.."+driver.getTitle());
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("URL.."+ driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Main title.."+driver.getTitle());
		driver.navigate().forward();
		System.out.println("current title.."+driver.getTitle());
		System.out.println("URL.."+ driver.getCurrentUrl());
	}

}
