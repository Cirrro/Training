package dempack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TestNG is one of the testing framework




public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		//isEnabled - for checking if the element of css is enable or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//checking by attribute using if else
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			
			System.out.println("It's enable");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	
		
		
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//determine if element is not selected - if false then it pass, if true it fail
		
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//.isSelected - determine if element is selected or not
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//determine if element is selected - if true then it pass, if false it fail
		
		//count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//size - return the number of elements in the list
		
		
		
	//Dropdown	
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
	
		/*int i = 1;
	while(1<5) 
	{
			driver.findElement(By.id("hrefIncAdt")).click(); //will click the button 4 times
			i++;
			
	}*/
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //will click the button 4 times
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		//compare what the actual result to the expected result
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
