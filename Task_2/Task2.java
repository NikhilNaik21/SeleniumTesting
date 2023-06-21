package com.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		
//opening site	
		dr.get("https://demo.guru99.com/v4");
		
//user id click		
		WebElement web1 =  dr.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		web1.click();
		
//password click		 
		 
		WebElement web2 =  dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		web2.click();
		web1.click();
		
	WebElement message1 = dr.findElement(By.xpath("//label[@id='message23']"));	
	WebElement message2 = dr.findElement(By.xpath("//label[@id='message18']"));	

	//printing text using getText() method
		System.out.println(message1.getText());
		System.out.println(message2.getText());
//		

		
		//printing message of alert pop box
		dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		Alert al =dr.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(1000);
		//al.accept();
		al.dismiss();
	}

}
