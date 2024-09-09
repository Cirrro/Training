package dempack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			WebDriverManager.chromedriver().driverVersion("119.0.6045.105").setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
			System.out.println("\nBootstrap Alert messages:\n");
			By message = By.xpath("//div[@style='display: none;']");
			List<WebElement> alert_result = driver.findElements(message);
			System.out.println(alert_result.size());

			driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
