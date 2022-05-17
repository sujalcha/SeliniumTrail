package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BastTest;

public class MySecondTest extends BastTest{

	@Test
	public static void LoginTest() throws InterruptedException {
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("login_id")).sendKeys("rcvtutorials@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("nextbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.id("nextbtn")).click();
		
	}
}
