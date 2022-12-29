package com.module.scripts;

import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumUtils;

public class Login extends BaseClass {
	SeleniumUtils seleniumutils=new SeleniumUtils();
	
	@Test
	public void sampel() throws InterruptedException {
		seleniumutils.enterTextOnElement("id", "email", "Gayathri");
		seleniumutils.enterTextOnElement("id", "pass", "123fsfjhv");
		seleniumutils.waitForSec(4000);
		seleniumutils.clickOnElement("name", "login");
		seleniumutils.waitForSec(4000);	
	}

}

