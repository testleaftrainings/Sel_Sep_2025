package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Step1:Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Step2:Load the url
		driver.get("https://www.facebook.com/");
		
        //Maximize the browser
		driver.manage().window().maximize();
	}

}
