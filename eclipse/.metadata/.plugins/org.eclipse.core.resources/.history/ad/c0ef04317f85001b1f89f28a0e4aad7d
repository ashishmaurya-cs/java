package com.ashish;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {
  
  public static void main(String[] args) {
	  String baseUrl = "http://hcl.e-box.co.in/uploads/Selenium_base_projects/19248-text.html";
	  @SuppressWarnings("unused")
	boolean isTagPresent = false;
	  String h1Text = "";
	  System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		  if(driver.findElement(By.tagName("h1")).isDisplayed()){
			  isTagPresent=true;
		  }
		  h1Text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(h1Text);
		 driver.close();
}
 
}

