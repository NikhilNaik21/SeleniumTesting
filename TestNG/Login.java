package com.com.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Login {
	
	 public static WebDriver dr ;
	 String parentWindow;
	 
	 
	  @Parameters ({"uname","pwd"})          // hidding password passing username password through xml 
  @Test
  public void f(String uname , String pwd) throws InterruptedException {
		  
		  dr.findElement(By.xpath("//a[contains(text(),'here')]")).click();
			//a[contains(text(),'here')]
			Thread.sleep(3000);
			dr.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("naiknikhil5966@gmail.com");
			dr.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
			Thread.sleep(3000);
			dr.navigate().back();
			dr.navigate().back();
			Thread.sleep(3000);
	  
	  dr.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(uname);
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(pwd);
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	  

  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
	  dr = new ChromeDriver();
	  
	  
		dr.get("https://demo.guru99.com/v4");
		dr.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  dr.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	  Thread.sleep(2000);
	  Alert al =  dr.switchTo().alert();
	  System.out.println(al.getText());
	al.dismiss();
	 // dr.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	  Thread.sleep(3000);
dr.close();
  }

}
