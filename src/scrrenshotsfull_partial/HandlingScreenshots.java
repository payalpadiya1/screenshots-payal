package scrrenshotsfull_partial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(3000);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\SHREE\\Desktop\\screenshot\\image.png"));
		
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/div/form/table/tbody/tr[1]/td[1]/strong"));
		File src1=e.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\SHREE\\Desktop\\screenshot\\img.jpeg"));
		
		Thread.sleep(1000);
		WebElement e2=driver.findElement(By.xpath("/html/body/main/div/div/div[2]/h1[1]"));
		
		File src2=e2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("C:\\Users\\SHREE\\Desktop\\screenshot\\img123.png"));
		
	}
}
