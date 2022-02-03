package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");

Thread.sleep(3000);

driver.findElement(By.name("pwd")).sendKeys("manager");

Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();

String actualtitle = driver.getTitle();
System.out.println(actualtitle);


String url = driver.getCurrentUrl();
System.out.println(url);

if(actualtitle.equals("actiTIME - Login"))
{
	System.out.println("Pass:Home page is displayed");
}

else
{
	System.out.println("Fail:home page is not dispalyed");
}
driver.close();






	}

}
