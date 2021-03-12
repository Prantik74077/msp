package com.msp.pom.pages;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M51AddtoWishlist
{
     @FindBy(id="wishListMainButton-announce")
     private WebElement Addtowishlistbtn;
     
     public M51AddtoWishlist(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void AddtoWishlist()
     {
    	 Addtowishlistbtn.click();
     }
}
