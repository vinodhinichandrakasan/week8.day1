package com.TestLeaf.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestLeaf.Base.ProjectSpecificMethods;
import com.TestLeaf.Pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		fileName = "TC001_Login";
	}
	
	
	@Test(dataProvider="getData")
	public void runLogin(String username,String pwd){
		
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(pwd)
		.clickLogin();
		
	}

}
