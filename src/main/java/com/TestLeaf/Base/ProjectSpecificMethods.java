package com.TestLeaf.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.TestLeaf.Utils.ExcelRead;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
public  WebDriver driver;

public String fileName;


	@Parameters("browser")
	@BeforeMethod
	public void pre_condition(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 }
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void post_condition()
	{
		driver.close();
	}
	
	@DataProvider(name = "getData")
	public String[][] fetchData() throws IOException {
		return ExcelRead.readData(fileName);
	}



}
