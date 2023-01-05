package com.module.utils;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumCore;
import com.hcl.base.SeleniumUtils;

public class LoginUtils extends BaseClass {
	
	SeleniumCore seleniumCore=new SeleniumCore();
	SeleniumUtils seleniumUtils=new SeleniumUtils();
	
	public void loginCredentilas(String username,String password) {
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("name", loc.getProperty("usernameObject"), username);
		seleniumUtils.enterTextOnElement("name", loc.getProperty("passwordObject"), password);
		seleniumUtils.clickOnElement("xpath", loc.getProperty("LoginObject"));
	}
	
	

	
}
