package com.module.scripts;

import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumUtils;
import com.module.locators.ReuseLocators;
import com.module.utils.LoginUtils;

public class EmpListPIM extends BaseClass {

	SeleniumUtils seleniumUtils=new SeleniumUtils();
	ReuseLocators reuseLocators=new ReuseLocators();
	LoginUtils loginUtils=new LoginUtils();
	
	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas("Admin", "admin123");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.clickOnElement("xpath", "//a//span[text()='PIM']");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.inputFieldName("Employee Name"), "automation");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.inputFieldName("Employee Id"), "43677689");
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("xpath", reuseLocators.inputFieldName("Supervisor Name"), "dhjjjhghjj");
		seleniumUtils.waitForSec(3000);
	}
	
}
