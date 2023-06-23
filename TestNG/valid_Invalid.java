package com.com.day1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class valid_Invalid {
	
	public static WebDriver dr;
	
	@Parameters({"usrname","pwd"})
  @Test (priority = 1)
  public void invalid() {
		
  }
  
  
  @Test
  public void valid() {
  }
}
