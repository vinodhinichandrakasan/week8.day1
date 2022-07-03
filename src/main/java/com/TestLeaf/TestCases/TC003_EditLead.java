package com.TestLeaf.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class TC003_EditLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData()
	{
		fileName="TC003_EditLead";
	}
	
	@Test(dataProvider="getData")
	public void editLead(String UserName,String	password,String	searchData,String newCompName) throws Exception
	{
		new LoginPage(driver)
		.enterUsername(UserName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.editLeadOption()
		.searchLead(searchData)
		.findLeadButton()
		.clickRetrievedLead()
		.clickEdit()
		.updateCompanyName(newCompName)
		.saveEdit()
		.verifyCompanyName();
	}

}
