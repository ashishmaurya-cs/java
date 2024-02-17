package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	public static void main(String[] args) {
		  String baseUrl = "http://hcl.e-box.co.in/uploads/Selenium_base_projects/19266-index.html";
		  @SuppressWarnings("unused")
		  boolean isButtonPresent = false;
		  String elem1 = "";
		  String elem2 = "";
		  System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get(baseUrl);
			  if(driver.findElement(By.id("button")).isDisplayed()){
				  isButtonPresent=true;
			  }
			  
			  driver.findElement(By.id("button")).click();
			  elem1=driver.findElement(By.id("elem1")).getText();
			  
			  elem2=driver.findElement(By.id("elem2")).getText();
			System.out.println(elem1+elem2);
			 driver.close();
	}

}
