package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.SignUpPage;

public class SignUpPageTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\br_up\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
		driver.get("http://www.fox.com/account");
		Thread.sleep(3000);
				
		SignUpPage sp = new SignUpPage(driver);
		sp.clickSignUp();
		sp.typeFirstName("John");
		sp.typeLastName("last");
		sp.typeEmail("abc@gmail.com");
		sp.selectGender("female");
		
		
	}

}
