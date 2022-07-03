package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class DuplicateLead extends ProjectSpecificMethods{
	
	public DuplicateLead(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public DuplicateLead verifyTitle(String expData)
	{
		 String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		 System.out.println(title);
		 Assert.assertEquals(title,expData);
		 return this;
	}

}
