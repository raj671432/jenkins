package Aspire.Sportlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(5000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement>scroll = driver.findElements(By.cssSelector(".tableFixHead td:first-child"));
		for (int i=0;i<scroll.size();i++)
		{
			System.out.println(scroll.get(i).getText());
			
	
		}
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:last-child"));
		int sum =0 ;
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
	driver.findElement(By.cssSelector(".totalAmount")).getText();
	}
	
	

}