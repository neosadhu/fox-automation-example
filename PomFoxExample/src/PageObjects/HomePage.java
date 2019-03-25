package PageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import Resources.WriteToExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//


public class HomePage extends BasePage {
	
	By homeTab = By.xpath("/html/body/div[1]/div/header/div/div/div/div/div[1]/div[2]/div/a[1]");
	By showTab =By.xpath("/html/body/div[2]/div/header/div/div/div/div/div[1]/div[2]/div/a[2]");
	//static By titles =  By.className("Tile_titleWrapper_1Ub6U"); 
	By titles =  By.className("Tile_titleWrapper_1Ub6U"); 


	public HomePage (WebDriver driver) {
	super(driver); 
	}
	
	
	public void clickOnHome() {
		driver.findElement(homeTab).click(); 
	}
	
	public ArrayList<String> findTvTitles() {
	
		ArrayList<String> titleStr = new ArrayList<String>();
		ArrayList<WebElement> al = new ArrayList<WebElement>(driver.findElements(titles));
		for (WebElement w: al) {
			titleStr.add(w.getText());
		}
		titleStr.removeAll(Arrays.asList(""));		
		return titleStr;
	}
	

// end main method

	
}//end class