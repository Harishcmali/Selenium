package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.linkText("actiTIME Inc.")).click();

String parent = driver.getWindowHandle();
Set<String> child = driver.getWindowHandles();

for(String allwin:child) {
	driver.switchTo().window(allwin);
}
driver.findElement(By.xpath("//a[text()='Start Free Trial']")).click();

driver.switchTo().window(parent);
driver.findElement(By.id("username")).sendKeys("admin");



	}

}
