package com.test.BBD.stepdefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
	public static WebDriver driver;
	@Given("^User is on Home Page")
	public void user_is_on_Home_Page() throws Throwable{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");
	}
	
	@When("^User Navigate to LogIn Page")
	public void user_enters_UserName_and_Password() throws Throwable {
		 driver.findElement(By.id("log")).sendKeys("testuser_1"); 
		     driver.findElement(By.id("pwd")).sendKeys("Test@123");
		     driver.findElement(By.id("login")).click();
	}
	
	@Then("^Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws Throwable {
		 System.out.println("Login Successfully");
		 }
	
	@When("^User LogOut from the Application")
	public void user_LogOut_from_the_Application() throws Throwable {
		 driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		 }
	
	@Then("^Message displayed LogOut Successfully\n")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
 }
}
