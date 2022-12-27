package com.sample.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample2 {

	int count=0;

	@Test
	public void cases() throws InterruptedException {
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
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Pay Grades")).click();
		
		Thread.sleep(5000);

		List<WebElement> headers=driver.findElements(By.xpath("//div[@role='columnheader']"));
		System.out.println("display all headers.."+headers.size());

		for (int i = 0; i < headers.size(); i++) {

			String headerName=headers.get(i).getText();
			if (headerName.equalsIgnoreCase("Name")) {
				System.out.println(i+1);


				List<WebElement> rows=driver.findElements(By.xpath("//div[@role='row']"));
				System.out.println(rows.size());

				for (int j = 2; j <= rows.size(); j++) {
					Thread.sleep(2000);
					String xpath="(//div[@role='row'][1])["+j+"]//div[@role='cell']["+(i+1)+"]/div";
					System.out.println(xpath);

					String names=driver.findElement(By.xpath(xpath)).getText();
					System.out.println(names);

					if (names.equalsIgnoreCase("Grade 1")) {
                        Thread.sleep(3000);
						String checkboxXpath="(//div[@role='row'][1])["+j+"]//div[@role='cell'][4]//button[1]";
						Thread.sleep(3000);
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].click();", driver.findElement(By.xpath(checkboxXpath)));
						break;
					}


				}
			}
		}
	}
}


