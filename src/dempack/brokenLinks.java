package dempack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		//Broken URL
		//identify which url working or not
		
		//java methods will call URL's and get you the status code
		//if status code >404 then that url is not working - link which tied to url is broken
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a = new SoftAssert();
		
		
		for(WebElement link : links)
		{

			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode =  conn.getResponseCode();
			
			System.out.println(rescode);
			a.assertTrue(rescode<400, "The Link with Text"+ " "+ link.getText()+ "is broken with code" +" " +rescode);
			
			
			
		}
		
		a.assertAll();
		
		
		
		
	}

}
