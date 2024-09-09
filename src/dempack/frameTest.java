package dempack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		//find all frames in web 
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switching frame using index
		// driver.switchTo.frame(0);
		
		//.frame() - switching to frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		
		//switch to normal window or the first window
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
