package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://leafground.com/waits.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//Thread.sleep(10000);
		//Create Object for WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Use the Condition
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		System.out.println(displayed);
		
		

	}

}
