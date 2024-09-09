package dempack;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//expected
		
		String[] itemsNeeded =  {"Cucumber","Brocolli", "Beetroot", "Carrot"};
		int j=0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			
		String[] name = products.get(i).getText().split("-");
		String formattedName = name[0].trim(); //removing spaces in array when space is define as character
		
		//name[0] - Brocolli
		//name[1] - 1 kg
		
		//check whether name you extracted is present in array or not
		
		//convert array into array list for easy search
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		if(itemsNeededList.contains(formattedName)) //finding the present name in Array
		{
			j++;
			
			//this code will work using text as locator, but text may change sometimes, so it's not a good practice
			/*driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();		
			Thread.sleep(5000); */
			
			//xpath using class - a static - that never changes/ with parent and child
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			//if(j==3) or 
			if(j==itemsNeeded.length) //so that it count the items in array
				{
				break;
				}
			//for stopping the execution after 3 times
			
			
			
		}
		}
		
		//alternative but to many lines, and repeating
	/*	for(int i=0; i<products.size(); i++)
		{
			
		String	name = products.get(i).getText();
		
		if(name.contains("Brocolli"))
		{
			
			driver.findElements(By.xpath("//button[tex[text()='ADD TO CART']")).get(i).click();		
			break;
			
		}
		}
		*/
		
		
		//implicit wait - wait globally /wait for certain number of seconds before throw exception
		
		//explicit wait - can target specific element/specific scenario to wait
		
		//Thread.sleep - pause script for certain number of seconds
		
		//Fluent Wait - wait finds the web element repeatedly at regular intervals of time until the timeout or till the object gets found
	}

}
