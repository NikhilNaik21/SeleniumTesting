package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nashik03-04-2023\\Selenium data\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demo.automationtesting.in/Register.html");
		dr.manage().window().maximize();
		Thread.sleep(5000);
//First name
		WebElement web = dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		web.sendKeys("nik");
		Thread.sleep(1000);
		web.clear();
		Thread.sleep(1000);
		web.sendKeys("Nikhil");
	//printing in console
		String S = web.getAttribute("value");
		System.out.println(S);

//		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Nikhil");
//Last name
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Naik");
//Address
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Nashik 65535");
//Email
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("naiknikhil5966@gmail.com");
//Mobile
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("876687484");
		
		
//Gender
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
//Hobbies

		dr.findElement(By.xpath("//input[@id='checkbox1']")).click();
		dr.findElement(By.xpath("//input[@id='checkbox2']")).click();
		

//languages		
		//dr.findElement(By.xpath("//div[@id='msdd']")).sendKeys("English");
		
		
	//Skills
		//Used class Select for Drop-down list to automate
		
		Select Skills = new Select(dr.findElement(By.xpath("//select[@id='Skills']")));
		Skills.selectByVisibleText("C");
		Thread.sleep(2000);
		
	//Select Country
		
		//dr.findElement("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]");
//		Select Country = new Select(dr.findElement(By.xpath("//span[@id='select2-country-container']")));
//		Country.deselectAll();
//		Country.selectByVisibleText("Value4");
		
		
	//DATE of BIRTH
		Select year = new Select(dr.findElement(By.xpath("//select[@id='yearbox']")));
		year.selectByVisibleText("1997");
		
		Select MOnth = new Select(dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
		MOnth.selectByIndex(10);
		
		Select date = new Select(dr.findElement(By.xpath("//select[@id='daybox']")));
		date.selectByValue("21");

		
//		password
		dr.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Nikhil");

//		confirm password
		dr.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Nikhil123");

		
		
		
		
		// methods :    to print title
		String title = "Register";
		if(dr.getTitle().equals(title))
		{
		System.out.println("Pass");
		System.out.println("Page Title = "+title);
		
		}
		else
		{
			System.out.println("Fail");
		System.out.println("Page Title = "+title);
		
		//submit
		//dr.findElement(By.xpath("//button[@id='submitbtn']"));
		//button[@id='submitbtn']
		}
	}

}
