package com.module.scripts;

import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumUtils;

public class ApplicationLogin extends BaseClass {

	SeleniumUtils seleniumUtils=new SeleniumUtils();

	@Test
	public void loginApplication() {
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("name", "username", "Admin");
		seleniumUtils.enterTextOnElement("name", "password", "admin123");
		seleniumUtils.clickOnElement("xpath", "//button[@type='submit']");
	}

}
