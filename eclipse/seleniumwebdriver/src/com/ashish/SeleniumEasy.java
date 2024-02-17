package com.ashish;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("user-message")).sendKeys("Maurya");
		
		
		
	}

}
