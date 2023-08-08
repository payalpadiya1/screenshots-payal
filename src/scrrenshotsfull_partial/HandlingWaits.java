package scrrenshotsfull_partial;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		//Thread.sleep(2000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
username.sendKeys("Payal");

WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("payal123");

driver.navigate().refresh();
try
{
username.sendKeys("abc");
}
catch(Exception e)
{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("xyz");
}

	}

}
