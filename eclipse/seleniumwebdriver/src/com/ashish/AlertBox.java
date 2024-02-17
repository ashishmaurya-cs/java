package com.ashish;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
			Alert alert=driver.switchTo().alert();
			driver.switchTo().alert().accept();
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
			Alert alert1=driver.switchTo().alert();
			driver.switchTo().alert().dismiss();
			driver.close();
	}

}


