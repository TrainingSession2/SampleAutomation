package com.hcl.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtils extends BaseClass {

	public void enterTextOnElement(String locatortype,String locator,String value) {
		if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("cssSelector")) {
			driver.findElement(By.cssSelector(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("partialLinkText")) {
			driver.findElement(By.partialLinkText(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("clasName")) {
			driver.findElement(By.className(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("linkText")) {
			driver.findElement(By.linkText(locator)).sendKeys(value);
		}else if (locatortype.equalsIgnoreCase("tagName")) {
			driver.findElement(By.tagName(locator)).sendKeys(value);
		}else {
			System.out.println("Given locator is not available");
		}
	}

	public void clickOnElement(String locatorType,String locator) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		}else if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locator)).click();
		}else if (locatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locator)).click();
		}else if (locatorType.equalsIgnoreCase("cssSelector")) {
			driver.findElement(By.cssSelector(locator)).click();
		}else if (locatorType.equalsIgnoreCase("partialLinkText")) {
			driver.findElement(By.partialLinkText(locator)).click();
		}else if (locatorType.equalsIgnoreCase("clasName")) {
			driver.findElement(By.className(locator)).click();
		}else if (locatorType.equalsIgnoreCase("linkText")) {
			driver.findElement(By.linkText(locator)).click();
		}else {
			System.out.println("Locator is not available");
		}
	}

	public void waitForSec(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Select select;
	public void selectDropdown(String index_Value_text,WebElement element,String dropdownValue) {
		select=new Select(element);
		if (index_Value_text.equalsIgnoreCase("index")) {
			int value=Integer.parseInt(dropdownValue);
			select.selectByIndex(value);
		}else if (index_Value_text.equalsIgnoreCase("value")) {
			select.selectByValue(dropdownValue);
		}else if (index_Value_text.equalsIgnoreCase("text")) {
			select.selectByVisibleText(dropdownValue);
		}else {
			System.out.println("Not available........");
		}
	}
	
	
	//............>>>>........ FRAMES{ Window inside another Window}.........<<<<<<......\\


	public void switchToFrameWithCount(String iframe) {
		List<WebElement>frame=driver.findElements(By.xpath(iframe));
		System.out.println("Number of Frame = "+frame.size());

		for (int i = 0; i < frame.size(); i++) {
			try {
				driver.switchTo().frame(i);

			} catch (Exception e) {
				driver.switchTo().defaultContent();
			}}
	}

}
