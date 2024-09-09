package dempack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//Actions Class
		
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		//moveToElement - move the mouse cursor the specific element in webpage
		a.moveToElement(move).contextClick().build().perform();
		//.build - ready to execute the line code
		//.perform - will execute
		//.contextClick() - right clicking action
		
		//type in all capital letters
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//.keyDown() - hold the keys in keyboard
		//.keyDown(Keys.SHIFT) - example holding shift button
		//.doubleClick() - double click action
		
		
	}

}
