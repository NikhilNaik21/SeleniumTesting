package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
//		dr.get("https://www.google.com/");
//		Thread.sleep(2000);
		dr.manage().window().maximize();
		dr.get("https://www.cricbuzz.com/");
		
		WebDriver dr1 =  new ChromeDriver();
		dr1.get("https://www.facebook.com/");
		dr.close();
		Thread.sleep(2000);
		dr1.manage().window().maximize();
		Thread.sleep(2000);
		dr1.manage().window().minimize();
		Thread.sleep(4000);
		dr1.close();

	}

}
