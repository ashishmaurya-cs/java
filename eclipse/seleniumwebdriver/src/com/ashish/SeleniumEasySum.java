package com.ashish;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasySum {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("sum1")).sendKeys("4");
		driver.findElement(By.id("sum2")).sendKeys("6");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]"));
		
		
	}

}
