package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test7 {

public static void main(String[] args) {
	//ChromeBrowser
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(options);

	//FirefoxBrowser
FirefoxOptions options1=new FirefoxOptions();
options1.addArguments("--disable-notiications");
WebDriver driver1=new FirefoxDriver(options1);



driver.manage().window().maximize();
driver.get("https://www.olx.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



	}

}
