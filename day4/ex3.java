package com.Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Dhakshinya");
		WebElement remail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		remail.sendKeys("dhakshinyaca@gmail.com");
		WebElement yname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yname.sendKeys("Keerthana");
		WebElement ymail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		ymail.sendKeys("keerthana@gmail.com");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]"));
		button.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(3000);
		WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		message.sendKeys("Hi");
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amount.sendKeys("1");
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
				button1.click();
	
	
	}

}
