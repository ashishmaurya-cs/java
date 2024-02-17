package com.ashish;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSeleniumJUnit {
	WebDriver driver;
	@Before
	public void openBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "F:/software/chroomedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		driver.get("F:/selenium testing website/seleniumTesting.html");
	}
    @Test
    public void testCase1(){
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
    }
 		
 		@Test
 		public void loginSeccessfully(){
 			String login = driver.findElement(By.id("loginh4Tag")).getText();
	 		WebDriverWait wait = new WebDriverWait(driver,30);
	 		System.out.println(login);
	 		System.out.println();
	 		
 	 		driver.findElement(By.name("TeamNumber")).sendKeys("Team2");
 	 		WebDriverWait wait1 = new WebDriverWait(driver,50);
 	 		driver.findElement(By.id("button")).click();
 	 		Alert alert1 = driver.switchTo().alert();
 	 		
 	 		WebDriverWait wait2 = new WebDriverWait(driver,50);
 	 		driver.switchTo().alert().accept();
 	 		System.out.println("Login successfully");
 	 		System.out.println();
 	 		
 		}
 		
 		@Test
 		public void loginUnsuccessful(){
 			driver.findElement(By.name("TeamNumber")).sendKeys("Team1");
 	 		driver.findElement(By.id("button")).click();
 	 		Alert alert2 = driver.switchTo().alert();
 	 		
 	 		WebDriverWait wait2 = new WebDriverWait(driver,50);
 	 		driver.switchTo().alert().accept();
 	 		System.out.println("Login Unsuccessful");
 	 		System.out.println();
 	 		
 		}
 		@After
 		public void closeBrowser(){
 			driver.quit();
 		}
    
}

