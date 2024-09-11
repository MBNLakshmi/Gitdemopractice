package seleniumsam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Drl\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.close();
	}
}
