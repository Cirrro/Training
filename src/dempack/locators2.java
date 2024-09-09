package dempack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "rahul";
		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver); //change to static
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);  
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//By.tagname - locating the tagname in website
		// only use sometimes when there is only one tagname
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//assert get the text in website and compare it to pass or fail
		//use for testing checking retrieve written is correct of not
		//validating
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
		
		
		
	}
    // change to static cause by getpassword in main method
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'"); // split by '
		//0th index - Please use temporary password
		//1th index - rahulshettyacademy' to login.
		
		// String[] passwordArray2 = passwordArray[1].split("'"); or the one below is the same
		String password = passwordArray[1].split("'")[0];
		//0th index - rahulshettyacademy
		//1th index - to login.
		
		 return password; // returning the password as string so add String in method
	}
	
	
	
}
