package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BastTest;

public class MyThirdTest extends BastTest{

	@Test
	public static void LoginTest() throws InterruptedException {
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("email_field_login"))).sendKeys("rcvtutorials@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("password");
		
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		
		
	}
}
