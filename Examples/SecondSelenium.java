package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.navigate().to("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(3000);
		dr.get("https://www.facebook.com/");
		dr.navigate().forward();
		dr.get("https://www.instagram.com/");
		dr.navigate().refresh();
	}

}
