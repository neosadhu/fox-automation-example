package Test;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Resources.WriteToExcel;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestDownload {
	WebDriver driver; 
	 
	@BeforeTest
	 public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\br_up\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://www.fox.com");
	  }
	
	
	@Test
  public void downloadTitles() throws IOException {
	  HomePage hp = new HomePage(driver); 
	  ArrayList <String> tvTitles = hp.findTvTitles();
	  WriteToExcel wx = new WriteToExcel(); 
	  wx.writeExcel(tvTitles, "C:\\Users\\br_up\\Documents\\code automation\\test.xls");
  }
  
 

  @AfterTest
  public void afterTest() {
  }

}
