package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Test {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/usr/binchromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
