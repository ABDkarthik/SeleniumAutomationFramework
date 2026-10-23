package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	private WebDriver driver;
	
	private By usernameTextBox = By.xpath("//*[@id=\"Email\"]");
	private By passwordTextBox = By.id("Password");
	private By loginBtn = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
		
	}
	
	public void enterPassword(String pass) {
		
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(pass);
		
	}
	
	public void clickBtn() {
		
		driver.findElement(loginBtn).click();
	}
	
}
