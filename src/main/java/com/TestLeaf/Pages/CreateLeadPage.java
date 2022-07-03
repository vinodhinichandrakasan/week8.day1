package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String cName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	
	public CreateLeadPage enterLastName(String lName)
	{
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
		
	}
	
	public CreateLeadPage enterdeptName(String departName)
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(departName);
		return this;
		
	}
	
	public CreateLeadPage enterDescription(String descr)
	{
		driver.findElement(By.name("description")).sendKeys(descr);
		return this;
		
	}
	
	public CreateLeadPage enterEmailId(String mail_id)
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(mail_id);
		return this;
		
	}
	
	public CreateLeadPage Selectprovince()
	{
		 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
		 return this;
		
	}
	
	public ViewLeadpage clickSubmit()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadpage(driver);
		
	}
	
	

}
