package org.abc.Starting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=irctc+website+login&rlz=1C1CHBD_enIN848IN848&oq=irctc+website&aqs=chrome.1.69i57j0l8.7851j0j7&sourceid=chrome&ie=UTF-8");
		driver.get("https://www.irctc.co.in/nget/redirect?destination=EE&jDate=2019-06-18T00:00:00&oneStop=false&origin=SC&returnJourny=true&txnId=100001889665610");
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i")).click();
	}
	

}
