package com.module.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.hcl.base.BaseClass;

public class Login extends BaseClass {
	
	@Test
	public void sampel() throws InterruptedException {
		


		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("raja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sriram");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sriram948@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("hardik143");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("28");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2000");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
	}

}
