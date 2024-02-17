package com.ashish;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTest {
    private WebDriver driver;
	public static String baseUrl="http://app.e-box.co.in/uploads/handlingRegex.html";
	private boolean acceptNextAlert = true;
	public static Boolean userName,passWord;
	public static String h1Element,result1,result2,result3;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testWeb() throws Exception {

		h1Element=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/h1[1]/center[1]")).getText();
        h1Element.contains("Registration");
        
        driver.findElement(By.tagName("input")).click();
        result1=driver.findElement(By.id("validationResult")).getText();
        //result1.contains("First Name cannot be empty\nLast Name cannot be empty\nCity cannot be empty\nCountry cannot be empty\nUsername cannot be empty\nPassword cannot be empty\nPincode cannot be empty\nState cannot be empty\nE-mail cannot be empty");
        
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

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	}