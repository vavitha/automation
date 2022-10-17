package SeleniumFrameworkDesign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Signinpom {
	
	@Test(description="user can signin with valid username and password")
	public void  Signin() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		//Thread.sleep(4000);
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("vavitha","vavi12");
		//Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/index.html");
		
		}
	


	@Test(description="user cant signin by leaving username field empty")
	public void  Signinvalid() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn(" ","vavi12");
		Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/sign.html");
		
		}
	@Test(description="user cant signin by leaving both username and password field empty" )
	public void  Signinemptyvalid() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn(" "," ");
		Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/sign.html");
		
		}
	@Test(description="user cant signin by entering less than 3 characters in username")
	public void  Signinpominavalid() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("va","vavi123 ");
		Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/sign.html");
		
		}
	@Test(description="user cant signin by entering more than 20 characters in username")
	public void  Signinusermoretwentyinavalid() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("vavithavavithavavithavavi","vavi123 ");
		Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/sign.html");
		
		}
	@Test(description="user cant signin by entering special characters in password")
	public void  Signinpassspecialinavalid() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("vavitha","vavi!");
		Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/sign.html");
		
		}
}
