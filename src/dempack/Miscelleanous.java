package dempack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the window browser
		driver.manage().deleteAllCookies(); // delete all cookies in browser
		//driver.manage().deleteCookieNamed("asdf"); // delete specific cookie

		
		driver.get("http://google.com");
		
		
		//screenshot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(src,new File("/Users/mikkobadillo/Desktop/screenshot/screenshot.png"));
		
		
		
	}

}
