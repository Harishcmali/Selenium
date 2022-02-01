package windowMangemant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
//to maxmize
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
Thread.sleep(3000);

//to full screen
driver.manage().window().fullscreen();

Thread.sleep(3000);
//minimize
driver.manage().window().minimize();


	}

}
