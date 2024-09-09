package dempack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		//December 23
		
		
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.className("dayContainer"));

		int count = driver.findElements(By.className("dayContainer")).size();

		for (int i =0;i<count;i++) 
		{
		
			String day = driver.findElements(By.className("dayContainer")).get(i).getText();
			if(day.equalsIgnoreCase("23")) 
		{
				driver.findElements(By.className("dayContainer")).get(i).click();
				break;
		}
		
		}
		
	}

}
