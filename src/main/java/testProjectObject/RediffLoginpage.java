package testProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpage {
	

	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   /*By signIn=By.linkText("Sign In");
   By username=By.xpath("//input[@id='login-username']");
   By password=By.xpath("//input[@type='password']");
   By submit =By.xpath("//button[@id='reg-submit-button']");
   By createAccount =By.cssSelector("#createacc");
   By firstName =By.name("firstName");
   By lastName =By.name("lastName");
   By emailId =By.id("usernamereg-yid");
   By mobile =By.name("phone");
   By birthMonth =By.id("usernamereg-month");
   By birthDay =By.id("usernamereg-day");
   By birthYear =By.id("usernamereg-year");*/
   

   @FindBy(linkText="Sign In")
	WebElement signIn;
  
   @FindBy(xpath="//input[@id='login-username']")
	WebElement username; 

   @FindBy(xpath="//input[@type='password']")
	WebElement password;

   @FindBy(xpath="//button[@id='reg-submit-button']")
	WebElement submit;
   
   @FindBy(css="#createacc")
	WebElement createAccount;

   @FindBy(name="firstName")
	WebElement firstName;
   
   @FindBy(name="lastName")
	WebElement lastName;
   
   @FindBy(id="usernamereg-yid")
	WebElement emailId;
   
   @FindBy(name="phone")
	WebElement mobile;
   
   @FindBy(id="usernamereg-month")
	WebElement birthMonth;
   
   @FindBy(id="usernamereg-day")
	WebElement birthDay;
   
   @FindBy(id="usernamereg-year")
	WebElement birthYear;
   
   
   public WebElement birthYear()
   {
	   return birthYear;
   }
   
   public WebElement birthMonth()
   {
	   return birthMonth;
   }
   
   public WebElement birthDay()
   {
	   return birthDay;
   }
   
   public WebElement signIn()
   {
	   return signIn;
   }
   
   public WebElement lastName()
   {
	   return lastName;
   }
   public WebElement firstName()
   {
	   return firstName;
   }
   
   public WebElement emailId()
   {
	   return emailId;
   }
         
   public WebElement password()
   {
	   return password;
   }
   
   public WebElement mobile()
   {
	   return mobile;
   }
   
   public WebElement submit()
   {
	   return submit;
   }
   
   public WebElement createAccount()
   {
	   return createAccount;
   }
	
	
	
}
