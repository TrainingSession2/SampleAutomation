package com.module.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.hcl.base.BaseClass;

public class Login extends BaseClass {
	
	@Test
	public void sampel() {
		

		
		//Actions actions=new Actions(driver);
		Actions actions=new Actions(driver);
		actions.sendKeys(driver.findElement(By.id("email")), "ramyashihb").build().perform();

		actions.sendKeys(driver.findElement(By.id("pass")), "1234456").build().perform();

		//actions.click(driver.findElement(By.name("login"))).build().perform();

		
		//driver.findElement(By.name("login")).submit();
		//driver.findElement(By.name("login")).click();

		//actions.sendKeys(Keys.ENTER).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		
	}

}
