package com.module.scripts;

import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumUtils;
import com.module.locators.ReuseLocators;

public class EmpListPIM extends BaseClass {

	SeleniumUtils seleniumUtils=new SeleniumUtils();
	ReuseLocators reuseLocators=new ReuseLocators();

	@Test
	public void loginApplication() {
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("name", "username", "Admin");
		seleniumUtils.enterTextOnElement("name", "password", "admin123");
		seleniumUtils.clickOnElement("xpath", "//button[@type='submit']");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.clickOnElement("xpath", "//a//span[text()='PIM']");
		seleniumUtils.waitForSec(3000);
		
		
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.inputFieldName("Employee Name"), "automation");
		
		
	}
	
}
