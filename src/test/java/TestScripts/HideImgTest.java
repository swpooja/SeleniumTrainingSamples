package TestScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideImgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--blink-settings=imagesEnabled=false");
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.managed_default-content_settings.images",2);
		options.setExperimentalOption("prefs ", prefs);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
	}

}
