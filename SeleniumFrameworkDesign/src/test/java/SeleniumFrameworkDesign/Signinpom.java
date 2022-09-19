package SeleniumFrameworkDesign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Signinpom {
	
	@Test(description="user can signin with valid username and password")
	public void  Signinpom() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("vavitha","vavi12");
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
		}


	@Test(description="user cant signin by leaving username field empty")
	public void  Signinvalid() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn(" ","vavi12");
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
		}
	@Test(description="user cant signin by leaving both username and password field empty" )
	public void  Signinemptyvalid() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn(" "," ");
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
		}
	@Test(description="user cant signin by entering less than 3 characters in username")
	public void  Signinpominavalid() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("va","vavi123 ");
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
		}
	@Test(description="user cant signin by entering more than 20 characters in username")
	public void  Signinusermoretwentyinavalid() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("vavithavavithavavithavavi","vavi123 ");
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
		}
	@Test(description="user cant signin by entering special characters in password")
	public void  Signinpassspecialinavalid() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vavitha.mk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Landingpage ob= new Landingpage(driver);
		ob.SignIn("vavitha","vavi!");
		Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
		}
}
