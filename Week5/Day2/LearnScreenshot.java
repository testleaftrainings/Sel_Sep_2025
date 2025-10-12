package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement usernameField = driver.findElement(By.id("email"));
		
		//Take the Screenshot
         File source = usernameField.getScreenshotAs(OutputType.FILE);
         
         //Allocating the destination
         File destination=new File("./Data/facebookusername.png");
         
         //Storing the file
         FileUtils.copyFile(source, destination);
         
         
         
         
	}

}
