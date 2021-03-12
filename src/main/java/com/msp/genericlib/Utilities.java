package com.msp.genericlib;

import java.util.Set;    

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Utilities 
{
	/**
	 * To handle the dropdown
	 * @param ele
	 * @param text
	 */
	
   public void dropdown(WebElement ele,String text)
   {
	   Select s=new Select(ele);
	   s.selectByVisibleText(text);
   }
   
   /**
    * To handle the mouse action
    * @param driver
    * @param ele
    */
   
   public void mouseAction(WebDriver driver,WebElement ele)
   {
	   Actions a=new Actions(driver);
	   a.moveToElement(ele).perform();
   }
   
   /**
    * To handle doubleclick action
    * @param driver
    * @param target
    */
   
   public void doubleClick(WebDriver driver,WebElement target)
   {
	   Actions a=new Actions(driver);
	   a.doubleClick(target).perform();
   }
   
   /**
    * To handle the scrollbar
    * @param driver
    * @param x
    * @param y
    */
   
   public void location(WebDriver driver,WebElement ele)
   {
	   Point loc = ele.getLocation();
 	   int x = loc.getX();
 	   int y = loc.getY();		   
   }
   
   public void Scrollbar(WebDriver driver,int x,int y)
   {
	   JavascriptExecutor j=(JavascriptExecutor) driver;
	   j.executeScript("window.scrollBy("+x+","+y+")");
   }
   
   /**
    * To handle the alertpopup
    * @param driver
    * @param element
    */
   
   public void alertpopup(WebDriver driver)
   {
	   driver.switchTo().alert().accept();
   }
   
   /**
    * To wait for the element
    * @param driver
    * @param element
    */
   
   public void elementTobeClicked(WebDriver driver,WebElement element)
   {
	   WebDriverWait w=new  WebDriverWait(driver,10);
	   w.until(ExpectedConditions.elementToBeClickable(element));
   }
   
   /**
	 * To handle the switchingtab
	 * @param ele
	 * @param text
	 */
   
   public void switchingtab(WebDriver driver)
   {
	   Set<String> child = driver.getWindowHandles();
       for(String b:child)
       {
    	   driver.switchTo().window(b); 
       }
   }
   
   /**
	 * To handle the navigationofurl
	 * @param ele
	 * @param text
	 */
   
   public void navigatetourl(WebDriver driver,String url)
   {
	   driver.navigate().to(url);
   }
   
   /**
	 * To handle the switchingtoframe
	 * @param ele
	 * @param text
	 */
   
   public void frame(WebDriver driver)
   {
	   driver.switchTo().frame(0);
   }
   
   /**
	 * To handle the switchbackfromframe
	 * @param ele
	 * @param text
	 */
   
   public void switchbackfromframe(WebDriver driver)
   {
	   driver.switchTo().defaultContent();
   }
   
   public void refreshpage(WebDriver driver)
   {
	   driver.navigate().refresh();
   }
   
   public void backwardtopage(WebDriver driver)
   {
	   driver.navigate().back();
   }
}
