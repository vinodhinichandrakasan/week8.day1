package com.TestLeaf.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.TestLeaf.Base.ProjectSpecificMethods;

public class ViewLeadpage extends ProjectSpecificMethods{
	
	public ViewLeadpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public ViewLeadpage verifyFirstName()
	{
		System.out.println(driver.getTitle());
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(text, "Vino");
		return this;
	}
	
	public EditLead clickEdit()
	{
	    System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@class='subMenuButton' and text()='Edit']")).click();
		return new EditLead(driver);
	}
	
	public ViewLeadpage verifyCompanyName()
	{
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 
		 System.out.println(text);
		 if(text.contains("Comp"))
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		return this;
	}
	
	public LeadPage clickDeleteButton()
	{
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		return new LeadPage(driver);
	}
	
	public DuplicateLead clickDuplicate()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLead(driver);
	}
	
	

}
