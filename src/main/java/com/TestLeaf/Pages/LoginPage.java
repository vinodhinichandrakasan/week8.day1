package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String username)
	{
		
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	public Homepage clickLogin()
	{
		
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage(driver);
	}
	
	

}
