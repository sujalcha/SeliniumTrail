package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BastTest;

public class MyFourthTest extends BastTest{

	@Test(dataProvider = "testdata")
	public static void LoginTest(String username, String password) throws InterruptedException {
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("email_field_login"))).sendKeys(username);
		
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		
	}
	
	@DataProvider(name = "testdata")
	public Object[][] tData(){
		return new Object[][] {
			{"hero1","password1"},
			{"hero2","password2"},
			{"hero3","password3"},
			{"rcvtutorials@gmail.com","password1"},
		};
	}
}
