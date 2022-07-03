package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class MyHomepage extends ProjectSpecificMethods {
	
	public MyHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LeadPage clickLead()
	{
		
		driver.findElement(By.linkText("Leads")).click();
		return new LeadPage(driver);
	}
	
	public Contact clickContact()
	{
		driver.findElement(By.linkText("Contacts")).click();
		return new Contact(driver);
	}

}
