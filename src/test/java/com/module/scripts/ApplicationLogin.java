package com.module.scripts;

import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.module.utils.LoginUtils;

public class ApplicationLogin extends BaseClass {

	LoginUtils loginUtils=new LoginUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
	}

}
