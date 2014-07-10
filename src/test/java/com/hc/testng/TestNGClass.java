package com.hc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGClass {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
		  driver =  new FirefoxDriver();
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
		  driver.quit();
	  }


	  @Test
	  public void test1() {
		System.out.println("test1");
	    driver.get("http://www.google.com");
	  }

	  @Test
	  public void test3() {
	    System.out.println("test3");
}

}
