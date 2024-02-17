package com.ashish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.junit.After;
import org.junit.Before;

public class JunitNana {
	
    private WebDriver driver;
	public static String baseUrl = "F:/selenium testing website/seleniumTesting.html";
	public static String h1Text;

	
	@Before
	public void setup() throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "F:/software/chroomedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

	}

	@Test
	public void test() throws Exception {
		
	    h1Text = driver.findElement(By.id("h1Tag")).getText();
 		System.out.println(h1Text);
 		System.out.println();
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	

}
