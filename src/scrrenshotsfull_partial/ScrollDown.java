package scrrenshotsfull_partial;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
         js.executeScript("window.scrollBy(0,500)", "");  //scroll down using pixel
	
		
		//scrolling until specific element found
		WebElement e1 = driver.findElement(By.xpath("//button[@id='mousehover']"));
		js.executeScript("arguments[0].scrollIntoView();", e1);
	
		
		//Scrolling till bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		
		driver.close();
	}



	}


