package scrrenshotsfull_partial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("payal");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("paya123");
		
	}

}
