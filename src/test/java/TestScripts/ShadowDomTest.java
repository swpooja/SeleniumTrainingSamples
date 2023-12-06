package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://watir.com/examples/shadow_dom.html");
//  WebElement shadowHost =driver.findElement(By.cssSelector("div#shadow_host"));
//  SearchContext context=shadowHost.getShadowRoot();
//  WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
//  //WebElement shadowContent = driver.findElement(By.cssSelector("span#shadow_content"));
//  System.out.println("Shadow dom Content: "+ shadowContent.getText());
  
  WebElement shadowHost =driver.findElement(By.cssSelector("div#nested_shadow_host"));
  SearchContext context=shadowHost.getShadowRoot();
  WebElement shadowContent = context.findElement(By.cssSelector("div#nested_shadow_content"));
  //WebElement shadowContent = driver.findElement(By.cssSelector("span#shadow_content"));
  System.out.println("Shadow dom Content: "+ shadowContent);
	}

}
