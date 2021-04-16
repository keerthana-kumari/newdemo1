package org.abc.Starting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	//*[@id='input]'

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ran123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1233");
		driver.findElement(By.id("u_0_b")).click();
	
	}

}
