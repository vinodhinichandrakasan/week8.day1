package com.TestLeaf.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		fileName = "TC002_CreateLead";
	}
	@Test(dataProvider="getData")
	public void runCreateLead(String username,String pwd,String cName,String fName,String lName,String departName,String descr,String mail_id)
	{
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterdeptName(departName)
		.enterDescription(descr)
		.enterEmailId(mail_id)
		.Selectprovince()
		.clickSubmit()
		.verifyFirstName();
		
	}

}
