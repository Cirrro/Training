package dempack;

import java.time.Duration;
import java.lang.Thread;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - will wait base on how many seconds you put
		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// giving selenium to timeout or to render for 5 seconds
		//implicit wait - wait for the object to show
		//manage - manage driver settings, timeouts - manage driver timeouts
		// 5 seconds happened globally 
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");  
		//by.id - locating the Element /Id of textbox in website //sendkeys - types in textbox
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//by.name - locating the Element /Id of textbox in website
		
		driver.findElement(By.className("signInBtn")).click();
		//if there a space in element it means it is a two element
		//By.class name - locating class name element in website //.click - clicking action in website
	
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//cssSelector - locate a css in website - p.error - tagname.classname
		//getText - getting the text writen in website
		// error will happen if the message is delay on displayed, website is too fast
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		//By.linkText - locating link text in website
		
		//java
		Thread.sleep(1000);
		//thread.sleep - wait in java /1000 = 1 second
		//use when there's a transition happens in website or going to next page
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		//By.xpath - locationg xpath in website
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//.clear - clear what type in textbox
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		//use :nth-child() if encounter multiple attribute or not unique attribute
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9871298797");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//parent to child xpath - complete
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//# constructing css with ID value
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//* =search the partial name of the element/value
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	
	
	
	
	
	
	
	
	
	
	}

}
