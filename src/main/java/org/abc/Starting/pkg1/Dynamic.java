package org.abc.Starting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();//for selecting departure drop down
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//for selecting departure city
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();//for arriving drop down
		driver.findElement(By.xpath(" (//a[@value='MAA'])[2]")).click();//for arriving city
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//for current calender 
		
		
		//autosuggestive drop down
		/*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");// locator for the autosuggestive box
		Thread.sleep(3000);
	    List<WebElement> options =driver.findElement(By.xpath("//a[@id='ui-id-81']"));//xpath for the options 
	    for(WebElemnt option:options)
	    {
	    if(option.getText().equals("India")
	    {
	    option.click();
	    break;		
	}*/
		
	}
}
