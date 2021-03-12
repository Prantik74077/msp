package com.msp.genericlib;

import java.io.FileNotFoundException;     
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements AutoConstant
{
	public WebDriver driver;
	public Propertyfile p;
	public ExcelData e=new ExcelData();
	public Photo p1;
	public Utilities u=new Utilities();
	
    @BeforeMethod
    public void openApp() throws FileNotFoundException, IOException
    {
	System.setProperty(key,value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	p=new Propertyfile();
	driver.get(p.getPropertyData("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    
    @AfterMethod
    public void closeApp(ITestResult itr) throws IOException
    {
    	int status = itr.getStatus();
    	String name = itr.getName();
    	if(status==2)
    	{
    		p1=new Photo();
    		p1.getphoto(driver, name);
    	}
    	driver.quit();
    }
}
