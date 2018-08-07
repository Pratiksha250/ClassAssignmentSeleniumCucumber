package com.capgemini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\pdhandar\\Desktop\\3\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//source
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
		
		//destination
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
		Thread.sleep(1000);
		
		//date
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[2]")).click();
		
		//go to next page
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(4000);
		
		
		//view seats
		driver.findElement(By.xpath("//*[@id=\"8151749\"]/div/div[2]/div[1]")).click();
		Thread.sleep(10000);
		
		//boarding pt
		driver.findElement(By.xpath("//*[@id=\"8151749\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")).click();
		Thread.sleep(5000);
		
		
		//dropping pt
		driver.findElement(By.xpath("//*[@id=\"8151749\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]/span[2]")).click();
		Thread.sleep(5000);
		
		//proceed
		driver.findElement(By.xpath("//*[@id=\"8151749\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
		Thread.sleep(4000);
		//fill form___________________
		
		//name
		driver.findElement(By.xpath("//*[@id=\"seatno-04\"]")).sendKeys("Jane Austen");
		
		//gender
		driver.findElement(By.xpath("//*[@id=\"22_0\"]")).click();
		
		//age
		driver.findElement(By.xpath("//*[@id=\"seatno-01\"]")).sendKeys("22");
		
		//email
		driver.findElement(By.xpath("//*[@id=\"seatno-05\"]")).sendKeys("hellojane@hotmail.com");
		
		//phone number
		driver.findElement(By.xpath("//*[@id=\"seatno-06\"]")).sendKeys("9876543210");
		
		//checkbox selection
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[1]/span[2]")).click();
		
		//proceed to pay
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
		
	}
	
	



}
