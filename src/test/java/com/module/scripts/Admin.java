package com.module.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumCore;
import com.hcl.base.SeleniumUtils;
import com.module.locators.ReuseLocators;

public class Admin extends BaseClass{
	
	SeleniumUtils seleniumUtils=new SeleniumUtils();
	SeleniumCore seleniumcore=new SeleniumCore();
	ReuseLocators reuseLocators=new ReuseLocators();

	
	@Test
	public void adminModule() {
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("name", "username", "Admin");
		seleniumUtils.enterTextOnElement("name", "password", "admin123");
		seleniumUtils.clickOnElement("xpath", "//button[@type='submit']");
		seleniumUtils.waitForSec(4000);
		seleniumcore.clickOnMenu(driver.findElement(By.xpath("//span[text()='Admin']")));
		seleniumUtils.waitForSec(4000);
		seleniumcore.clickOnSubMenu(driver.findElement(By.xpath("//span[text()='Job ']")));
		seleniumUtils.waitForSec(4000);
		seleniumcore.moveToElements(driver.findElement(By.xpath("//a[text()='Job Titles']")));
		seleniumUtils.waitForSec(4000);
		seleniumUtils.clickOnElement("xpath", "//button[text()=' Add ']");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.inputFieldName("Job Title"), "QA");
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.textAreaFieldName("Job Description"), "anbkabdkkhkhkhvkvvcjsjk");
		seleniumUtils.waitForSec(4000);
		seleniumUtils.clickOnElement("xpath", "//div[text()='Browse']");
		seleniumUtils.clickOnElement("xpath", "//div[text()='No file chosen']");
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.textAreaFieldName("Note"), "mbxhgdchgchgchacah");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.clickOnElement("xpath", "//button[text()=' Cancel ']");
		seleniumUtils.waitForSec(3000);
		
	}


}
