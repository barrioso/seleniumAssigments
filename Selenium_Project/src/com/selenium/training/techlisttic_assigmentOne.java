package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlisttic_assigmentOne {

	public static void main(String[] args) {
		
		
		/*Assignment 1: Automate Browser Actions - Launch Browser, maximize window, validate title & close browser
		Automate using Browser Selenium Commands - Launch browser, maximize, validate page title and close browser. 
		It should be your first webdriver script.*/

		/*Steps to Automate:
		1. Open this link - https://www.techlistic.com/
		2. Launch Firefox browser. (You can choose browser of your choice).
		3. Maximize or set size of browser window.
		4. Get Title of page and validate it with expected value.
		5. Get URL of current page and validate it with expected value.
		6. Get Page source of web page.
		7. And Validate that page title is present in page source.
		8. Close browser.*/


		
		 WebDriver driver = new ChromeDriver();
		 String expectedTitle = "Techlistic";
		 
		 //1. Open this link - https://www.techlistic.com/
		 	driver.get("https://www.techlistic.com");
		 
		 //3. Maximize or set size of browser window.
		 	driver.manage().window().maximize();

		 //4. Get Title of page and validate it with expected value.
		 		 
		 	String pageTitle = driver.getTitle();
		 		System.out.println(pageTitle);
		 
		 	if (expectedTitle == pageTitle ) {
		 		System.out.println("Title test passed");
		 	} 
		 		else {
		 			System.out.println("Title test failed");
		 		}
		 	
		 //5. Get URL of current page and validate it with expected value.
 		 	String pageURL = driver.getCurrentUrl();
 		 		System.out.println(pageURL);
		 	
		 	// Validate Current Page URL
		 	if(pageURL == "https://www.techlistic.com/p/selenium-tutorials.html") {
		 		System.out.println("Test Passed.");
		 	}
		 		else {
		 			System.out.println("Test Failed.");
		 		}
		 	
		 //6. Get Page source of web page.
		 		driver.getPageSource();
		 	
		 	
		 //8. Close browser.*/
		 		driver.close();
		 		driver.quit();
		 
		 

	}

}
