package com.com.day1;

import org.testng.SkipException;
import org.testng.annotations.Test;


public class Priority {


  @Test (priority = 'B')
  public void Register() {
	  System.out.println("Register");
	
  }
  
  @Test (priority = 2)
  public void Login() {
	  
	  System.out.println("Login");
	  throw new SkipException("Not Ready");
  }
  
  @Test (priority = 3)
  public void Home() {
	  System.out.println("Home");
  }
  
  @Test(priority = 'a')
  public void Logout() {
	  System.out.println("Logout");
  }
}
