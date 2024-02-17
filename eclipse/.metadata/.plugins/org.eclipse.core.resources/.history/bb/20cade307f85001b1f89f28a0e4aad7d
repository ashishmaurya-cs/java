package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebox16_2 {
	public static void main(String[] args) {
	
		 String baseUrl = "http://app.e-box.co.in/uploads/index_10555.html";
		 String stockdetails;
		  System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get(baseUrl);
			 stockdetails=driver.findElement(By.id("Stock-table")).getText();
				stockdetails.contains("Green gram");
				
		        stockdetails.contains("stock116");
			  
			  System.out.println(stockdetails);
			 driver.close();
	}

}

