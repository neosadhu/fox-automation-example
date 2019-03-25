package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.BasePage;


 public class LoginPage extends BasePage{
	By signup = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[4]/button[1]");
	By signin = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[4]/button[2]");
	By userId = By.name("signinEmail");
	By pass =   By.name("signinPassword");
	By signinButton = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div/div[6]");
	
    public LoginPage(WebDriver driver) {
    	super(driver);
    }

	
	public void clickSignIn() {
		driver.findElement(signin).click(); 	
	}
	
	public void sendUserName(String s) {
		driver.findElement(userId).sendKeys(s);
	}
	
	public void sendPassword(String s) {
		driver.findElement(pass).sendKeys(s);
	}
	
	public HomePage login (String u, String p) {
		this.sendUserName(u);
		this.sendPassword(p);
		driver.findElement(signinButton).click(); 
		return new HomePage(driver);
		
	}
	
	public void goToUrl (String url) throws Exception {
		driver.get(url);
		Thread.sleep(3000);
	}
	

 }
  
 