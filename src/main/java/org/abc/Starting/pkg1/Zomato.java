package org.abc.Starting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zomato {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore");
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@class='sc-60vv3c-0 fyGVHZ sc-hizQCF cVwIHz']")).click();
		driver.findElement(By.xpath("//input[@class='sc-60vv3c-0 fyGVHZ sc-hizQCF cVwIHz']")).sendKeys("8867");
		
		
		//driver.findElement(By.xpath("//*[placeholder=\'Phone number\']")).sendKeys("89876");
		//driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/button")).click();
		//driver.findElement(arg0)
	//Select S = new Select(driver.findElement(By.xpath("//*[@id=\'navigation_cklki4i2000311kmv48p95vlj\']/li[2]/div/div/div[1]/span")));
	//S.selectByIndex(7);
	}

}
