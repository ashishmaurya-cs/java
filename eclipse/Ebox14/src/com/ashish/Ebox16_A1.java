package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebox16_A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://app.e-box.co.in/uploads/indexMatch.html");
		String  name = driver.findElement(By.xpath("//h1[contains(text(),'Map Events')]")).getText();
	    name.contains("Map Events");
        
        String event1 = driver.findElement(By.id("event1")).getText();
        event1.contains("Organizer :");
        
        String owner1= driver.findElement(By.id("owner1")).getText();
        owner1.contains("Andrea");
        
        String colorBefore= driver.findElement(By.id("owner1")).getCssValue("color");
        colorBefore.contains("rgba(51, 51, 51, 1)");
        System.out.println(colorBefore);
        
        new Actions(driver)
       .clickAndHold(driver.findElement(By.id("owner1")))
       .moveToElement(driver.findElement(By.xpath("//div[@id='event1']")))
       .release(driver.findElement(By.xpath("//div[@id='event1']")))
       .build()
       .perform();
       
        String colorafter= driver.findElement(By.id("owner1")).getCssValue("color");
        colorafter.contains("rgba(0, 128, 0, 1)");
        System.out.println(colorafter);
	}
}
