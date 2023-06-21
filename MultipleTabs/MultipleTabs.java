package com.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demo.guru99.com/v4");
		String parentWindow = dr.getWindowHandle();
		dr.manage().window().maximize();
		dr.switchTo().newWindow(WindowType.TAB);
		String Child = dr.getWindowHandle();
		dr.get("https://www.cricbuzz.com/");
		
		dr.switchTo().window(parentWindow);
		
		
//		Thread.sleep(500);
//		dr.close();
//		dr.close();
	}

}
