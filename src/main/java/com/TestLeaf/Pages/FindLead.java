package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class FindLead extends ProjectSpecificMethods{
	
	public FindLead(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public FindLead searchLead(String searchData)
	{	
		driver.findElement(By.xpath("//form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(searchData);
		return this;
	}
	
	public FindLead clickContactsection()
	{
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[contains(text(),'Phone')]")).click();
		return this;
	}
	
	public FindLead searchByNumber(String number)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(number);
		return this;
	}
	
	public FindLead findLeadButton()
	{
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadpage clickRetrievedLead() throws Exception
	{
		 Thread.sleep(4000);
		 WebElement ele = driver.findElement(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String leadnum=ele.getText();
		 System.out.println(leadnum);
		 ele.click();
		 return new ViewLeadpage(driver);
	}
	
	public FindLead clickEmailSection()
	{
		 driver.findElement(By.xpath("//span[@class='x-tab-strip-text ' and text()='Email']")).click();
		 return this;
	}
	
	public FindLead searchByEmail(String email)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(email);
		return this;
	}
	
}
