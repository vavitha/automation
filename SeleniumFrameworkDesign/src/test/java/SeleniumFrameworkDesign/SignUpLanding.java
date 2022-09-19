package SeleniumFrameworkDesign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class SignUpLanding {
	 
	WebDriver driver;
	public SignUpLanding(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements( driver,this);
	}
	 //signup
    
	@FindBy(xpath="//button[@type='submit']")
    WebElement SignIn;



@FindBy(linkText="Sign up")
  WebElement signUp;
  
@FindBy(id="myName")
WebElement FirstName;

@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement LastName;

@FindBy(xpath="//input[@placeholder='Enter Email']")
WebElement Email;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement passwd;

@FindBy(xpath="//input[@type='date']")
WebElement dateofbirth;

@FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
WebElement male;

@FindBy(xpath="//div[@class='col-md-3']//input[@name='gender']")
WebElement female;

@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
WebElement Mobile;


@FindBy(xpath="//textarea[@placeholder='Short Bio']")
WebElement Bio;

@FindBy(xpath="//button[@type='submit']")
WebElement register;


@FindBy(linkText="Sign In")
WebElement Sign_In;



public void SignUpApp(String Fname,String Lname,String eml,String pssd,String dob,String phonenumber,String Shtbio ) throws InterruptedException
{
    SignIn.click();
    
    
    signUp.click();
    
    
    FirstName.sendKeys(Fname);
   
    LastName.sendKeys(Lname);
    
    Email.sendKeys(eml);
   
    passwd.sendKeys(pssd);
    
    dateofbirth.sendKeys(dob);
    
    male.click();
   
    Mobile.sendKeys(phonenumber);
 
    
    Bio.sendKeys(Shtbio);
   
    register.click();
    
    Alert al = driver.switchTo().alert();
    al.accept();
  
    
   
}
}
