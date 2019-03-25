package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class SignUpPage extends BasePage{
	
	By signup = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[4]/button[1]");
	By signin = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[4]/button[2]");
	By fName=   By.name("signupFirstName");
	By lName=   By.name("signupLastName"); 
	By pword=   By.name("signupPassword");
	By emailId=   By.name("signupEmail"); 
	By genderDropDown = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div"); 
	By bDate =   By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/input"); 
	By male = 	By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div[2]/a[1]/div");
	By female = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div[2]/a[2]");
	
	
	public SignUpPage(WebDriver driver) {
		super(driver);
		
	}

	public void typeFirstName(String name) { 
		driver.findElement(fName).sendKeys(name); 
	}
	
	public void typeLastName(String name) { 
		driver.findElement(lName).sendKeys(name); 
	}
	
	public void typeEmail(String email) { 
		driver.findElement(emailId).sendKeys(email); 
	}	
	
	public void typeBirthdate (String birthDate) { 
		driver.findElement(bDate).sendKeys(birthDate); 
	}	

	
	public void selectGender (String gender) {
		driver.findElement(genderDropDown).click(); 
		
		if (gender.equalsIgnoreCase("MALE")){
			driver.findElement(male).click(); 
		}
		
		driver.findElement(female).click(); 
	}
	
	public void clickSignUp() { 
		driver.findElement(signup).click(); 
	}

	
	
	

}
