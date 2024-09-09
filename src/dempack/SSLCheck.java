package dempack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeOptions - is a class chrome that help set the behavior in chrome browser
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // this buypass the advance button and unsafe button
		
		//https://chromedriver.chromium.org/capabilities - website for more capabilities explanation and examples
		
		//add extensions in automation browser
		//options.addExtensions("[add link of extension here]");
		
		//set proxy
		//Proxy proxy = new Proxy();
		//options.setHttpProxy("ipaddress:4444");
		//options.setCapability("proxy", value);
		
		System.setProperty("webdriver.chrome.driver", "/Users/mikkobadillo/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
