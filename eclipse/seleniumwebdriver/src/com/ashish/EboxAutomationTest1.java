package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EboxAutomationTest1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		
		
		//code for launch the application.
		WebDriver driver=new ChromeDriver();
		driver.get("http://hcl.e-box.co.in/uploads/Selenium_base_projects/19248-text.html");
		
		
		//code for check tag is present or not
		boolean isTagPresent = false;
		WebElement header=driver.findElement(By.xpath("/html[1]/body[1]/h1[1]"));
		if(header.isDisplayed()){
			isTagPresent=true;
		}
		System.out.println(isTagPresent);
		
		//code for check test welcome message
		String expectedMessage="WELCOME TO DATAX SHIPPING COMPANY";
		String actualMessage = driver.findElement(By.xpath("//body//h1")).getText();
    	if(expectedMessage.equals(actualMessage)){
          	System.out.println("The expected message is same as actual message: "+actualMessage);
    	}
    	else{
          	System.out.println("The expected message doesn't match the actual message: "+actualMessage);
    	}
    	//code for quit chrome.
    	driver.quit();
	}

}
