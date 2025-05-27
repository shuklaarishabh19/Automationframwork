package com.example.seleniumTestNG.selenium_testng_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	public void test() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.iimjobs.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rishabh.s8@iimjobs.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String a=driver.getTitle();
		System.out.println("rishabh");
		System.out.println(a);
	}

}
