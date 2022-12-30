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
	public void selectByIndex(WebElement element, int value) {
		Select select=new Select(element);
		select.selectByIndex(value);
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByValue(WebElement element) {
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
		for (int i = 0; i < list.size(); i++) {
			String value=list.get(i).getAttribute("value");
			select.selectByValue(value);
			System.out.println(value);
		}	
	}

}
