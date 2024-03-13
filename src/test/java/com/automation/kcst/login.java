package com.automation.kcst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://kcstmoodle.kcst.edu.kw/login/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mitkatmoodle");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("jl4!YeHu_");
		
		driver.findElement(By.xpath("//button[@id='loginbtn']")).click();
	}

}
