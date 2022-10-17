package SeleniumFrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orderpom {
	WebDriver driver;
	 @BeforeMethod
     @Parameters("browser")
     public void browserSelection(String browser) throws Exception{
         
          if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        	  driver = new ChromeDriver();

         }
                 else if(browser.equalsIgnoreCase("Edge")){
	                  System.setProperty("webdriver.edge.driver", "C:\\Users\\vavitha.mk\\Downloads\\edgedriver_win64\\msedgedriver.exe");

               	                       driver = new EdgeDriver();
}
                 }
	@Test(description="user can order the mobile by entering all valid details")
    public void ordervalid() throws InterruptedException{
		//
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\vavitha.mk\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//
//           driver = new EdgeDriver();
		 driver.get("https://mobileworld.banyanpro.com/");
		 Thread.sleep(2000);
	     Landingpage ordr = new Landingpage(driver);
	     ordr.Order("Vavitha","MKE","vavi@gmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
//        String actual="driver.getCurrentURL";
//        String expected="https://mobileworld.banyanpro.com/";
//        Assert.assertEquals(actual, expected);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/");
//        Assertions.assertTrue(Compare3.validatePageURL(driver, "incorrecturl"));
        String expectedURL = "https://mobileworld.banyanpro.com/index.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
       
        
	     
	     

	       }
      @Test(description="user cant order the mobile by leaving the username space empty")
      public void orderusername(){
          //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
                    driver.get("https://mobileworld.banyanpro.com/");
          Landingpage ordr = new Landingpage(driver);
          ordr.Order(" ","MK","vavi@gmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
          String actual=driver.getCurrentUrl();
          String expected="https://mobileworld.banyanpro.com/order.html";
          Assert.assertEquals(actual, expected);
          
          }
      @Test(description="user cant order the mobile by entering invalid gmail id")
      public void ordergmail(){
   	      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	             driver.get("https://mobileworld.banyanpro.com/");
          Landingpage ordr = new Landingpage(driver);
          ordr.Order("Vavitha ","MK","vavigmail.com", "VAVI3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
          String actual="driver.getCurrentURL";
          String expected="https://mobileworld.banyanpro.com/order.html";
          Assert.assertEquals(actual, expected);
          
          }
      @Test(description="user cant order the mobile by entering special characters in password")
      public void orderpassword(){
   	      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	             driver.get("https://mobileworld.banyanpro.com/");
          Landingpage ordr = new Landingpage(driver);
          ordr.Order("vavitha","MK","vavi@gmail.com", "VAV!@3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
          String actual="driver.getCurrentURL";
          String expected="https://mobileworld.banyanpro.com/order.html";
          Assert.assertEquals(actual, expected);
          
           }
      @Test(description="user cant order the mobile by entering phonenumber less than 10")
      public void orderphonenumber(){
   	       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	              driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAvi3", "8975675","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
      }
      @Test(description="user cant order the mobile by entering invalid address")
      public void orderaddress(){
   	       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	               driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAV3", "8975675645","ME", "AGALI","PALAKKAD", "5464789654", "1", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
          
          }
      @Test(description="user cant order the mobile by entering invalid zip")
      public void orderzip(){
   	       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	               driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAV3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "1", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
           
          }
      @Test(description="user cant order the mobile by entering count number as negativenumbers")
      public void ordercount(){
   	       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	   
           driver.get("https://mobileworld.banyanpro.com/");
           Landingpage ordr = new Landingpage(driver);
           ordr.Order("vavitha ","MK","vavi@gmail.com", "VAV3", "8975675645","MEPPATU", "AGALI","PALAKKAD", "5464789654", "-2", "3");
           String actual="driver.getCurrentURL";
           String expected="https://mobileworld.banyanpro.com/order.html";
           Assert.assertEquals(actual, expected);
           
          }
      
      
      
      
          
     
}
 

		
		
		 
	