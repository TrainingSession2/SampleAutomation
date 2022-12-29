package com.hcl.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCore extends BaseClass{

	public void pressEnterButton() {

		Actions actions =new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
	}

}
