package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods{
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public MyHomepage clickCRMSFA()
	{
		    driver.findElement(By.linkText("CRM/SFA")).click();
			return new MyHomepage(driver);
	}

}
