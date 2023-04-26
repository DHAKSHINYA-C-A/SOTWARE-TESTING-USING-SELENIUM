package com.Pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day53 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement cid=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		cid.sendKeys("401");
		WebElement button1=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		button1.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(3000);
		cid.clear();
		cid.sendKeys("402");
		button1.click();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		Alert alert3=driver.switchTo().alert();
		String txt=alert3.getText();
		alert3.accept();
		System.out.println(txt);
		
	}

}
