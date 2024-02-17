package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebox17_1 {
	 private static boolean firstDivPresent;
	private static String firstDivElementText;
	private static boolean secondDivPresent;
	private static String secondDivElementText;
	private static boolean thirdDivPresent;
	private static String thirdDivElementText;

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://app.e-box.co.in/uploads/Eventsforce.html");
		
	         if(driver.findElement(By.id("firstDiv")).isDisplayed()){
	               firstDivPresent = true;
	          }
	           firstDivElementText= driver.findElement(By.id("firstDiv")).getText(); 
	           
	        if(driver.findElement(By.id("secondDiv")).isDisplayed()){
	               secondDivPresent = true;
	          }
	           secondDivElementText= driver.findElement(By.id("secondDiv")).getText(); 

	        if(driver.findElement(By.id("thirdDiv")).isDisplayed()){
	               thirdDivPresent = true;
	          }
	          thirdDivElementText= driver.findElement(By.id("thirdDiv")).getText(); 
			  
			 driver.close();
			 
			 
			 
			 
	 }
}
