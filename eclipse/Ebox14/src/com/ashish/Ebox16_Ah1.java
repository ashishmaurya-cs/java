package com.ashish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebox16_Ah1 {
private static String h1Element;
private static String nameTxt;
private static String genderTxt;
private static String result;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://app.talentrank.in/uploads/registrationInSelenium.html");
	
    driver.findElement(By.xpath("//h1[contains(text(),'Registration form')]")).isDisplayed();
    h1Element = driver.findElement(By.xpath("//h1[contains(text(),'Registration form')]")).getText();
    h1Element.contains("Registration form");
    nameTxt = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
    nameTxt.contains("Name");
    
    if(driver.findElement(By.name("userName")).isDisplayed()){
        boolean userName = true;
    }
    
     if(driver.findElement(By.name("password")).isDisplayed()){
        boolean passWord = true;
    }
	   driver.findElement(By.name("name")).sendKeys("MayaSri");
       driver.findElement(By.name("userName")).sendKeys("Maya");
       driver.findElement(By.name("password")).sendKeys("Maya123");
       driver.findElement(By.name("re-EnterPassword")).sendKeys("Maya123");
       driver.findElement(By.name("address")).sendKeys("155th Avenue, London");
       driver.findElement(By.xpath("//input[@value='female']")).click();
       Select select = new Select(driver.findElement(By.name("districtName")));
       select.selectByVisibleText("Coimbatore");
       
       driver.findElement(By.xpath("//tbody/tr[8]/td[3]/input[1]")).click();
       driver.findElement(By.name("register")).click();
       
       WebElement radio=driver.findElement(By.xpath("//input[@value='female']"));
       genderTxt=radio.getAttribute("value");
       genderTxt.contains("female");
       
       WebElement box=driver.findElement(By.xpath("//input[@value='wedding']"));
       String eventTxt = box.getAttribute("value");
       eventTxt.contains("wedding");
       
        driver.findElement(By.id("result")).isDisplayed();
        result= driver.findElement(By.id("result")).getText();
        System.out.println(result);
}
}
