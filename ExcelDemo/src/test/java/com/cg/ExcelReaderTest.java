package com.cg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class ExcelReaderTest {
	
	String path="D:\\Module 3\\ExcelDemo\\Worksheet.xlsx";
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Users\\\\pdhandar\\\\Desktop\\\\3\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\Module 3\\CsvDemo\\src\\main\\webapp\\Form.html");
	}
	
	@Given("^I am sending details")
	public void sendDetails() throws Throwable
	{
		 File file = new File(path);
		 
		 FileInputStream inputStream = new FileInputStream(file);
		 Workbook workbook = new XSSFWorkbook(inputStream);

		    Sheet sheet = workbook.getSheet("Sheet1");

		  
		    int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		    for(int i=0; i<rowCount+1; i++) {
		    	Row row = sheet.getRow(i);
		    	
		    	  driver.findElement(By.id("fname")).sendKeys(row.getCell(0).getStringCellValue());
		   		  Thread.sleep(1000);
		   		  driver.findElement(By.id("lname")).sendKeys(row.getCell(1).getStringCellValue());
		   		  Thread.sleep(1000);
		   		  driver.findElement(By.id("city")).sendKeys(row.getCell(2).getStringCellValue());
		   		  Thread.sleep(1000);
		   		  driver.findElement(By.id("btn")).click();
		   		  Thread.sleep(1000);
		   		  driver.switchTo().alert().accept();
		   		  Thread.sleep(1000);
		    
		    }        

		    
	}
		    

		    



}
	

