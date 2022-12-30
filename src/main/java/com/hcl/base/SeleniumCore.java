package com.hcl.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCore extends BaseClass{

	public static Actions actions;
	
	public void pressEnterButton() {
		actions =new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void pressTabButton() {
		actions =new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
	}
	
	public void pressEscButton() {
		actions =new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public void clickOnMenu(WebElement element) {
		actions =new Actions(driver);
		actions.click(element).build().perform();
	}

}
