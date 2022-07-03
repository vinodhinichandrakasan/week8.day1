package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods{
	
	public EditLead(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public EditLead updateCompanyName(String newCompName)
	{
		 WebElement ele2=driver.findElement(By.id("updateLeadForm_companyName"));
		 ele2.clear();
		 //String newcomp="comp";
		 ele2.sendKeys(newCompName);
		return this;
	}
	
	public ViewLeadpage saveEdit()
	{
		driver.findElement(By.xpath("//*[@class='smallSubmit']")).click();
		return new ViewLeadpage(driver);
	}
	

}
