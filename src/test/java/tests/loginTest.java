package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.loginPage;

public class loginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		
		loginPage loginpage = new loginPage(driver); 
		
		loginpage.enterUsername("admin@yourstore.com");
		loginpage.enterPassword("admin");
		loginpage.clickBtn();
		
		System.out.println("the title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		
	}
}
