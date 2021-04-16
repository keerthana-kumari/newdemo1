package org.abc.Starting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/practice-project");
		//driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[2]/a")).click();//absolute xpath
		driver.findElement(By.xpath("//*[textO='My Courses ")).click();//text based xpath
		

	}

}
