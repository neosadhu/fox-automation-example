package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
	
	public WebDriver driver; 
	
	public BasePage(WebDriver driver) {
		this.driver =driver; 
	}
	
	


	public void browserClose(WebDriver driver) {
		driver.close(); 
		
	}
	
	
	
	

}
