package com.module.locators;

public class ReuseLocators {

	public String inputFieldName(String textboxName) {
		String xpath="//label[text()='"+textboxName+"']//parent::div//following-sibling::div//input";
		return xpath;
	}

	public String dropdownFieldName(String dropdownName) {
		String xpath="//label[text()='"+dropdownName+"']//parent::div//following-sibling::div//div[@class='oxd-select-text-input']";
		return xpath;
	}

	public String textAreaFieldName(String textAreaName) {
		String xpath="//label[text()='"+textAreaName+"']//parent::div//following-sibling::div//textarea";
		return xpath;
	}
	
}
