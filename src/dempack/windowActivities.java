package dempack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//.window - manage the browser to minimize or maximize
		driver.get("http:/google.com");
		//will wait until the browser is fully loaded
		driver.navigate().to("https://rahulshettyacademy.com");
		//.navigate - same as .get but will not wait the browser to fully load
		// use also for internal navigate in browser
		
		driver.navigate().back();
		//.back - will comeback to previous website
		
		driver.navigate().forward();
		//.forward - will forward again to the last website it came back
		
	}

}
