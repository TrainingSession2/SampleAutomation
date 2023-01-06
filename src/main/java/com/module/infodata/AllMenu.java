package com.module.infodata;

import org.testng.annotations.Test;

import com.hcl.base.BaseClass;
import com.hcl.base.SeleniumCore;
import com.hcl.base.SeleniumUtils;
import com.module.locators.ReuseLocators;

public class AllMenu extends BaseClass{

	SeleniumUtils seleniumUtils=new SeleniumUtils();
	SeleniumCore seleniumcore=new SeleniumCore();
	ReuseLocators reuseLocators=new ReuseLocators();

	
	@Test
	public void OrangehrmMenu() {
		seleniumUtils.waitForSec(3000);
		seleniumUtils.enterTextOnElement("name", "username", "Admin");
		seleniumUtils.enterTextOnElement("name", "password", "admin123");
		seleniumUtils.clickOnElement("xpath", "//button[@type='submit']");
		seleniumUtils.waitForSec(4000);
}
	public String ClickOnElement(String ClickOnElement) {
		String xpath="//span[text()='\"+Admin+\"']//parent::a";
		return xpath;
	}
}
