package dempack;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		//.switchTo().newWindow - for opening new window or tab in browser
		
		Set<String> handles = driver.getWindowHandles();
		//will see how many current windows current open and extract the window id and store it
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com");
		//switching windows parent to child
		
		//String coursename = driver.findElement(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).get(1).getText();
		   //this gets the text using locating by link and its index
			//can't use for now, doesn't have .get(index)
		
		String coursename = driver.findElement(By.xpath("(//a[contains(text(),'All-Access Membership-Complete Access to 25+ Cours')])[1]")).getText();
		//alternative by me hahaha
		
		
		driver.switchTo().window(parentWindowId);
		//switching windows child to parent
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		//driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
		name.sendKeys(coursename);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		//getting screenshot
		
		//FileUtils.copyFile(file, new File("logo.png"));
		  //capture screenshot and convert it to physical file
		
		
		//get Height and Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
	}

}
