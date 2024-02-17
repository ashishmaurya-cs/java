package com.ashish;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSelenium {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F://software/chroomedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("F:/selenium testing website/seleniumTesting.html");
		// Testing Login page

		String h1Text = driver.findElement(By.id("h1Tag")).getText();
		System.out.println(h1Text);
		System.out.println();
		
		String h2Text = driver.findElement(By.id("h2Tag")).getText();
		System.out.println(h2Text);
		System.out.println();
		
		
		String h4Text = driver.findElement(By.id("h4Tag")).getText();
		System.out.println(h4Text);
		System.out.println();
		
		String table = driver.findElement(By.className("table")).getText();
		System.out.println(table);
		System.out.println();
		
		
		String login = driver.findElement(By.className("Loginbox")).getText();
		WebDriverWait wait = new WebDriverWait(driver,30);
		System.out.println(login);
		System.out.println();
		
		driver.findElement(By.id("TeamNo")).sendKeys("Team3");
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		driver.findElement(By.id("button")).click();
		Alert alert1 = driver.switchTo().alert();
		WebDriverWait wait2 = new WebDriverWait(driver,50);
		driver.switchTo().alert().accept();
		System.out.println("Login Unsuccessful");
		System.out.println();
		driver.navigate().refresh();
		
		
		driver.findElement(By.id("TeamNo")).sendKeys("Team2");
		driver.findElement(By.id("button")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println("Login Successful");
		driver.switchTo().alert().accept();
		
	
	}

}
