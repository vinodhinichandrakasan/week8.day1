package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class Contact extends ProjectSpecificMethods {
	
	public Contact(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateContact clickCreateContact()
	{
		driver.findElement(By.linkText("Create Contact")).click();
		return new CreateContact(driver) ;
	}

}
