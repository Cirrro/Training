package dempack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text = "Rahul";
		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//getText - get the text in alert
		driver.switchTo().alert().accept();
		//.alert - checks if there is an alert in website/browser
		//.accept - accept or click ok in any alert in website/browser
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		//.dismiss - click any cancel button in website/browser
		
	}

}
