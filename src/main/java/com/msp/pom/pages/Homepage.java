package com.msp.pom.pages;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Homepage 
{
     @FindBy(id="searchDropdownBox")
     private WebElement Allbtndd;
     
     @FindBy(id="nav-search-submit-button")
     private WebElement searchbtn;
     
     @FindBy(id="twotabsearchtextbox")
     private WebElement searchtb;
     
     public Homepage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }

	 public WebElement getAllbtndd() 
	 {
		return Allbtndd;
	 } 
	 
	 public void searchbutton()
	 {
		 searchbtn.click();
	 }
	 
	 public void serachtextbox(String text)
	 {
		 searchtb.sendKeys(text);
	 }
	 
}
