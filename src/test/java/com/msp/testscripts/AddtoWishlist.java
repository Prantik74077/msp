package com.msp.testscripts;

import java.io.FileNotFoundException;   
import java.io.IOException;

import org.testng.annotations.Test;

import com.msp.genericlib.Baseclass;
import com.msp.pom.pages.Homepage;
import com.msp.pom.pages.M51AddtoWishlist;
import com.msp.pom.pages.Samsung;

public class AddtoWishlist extends Baseclass
{
     @Test
     public void Testcase2() throws FileNotFoundException, IOException, InterruptedException
     {
    	 Homepage hm=new Homepage(driver);
    	 hm.serachtextbox(p.getPropertyData("datatosearch"));
    	 
    	 hm.searchbutton();
    	 
    	 Samsung s=new Samsung(driver);
    	 s.getM5Electricblue();
    	 
    	 u.switchingtab(driver);
    	 
    	 M51AddtoWishlist m=new M51AddtoWishlist(driver);
    	 m.AddtoWishlist();
     }
}
