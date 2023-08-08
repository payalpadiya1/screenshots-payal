package scrrenshotsfull_partial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOp {

	
public static void main(String[] args) throws InterruptedException {
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			Thread.sleep(1000);
			
			WebElement e=driver.findElement(By.xpath("//button[@id='openwindow']"));
			
			Thread.sleep(1000);
			
			Actions a=new Actions(driver);
			
			Thread.sleep(1000);
			
			a.contextClick(e).build().perform();
			
			Thread.sleep(1000);
			
		a.doubleClick(e).build().perform();
			
			Thread.sleep(1000);
			
			driver.close();


	}


	}


