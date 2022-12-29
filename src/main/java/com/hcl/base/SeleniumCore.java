package com.hcl.base;

import org.testng.annotations.Test;

public class SeleniumCore extends SeleniumUtils {
	
	@Test
	public void sample() {
		enterTextOnElement("id", "email", "Gayathri");
		enterTextOnElement("id", "pass", "123fsfjhv");
		waitForSec(4000);
		clickOnElement("name", "login");
		waitForSec(4000);
	}

}
