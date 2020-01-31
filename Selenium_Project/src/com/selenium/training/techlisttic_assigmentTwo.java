package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class techlisttic_assigmentTwo {

	public static void main(String[] args) {
		
     
		/*Assignment 2: Automate Menu Links and Validate Page Titles using Selenium
		Automate Menu Links and Validate Page Titles to verify that when clicking on menu links then users are landing on correct pages.
		Assignment Level - Beginner*/

		/*Steps to Automate:
		1. Open this link  https://www.techlistic.com/
		2. Launch Firefox browser. (You can choose browser of your choice).
		3. Maximize or set size of browser window.
		4. Click on 'Java Tutorial' link and validate page title.
		5. Navigate back to Home Page.
		6. Click on 'Selenium Tutorial' link and validate page title.
		7. Navigate back to Home Page.
		8. Click on 'Selenium Blogs' link and validate page title.
		9. Navigate back to Home Page.
		10. Close the browser.*/
		
		
		//1. Open this link  https://www.techlistic.com/
		//2. Launch Firefox browser. (You can choose browser of your choice).
		//3. Maximize or set size of browser window.
			WebDriver driver = new ChromeDriver();
			String pageURL = "https://www.techlistic.com/";
			driver.navigate().to(pageURL);
			driver.manage().window().maximize();
			
		//4. Click on 'Java Tutorial' link and validate page title.
			
			driver.findElement(By.xpath("//a[contains(text(), 'Java')]")).click();
			
			String expectedJavaTitle = "Java Tutorials Series - Java For Selenium";
			String pageJavaTitle = driver.getTitle();
			//System.out.println(pageJavaTitle);
			
			if(pageJavaTitle.equals(expectedJavaTitle)) {
				System.out.println("The title page is correct - Passed");
			} else {
				System.out.println("The title page is wrong - Failed");
			}
		
		
		//5. Navigate back to Home Page.
			driver.navigate().back();
			
		//6. Click on 'Selenium Tutorial' link and validate page title.
			driver.findElement(By.xpath("//a[contains(text(), 'Selenium')]")).click();
			String seleniumPageTitle = driver.getTitle();
			//System.out.println(seleniumPageTitle);
			
			if(seleniumPageTitle == "Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials") {
				                     	
				System.out.println("The title page is wrong - Failed");
			} else {
				System.out.println("The title page is correct - Passed");
			}
					
		//7. Navigate back to Home Page.
			
			driver.navigate().to(pageURL);
			
		//8. Click on 'Selenium Blogs' link and validate page title.
			
			driver.findElement(By.className("overflow-button-container")).click();
			driver.findElement(By.xpath("//*[@id='PageList1']/div/div[2]/div/ul/li[13]/a")).click();
			
				String expectedBlogsTitle = "Top Selenium Blogs";
				String actualBlogsTitle = driver.getTitle();
			
					if(actualBlogsTitle.equals(expectedBlogsTitle)) {
						System.out.println("The title page is wrong - Passed");
					}		 else {
						System.out.println("The title page is correct - Failed");
					}
			
		//9. Navigate back to Home Page.
			driver.findElement(By.xpath("//a[contains(text(), 'Home')]")).click();
			
		
		//10. Close the browser.
			driver.close();
			driver.quit();
		
		
	}

}
