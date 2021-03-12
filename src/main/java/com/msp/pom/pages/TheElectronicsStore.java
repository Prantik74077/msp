package com.msp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheElectronicsStore 
{
    @FindBy(xpath="//span[text()='Mobiles & Accessories']")
    private WebElement mobileandaccess;
    
    public TheElectronicsStore(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void getmobileandaccess()
    {
    	mobileandaccess.click();
    }
}
