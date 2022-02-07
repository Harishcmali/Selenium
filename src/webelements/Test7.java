package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		
		if(search.isDisplayed())
		{
			System.out.println("Pass:element is dispalyed");
			search.sendKeys("computer");
		}
		else
		{
			System.out.println("Fail:emenet is not dispalyed");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
