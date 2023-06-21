package com.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "D:\\Nashik03-04-2023\\Selenium data\\Gecko32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		Thread.sleep(2000);
		dr.get("https://www.google.com/");
	}

}
