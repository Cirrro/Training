package dempack;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		//1. give the count of the links on the page
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//count how many links on a page
		System.out.println( driver.findElements(By.tagName("a")).size());
		
		//2. count the links of the footer section
		
		//limiting webdriver scope by select an entire section and create webelement using it
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		//3. count the links of a column in the foot section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		//4. click on each links in the column and check of the pages are opening
		
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			
			String clickonlinktab = Keys.chord(Keys.COMMAND,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
		}	
		Set <String>abc = driver.getWindowHandles();
		
		Iterator<String> it = abc.iterator();
		
		
		while(it.hasNext()) //hasNext - whether if there index is present or not
		{
			
			driver.switchTo().window(it.next()); //next - moves to next index
			System.out.println(driver.getTitle()); // gets the title of website
		}
		
		
		
			
		}
		
		
		
		
		
	}


