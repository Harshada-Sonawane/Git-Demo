package TestProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testProjectObject.RediffLoginpage;

public class Loginapplication {
// Login page class implemented in normal page object pattern style
// Home page class implemented in Page object factory methdos
	
	@Test
	public void CreateNewUser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\work\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.manage().window().maximize();
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.signIn().click();
		rd.createAccount().click();
		rd.firstName().sendKeys("Yadnesh");
		rd.lastName().sendKeys("sonawane");
		rd.emailId().sendKeys("poo7865");
		rd.password().sendKeys("12548khh");
		rd.mobile().sendKeys("7783282859");
		Select month = new Select(rd.birthMonth());
		month.selectByVisibleText("May");
		rd.birthDay().sendKeys("11");
		rd.birthYear().sendKeys("1997");
		rd.submit().click();
		driver.close();
		
	}
	
	
	
	
	
	}
	
	

