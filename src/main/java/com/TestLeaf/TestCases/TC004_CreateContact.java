package com.TestLeaf.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class TC004_CreateContact extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData()
	{
		fileName="TC004_CreateContact";
	}
	@Test(dataProvider="getData")
	public void createContact(String userName,String password,String fName,String lName,String firstNameLocal,String LastLocal,String departName,String descr,String mail_id
				)
	{
		
		new LoginPage(driver)
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickContact()
		.clickCreateContact()
		.enterFName(fName)
		.enterLName(lName)
		.enterfirstLocalName(firstNameLocal)
		.enterlastLocalName(LastLocal)
		.enterdepartName(departName)
		.enterDescription(descr)
		.enterPrimaryEmail(mail_id)
		.selectProvinces()
		.submit();
	}

}
