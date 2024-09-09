import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Firefox - FirefoxDriver ->Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		// chromedriver.exe -> Chrome Browser
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		// webdriver.chrome.driver -> value of path
		//WebDriver driver = new ChromeDriver();
		
		
		//Firefox launch
		//geckodriver
		
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "/Users/mikkobadillo/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com"); //Go to website
		System.out.println(driver.getTitle()); //print out website title
		System.out.println(driver.getCurrentUrl());  //print out website url
		//driver.close(); //close the browser/ close the current window
	//	driver.quit() //closing every associated window with the website, multiple window
		
	}

}
