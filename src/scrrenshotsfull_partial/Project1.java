package scrrenshotsfull_partial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		Thread.sleep(1000);
		
		List<WebElement> date=driver.findElements(By.xpath("//td[@data-month='6']"));
		for(WebElement k:date)
		{
			if(k.getText().equalsIgnoreCase("26"))
			{
				k.click();
				break;
			}
		}
		
		WebElement pass=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		pass.click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		for(int i=0;i<3;i++)
		{
			e.click();
		}
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@id='hrefIncChd'])[1]"));
		for(int j=0;j<2;j++)
		{
			e1.click();
		}
		
		driver.findElement(By.xpath("(//input[@id='btnclosepaxoption'])[1]")).click();
		
		WebElement e3=driver.findElement(By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]"));
		Select s=new Select(e3);
		s.selectByValue("AED");
				

	}

}
