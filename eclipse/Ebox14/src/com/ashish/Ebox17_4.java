package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebox17_4 {
	private static Object str1;
	private static Object str2;
	private static Object str3;
	private static String eventName;


	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://app.talentrank.in/uploads/indexWaits1_new.html");
			   if(driver.findElement(By.xpath("//a[@id='homeLink']")).getText().contains("HOME")){
				    str1 = driver.findElement(By.xpath("//a[@id='homeLink']")).getText();
				    System.out.println(str1);
				    }
				    
				    if(driver.findElement(By.xpath("//a[@id='event']")).getText().contains("EVENT")){
				     str2 = driver.findElement(By.xpath("//a[@id='event']")).getText();
				     System.out.println(str2);
				    }
				    
				    
				    if(driver.findElement(By.xpath("//a[@id='hall']")).getText().contains("HALL")){
				     str3 = driver.findElement(By.xpath("//a[@id='hall']")).getText();
				     System.out.println(str3);
				    }
				    
				   driver.findElement(By.linkText("EVENT")).click();
				   eventName = driver.findElement(By.linkText("EVENT")).getText();
				   System.out.println(eventName);
				    
				   
			
				   // driver.quit();
				  
	}
}
