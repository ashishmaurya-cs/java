package com.ashish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EEEE {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//driver.get("F:/Ashwani Travels/index.html");https://ashishm.netlify.app/
	driver.get("https://ashishm.netlify.app/");
}
}
