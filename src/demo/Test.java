package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		while(true) {
			try {
			driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Sat May 28 2022']/div/p[text()='28']")).click();
		break;
			}
			catch(Exception e) {
				System.out.println("date not found");
			}
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	
	}
		

	}

	}


