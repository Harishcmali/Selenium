package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {

		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");


			driver.findElement(By.name("username")).sendKeys("admin");


WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement password = driver.findElement(By.name("password"));
wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("admin");


WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'             qF0y9 ')])[2]"));
wait.until(ExpectedConditions.elementToBeClickable(button)).click();

			String title = driver.getTitle();
			
			wait.until(ExpectedConditions.titleContains("Instagram"));
			System.out.println(title);

			String url = driver.getCurrentUrl();
			System.out.println(url);

			if(title.equals("Instagram")) {
				System.out.println("Pass:home page is dispalyed");
			}

			else
			{
				System.out.println("Fail:home page is not dispalyed");
			}

			driver.close();

				}

			


	}


