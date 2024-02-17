package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebox17_6 {
private static String h1Element;
private static String result2;
private static String result3;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://app.e-box.co.in/uploads/handlingRegex.html");
	h1Element=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/h1[1]/center[1]")).getText();
    h1Element.contains("Registration");
    
    driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[1]")).click();
    String result1 = driver.findElement(By.id("validationResult")).getText();
    System.out.println(result1);
	driver.get("https://app.talentrank.in/uploads/indexWaits1_new.html");
    driver.findElement(By.id("first_name")).sendKeys("Maya");
    driver.findElement(By.id("last_name")).sendKeys("Sri");
    driver.findElement(By.id("address")).sendKeys("124, Sai baba layout");
    driver.findElement(By.id("city")).sendKeys("Coimbatore");
    driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
    driver.findElement(By.id("country")).sendKeys("India");
    driver.findElement(By.id("pincode")).sendKeys("654343");
    driver.findElement(By.id("username")).sendKeys("Maya");
    driver.findElement(By.id("password")).sendKeys("maya123");
    driver.findElement(By.id("email")).sendKeys("mayagmail.com");
    driver.findElement(By.tagName("input")).click();
    result2=driver.findElement(By.id("validationResult")).getText();
    result2.contains("Invalid E-mail Id");
    
    driver.findElement(By.id("first_name")).sendKeys("Maya");
    driver.findElement(By.id("last_name")).sendKeys("Sri");
    driver.findElement(By.id("address")).sendKeys("124, Sai baba layout");
    driver.findElement(By.id("city")).sendKeys("Coimbatore");
    driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
    driver.findElement(By.id("country")).sendKeys("India");
    driver.findElement(By.id("pincode")).sendKeys("654343");
    driver.findElement(By.id("username")).sendKeys("Maya");
    driver.findElement(By.id("password")).sendKeys("maya123");
    driver.findElement(By.id("email")).sendKeys("maya@gmail.com");
    driver.findElement(By.tagName("input")).click();
    result3=driver.findElement(By.id("validationResult")).getText();
    result3.contains("Registration Successfull");
}
}
