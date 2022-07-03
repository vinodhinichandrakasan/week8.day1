package com.TestLeaf.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class TC006_DuplicateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData()
	{
		fileName="TC006_DuplicateLead";
	}
	
	//delete lead
	@Test(dataProvider="getData")
	public void duplicateLead(String userName,String password,String email_id,String expData) throws Exception
	{
		new LoginPage(driver)
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.editLeadOption()
		.clickEmailSection()
		.searchByEmail(email_id)
		.clickRetrievedLead()
		.clickDuplicate()
		.verifyTitle(expData);
		
	}

}
