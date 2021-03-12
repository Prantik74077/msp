package com.msp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Samsung 
{
     @FindBy(xpath="//span[text()='Samsung Galaxy M51 (Electric Blue, 6GB RAM, 128GB Storage)']")
     private WebElement M51Electricbluepic;
     
     public Samsung(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void getM5Electricblue()
     {
    	 M51Electricbluepic.click();
     }
}
