package com.ashish;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Googles";
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Pass..");
		}
		else{
			System.out.println("Test Fail..");
		}
		driver.close();
	}

}
