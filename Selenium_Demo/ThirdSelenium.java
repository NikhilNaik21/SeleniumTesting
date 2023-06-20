package com.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demo.guru99.com/v4/");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//a[contains(text(),'here')]")).click();
		//a[contains(text(),'here')]
		Thread.sleep(5000);
		dr.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("naiknikhil5966@gmail.com");
		dr.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
		dr.navigate().back();
		dr.navigate().back();
		Thread.sleep(5000);

		dr.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr510047");
		Thread.sleep(2000);

		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("pYnUruq");
		Thread.sleep(2000);

		dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	}

}
