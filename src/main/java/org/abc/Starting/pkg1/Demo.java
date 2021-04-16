package org.abc.Starting.pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a object for chrome
		//we will strictly implements methods of webdriver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());//validate if your page title is correct
		System.out.println(driver.getCurrentUrl());//validate if you are landed on current url
		driver.getPageSource();
		driver.get("http://yahoo.com");
		driver.navigate().back();//we can use this method for forward, backward, refresh
		//driver.close();// it will close current browser
		//driver.quit();//it will close the browser opened by selenium
	}

}

