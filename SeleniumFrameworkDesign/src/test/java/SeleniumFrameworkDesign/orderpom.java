package SeleniumFrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orderpom {
	@Test(priority=1)
    public void ordervalid(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     Landingpage ordr = new Landingpage(driver);
	     ordr.Order("Vavitha","MKE","vavi@gmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
	     Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/order.html");
	     

	       }
      @Test(priority=2)
           public void orderusername(){
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
       driver.get("https://mobileworld.banyanpro.com/");
     Landingpage ordr = new Landingpage(driver);
     ordr.Order(" ","MK","vavi@gmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
   Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/");
}
     
}
 

		
		
		 
	