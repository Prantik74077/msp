package com.msp.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesandAccessories 
{
      @FindBy(xpath="//img[@alt='m51']")
      private WebElement M51img;
      
      @FindBy(id="add-to-cart-button")
      private WebElement addtocartbtn;
      
      public MobilesandAccessories(WebDriver driver)
      {
    	  PageFactory.initElements(driver,this);
      }
      
      public void getM51Mobile()
      {
    	  M51img.click();
      }
      
      public void getaddtocartbutton()
      {
    	  addtocartbtn.click();
      }     
}
