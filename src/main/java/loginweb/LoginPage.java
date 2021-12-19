package loginweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
static WebDriver driver;
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/index.php#");
		return driver;
	}
	
	public static void tearDown() {
		
		driver.close();
		driver.quit();
	}

}
