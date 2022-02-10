package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		s.selectByIndex(0);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		ArrayList a=new  ArrayList();
		
		for(WebElement b:allOptions) {
			String text = b.getText();
			System.out.println(text);
			a.add(text);
		}
		Collections.sort(a);
		
		System.out.println("*******after sorting********");
		for(Object q:a) {
			System.out.println(q);
		}
		
		driver.close();

	}

}
