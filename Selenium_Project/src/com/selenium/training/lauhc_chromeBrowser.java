package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lauhc_chromeBrowser {

	public static void main(String[] args) {

		
		
		String webURL = "http://www.google.com/";
		
		/* chrome driver is set as System Variables, see below
		System -> Advanced -> Environment variables -> System Variables -> Select Path variable -> Edit -> Add folder location from the driver and save changes*/

		
		/* Run below command if the driver is not set as system variable
		System.setProperty("webdriver.chrome.driver", "C:/ObarriosWorkspace/seleniumDrivers/chromedriver/v_79/chromedriver.exe");*/
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(webURL);
		driver.manage().window().maximize();
		
		driver.close();
		
		driver.quit();
			
	}

}
