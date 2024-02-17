package com.ashish;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebox16_3 {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://app.e-box.co.in/uploads/index_10538.html");
			
			driver.findElement(By.id("name")).sendKeys("Birthday Party");
			driver.findElement(By.id("venue")).sendKeys("HR Mahal");
			driver.findElement(By.id("date")).sendKeys("06/09/2018");
			driver.findElement(By.id("price")).sendKeys("120000");
			driver.findElement(By.id("count")).sendKeys("2");
			
			driver.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[7]/td[2]/button[1]")).click();;
			String alertMessa=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println(alertMessa);
			driver.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[7]/td[2]/button[1]")).click();
			Alert alert1=driver.switchTo().alert();
			driver.switchTo().alert().dismiss();
			
			String name=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[8]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")).getText();
			String venue=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[8]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
			String date=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[8]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
			String price=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[8]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")).getText();
			if(name.equals("Birthday Party")){
				System.out.println(true);
			}
			if(venue.equals("HR Mahal")){
				System.out.println(true);
			}
			if(date.equals("2018-06-09")){
				System.out.println(date);
			}
			
			if(price.equals("240000")){
				System.out.println(true);
			}
			
			//driver.close();
	}


}
