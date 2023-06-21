package com.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		//google
		String parentWindow = dr.getWindowHandle();
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
	//G-mail	
		
		dr.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		String Child1 = dr.getWindowHandle();
		dr.get("https://mail.google.com/mail/u/0/#inbox");
		
		
		
		System.out.println(dr.getTitle());
		Thread.sleep(2000);
		dr.switchTo().window(parentWindow);
		System.out.println(dr.getCurrentUrl());
		Thread.sleep(2000);
		
		dr.switchTo().newWindow(WindowType.TAB);
		
		String child2 = dr.getWindowHandle();
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		dr.switchTo().window(Child1);
		Thread.sleep(2000);
		dr.close();
		dr.quit();

	}

}
