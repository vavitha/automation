package SeleniumFrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Signuppom {
	
    @Test(description="user can register by entering valid details in signup page")
	public void demo() throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		SignUpLanding sup=new SignUpLanding (driver);
		sup.SignUpApp("Vavitha","MGK","vavi@gmail.com","vavi566","1/3/1999","9856742561","Hi");
		driver.quit();

	}
    @Test(description="user cant register by entering invalid username")
   	public void demo1() throws InterruptedException{
   		// TODO Auto-generated method stub
   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
   		WebDriver driver= new ChromeDriver();
   		driver.get("https://mobileworld.banyanpro.com/");
   		SignUpLanding sup=new SignUpLanding (driver);
   		sup.SignUpApp("Vavitha","M k ","vavi@gmail.com","vavi566","1/3/1999","9856742561","Hello");
   		String actual="driver.getCurrentURL";
   		String expected="https://mobileworld.banyanpro.com/signup.html";
   		Assert.assertEquals(actual, expected);
   		driver.quit();

   	}
    @Test(description="user cant register by entering invalid email id")
	public void demo3() throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		SignUpLanding sup=new SignUpLanding (driver);
		sup.SignUpApp("Vavitha","Mohan","vavigmail","vavi566","1/3/2000","9856742561","Hi");
		String actual="driver.getCurrentURL";
   		String expected="https://mobileworld.banyanpro.com/signup.html";
   		Assert.assertEquals(actual, expected);
		driver.quit();
    

}
    @Test
	public void demo4() throws InterruptedException{
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		SignUpLanding sup=new SignUpLanding (driver);
		sup.SignUpApp("Vavitha","Mohan","vavi@gmail.com","vavi!@12","1/3/1999","9856742561","Hi");
		String actual="driver.getCurrentURL";
   		String expected="https://mobileworld.banyanpro.com/signup.html";
   		Assert.assertEquals(actual, expected);
		driver.quit();
    
    
}
@Test(description="user cant register by entering invalid date of birth")
public void demo5() throws InterruptedException{
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
	SignUpLanding sup=new SignUpLanding (driver);
	sup.SignUpApp("Vavitha","Mohan","vavi@gmail.com","vavi566","1/3/2032","9856742561","Hi");
	String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/signup.html";
		Assert.assertEquals(actual, expected);
	driver.quit();
//}
}
}
