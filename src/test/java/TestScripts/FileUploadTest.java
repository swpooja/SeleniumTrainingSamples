package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFile =driver.findElement(By.xpath("//input[@type='file']"));
		String strPath = System.getProperty("user.dir")+"/screenshots/"+ "//1701840235182.png";
		addFile.sendKeys(strPath);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
