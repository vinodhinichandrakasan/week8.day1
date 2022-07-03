package com.TestLeaf.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class TC005_DeleteLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData()
	{
		fileName="TC005_DeleteLead";
	}
	
	//delete lead
	@Test(dataProvider="getData")
	public void deleteLead(String userName,String password,String PhoneNum) throws Exception
	{
		new LoginPage(driver)
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.editLeadOption()
		.clickContactsection()
		.searchByNumber(PhoneNum)
		.clickRetrievedLead()
		.clickDeleteButton();
		
		
	}

}
