package com.msp.testscripts;

import java.io.FileNotFoundException;  
import java.io.IOException;
import org.testng.annotations.Test;  
import com.msp.genericlib.Baseclass;
import com.msp.pom.pages.Homepage;
import com.msp.pom.pages.MobilesandAccessories;
import com.msp.pom.pages.TheElectronicsStore;

public class AddtoCart extends Baseclass
{
      @Test
      public void Testcase1() throws FileNotFoundException, IOException, InterruptedException
      {
    	  Homepage hm=new Homepage(driver);
    	  u.dropdown(hm.getAllbtndd(),p.getPropertyData("data")); 
    	  
    	  hm.searchbutton();
    	  
    	  TheElectronicsStore es=new TheElectronicsStore(driver);
    	  es.getmobileandaccess();
    	  
    	  MobilesandAccessories ma=new MobilesandAccessories(driver);
    	  ma.getM51Mobile();
    	  ma.getaddtocartbutton(); 
      }
}
