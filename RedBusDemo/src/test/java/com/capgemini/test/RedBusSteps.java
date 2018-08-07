package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusSteps {

	WebDriver driver;
	
	@Given("^user is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\pdhandar\\Desktop\\3\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Then("^user has entered \"(.*?)\" as source$")
	public void user_has_entered_as_source(String arg1) throws Throwable {
		driver.findElement(By.id("src")).sendKeys(arg1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
		
	}

	@And("^user enters \"(.*?)\" as destination$")
	public void user_enters_as_destination(String arg1) throws Throwable {
		driver.findElement(By.id("dest")).sendKeys(arg1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
	}

	@And("^user selects \"(.*?)\" as the date, \"(.*?)\" as the month-year$")
	public void user_selects_as_the_date(String day, String month_year) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		WebElement d=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[3]"));
		WebElement m=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
		assertEquals(month_year, m.getText());
		assertEquals(day, d.getText());
		d.click();
	
	}

	@When("^user presses Search buses$")
	public void user_presses_Search_buses() throws Throwable {
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(4000);
	}

	@Then("^the user should move to booking page$")
	public void the_user_should_move_to_booking_page() throws Throwable {
	    assertEquals(driver.getCurrentUrl(), "https://www.redbus.in/search?fromCityName=Pune&fromCityId=130&toCityName=Mumbai&toCityId=462&onward=15-Aug-2018&opId=0&busType=Any");
	}
	
	@When("^user selects view seats$")
	public void user_selects_view_seats() throws Throwable{
		driver.findElement(By.xpath("//*[@id=\"8151749\"]/div/div[2]/div[1]")).click();
		Thread.sleep(10000);
	}
	
	@Then("^boarding pt \"(.*?)\" is selected by user$")
	public void boarding_pt_is_selected_by_user(String arg1) throws Throwable {
		
		WebElement e = driver.findElement(By.xpath("//*[@id=\"8151749\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]"));
//		String[] input = new String[2]; 
//		String a,b;
//		e.getText().split("\n");
//		a=input[0];
//		b=input[1];
//		System.out.println(a);
//		System.out.println(b);
//		assertEquals(a, arg1);
		e.click();
		Thread.sleep(6000);
	}

	@And("^dropping pt is selected as \"(.*?)\" by user$")
	public void dropping_pt_is_selected_as_by_user(String arg1) throws Throwable {
		WebElement e=driver.findElement(By.xpath("//*[@id=\"8151749\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]"));
		//System.out.println(e.getText());
//		String[] input = new String[2]; 
//		String a;
//		e.getText().split(" ");
//		a=input[0];
//		
//		assertEquals(a, arg1);
		e.click();
		Thread.sleep(6000);
	}

	@When("^user presses proceed$")
	public void user_presses_proceed() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"8151749\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
		Thread.sleep(4000);
	}

	@Then("^user enters \"(.*?)\" as name$")
	public void user_enters_as_name(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"seatno-04\"]")).sendKeys(arg1);
	}

	@And("^user selects \"(.*?)\" as gender$")
	public void user_selects_as_gender(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"22_0\"]")).click();
	}

	@And("^user enters \"(.*?)\" as age$")
	public void user_enters_as_age(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"seatno-01\"]")).sendKeys(arg1);
	}

	@And("^user enters \"(.*?)\" as email$")
	public void user_enters_as_email(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"seatno-05\"]")).sendKeys(arg1);
	}

	@And("^user enters \"(.*?)\" as phone number$")
	public void user_enters_as_phone_number(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"seatno-06\"]")).sendKeys(arg1);
	}

	@And("^user selects \"(.*?)\" checkbox$")
	public void user_selects_checkbox(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[1]/span[2]")).click();
	}

	@When("^user selects proceed to pay$")
	public void user_selects_proceed_to_pay() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
	    
	}

	@Then("^user is directed to \"(.*?)\" Page$")
	public void user_is_directed_to_Page(String arg1) throws Throwable {
	   //assertEquals(driver.getCurrentUrl(),"https://www.redbus.in/[search?fromCityName=Pune&fromCityId=130&toCityName=Mumbai&toCityId=462&onward=15-Aug-2018&opId=0&busType=Any");
	    
	}
	
	
}
