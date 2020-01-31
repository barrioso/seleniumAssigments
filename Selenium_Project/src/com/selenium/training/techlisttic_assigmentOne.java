package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlisttic_assigmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver = new ChromeDriver();
		 String expectedTitle = "Techlistic";
		 
		 driver.get("https://www.techlistic.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.getTitle();
		 
		 String pageTitle = driver.getTitle();
		 System.out.println(pageTitle);
		 
		 	if (expectedTitle == pageTitle ) {
		 		System.out.println("Title test passed");
		 	} 
		 		else {
		 			System.out.println("Title test failed");
		 		}
		 	
		 //Get Current URL
		 	driver.getCurrentUrl();

		 	//Code implementation example
		 	String pageURL = driver.getCurrentUrl();
		 	System.out.println(pageURL);
		 	
		 	// Validate Current Page URL
		 	if(pageURL == "https://www.techlistic.com/p/selenium-tutorials.html") {
		 		System.out.println("Test Passed.");
		 	}
		 		else {
		 			System.out.println("Test Failed.");
		 		}
		 	
		 // Get Page Source
		 	driver.getPageSource();

		 	// Or
		 	String sourceCode = driver.getPageSource();
		 	System.out.println(sourceCode);
		 
		 driver.close();
		 driver.quit();
		 
		 

	}

}
