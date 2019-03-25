package Test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Resources.WriteToExcel;

public class LoginPageTest {

	public static void main(String [] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\br_up\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
		
	    LoginPage lp = new LoginPage(driver);
		
		//lp.startBrowser();
		lp.goToUrl("http://www.fox.com/account");
		lp.clickSignIn();
		HomePage hp=lp.login("bipop5000@gmail.com", "nepal11$");//returns a Homepage object
		Thread.sleep(1000); 
		ArrayList<String> tvTitles = hp.findTvTitles(); 
		
		WriteToExcel excelwriter = new WriteToExcel(); 
		excelwriter.writeExcel(tvTitles, "C:\\Users\\br_up\\Desktop\\test.xls");
		
	}
		

}


