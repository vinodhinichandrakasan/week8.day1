package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class CreateContact extends ProjectSpecificMethods{
	
	public CreateContact(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//fName	lName	firstNameLocal	LastLocal	departName	descr	mail_id	updateNotes

	public CreateContact enterFName(String fName)
	{		
		driver.findElement(By.id("firstNameField")).sendKeys(fName);
		return this;
	}
	
	public CreateContact enterLName(String lName)
	{		
		driver.findElement(By.id("lastNameField")).sendKeys(lName);
		return this;
	}
	
	public CreateContact enterfirstLocalName(String firstNameLocal)
	{		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(firstNameLocal);
		return this;
	}
	
	public CreateContact enterlastLocalName(String LastLocal)
	{		
		driver.findElement(By.name("lastNameLocal")).sendKeys(LastLocal);;
		return this;
	}
	
	public CreateContact enterdepartName(String departName)
	{		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys(departName);
		return this;
	}
	
	public CreateContact enterDescription(String descr)
	{
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys(descr);
		return this;
	}
	
	public CreateContact enterPrimaryEmail(String email)
	{
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
		return this;
		
	}
	
	public CreateContact selectProvinces()
	{
		 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
		return this;
		
	}
	
	public ViewContact submit()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewContact(driver) ;
	}
	
	
	
	
	

}
