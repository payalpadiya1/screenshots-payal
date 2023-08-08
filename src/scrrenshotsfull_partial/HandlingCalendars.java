package scrrenshotsfull_partial;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendars {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement e=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
		e.click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
		e1.click();
		Thread.sleep(1000);
		List<WebElement> date=driver.findElements(By.xpath("//td[@data-month='7']"));
		
			for (WebElement k:date)
			{
				if(k.getText().equalsIgnoreCase("8"))
				{
					k.click();
					break;
				}
			}
				}
			

	}


