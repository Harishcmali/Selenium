package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");

Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("admin");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("qwerwrrttyy");

Thread.sleep(3000);
driver.findElement(By.xpath("(//div[contains(@class,'             qF0y9 ')])[2]")).click();


String title = driver.getTitle();
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
