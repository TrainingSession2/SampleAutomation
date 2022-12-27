package com.sample.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableCheckBox {

	@Test
	public void table() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);

		List<WebElement> headers=driver.findElements(By.xpath("//div[@role='columnheader']"));
		System.out.println("Total Heasers in page :::::: "+headers.size());

		for (int i = 0; i < headers.size(); i++) {

			String headerName=headers.get(i).getText();
			if (headerName.equalsIgnoreCase("Username")) {
				System.out.println(i+1);


				List<WebElement> rows=driver.findElements(By.xpath("//div[@role='row']"));
				System.out.println(rows.size());

				for (int j = 2; j <= rows.size(); j++) {
					String xpath="(//div[@role='row'][1])["+j+"]//div[@role='cell']["+(i+1)+"]/div";
					//System.out.println(xpath);
					String names=driver.findElement(By.xpath(xpath)).getText();
					System.out.println(names);


					if (names.equalsIgnoreCase("evaemigrace")) {
						String checkboxXpath="//div[@role='row'][1]["+j+"]//div[@role='cell'][1]//input";
						Thread.sleep(3000);
						//clickOnElement(checkboxXpath);
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click();", driver.findElement(By.xpath(checkboxXpath)));
						break;
					}

					

				}

			}


		}

	}


}



