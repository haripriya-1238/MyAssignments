package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class CreateLead {
	public static void main(String args[])
	{
		//driver setup
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    //Launch the URL 
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    //maximize the window
	    driver.manage().window().maximize();	
	    //Enter UserName Using Id Locator
	    WebElement elementname = driver.findElement(By.id("username"));
	    elementname.sendKeys("Demosalesmanager");
	    //Enter Password Using Id Locator
	    WebElement elementpass = driver.findElement(By.id("password"));
	    elementpass.sendKeys("crmsfa");
	    // Click on Login Button using Class Locator
	    WebElement login = driver.findElement(By.className("decorativeSubmit"));
	    login.click();
	    //Click on CRM/SFA Link
	    WebElement elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
	    elementcrmsfa.click();
	    //Click on Leads Button
	    WebElement elementlead = driver.findElement(By.linkText("Leads"));
	    elementlead.click();
	    //Click on Create Lead
	    WebElement elementcrtlead = driver.findElement(By.linkText("Create Lead"));
	    elementcrtlead.click();
	    //Enter CompanyName Field Using id Locator
	    WebElement elementcmpyname = driver.findElement(By.id("createLeadForm_companyName"));
	    elementcmpyname.sendKeys("ADF");
	    //Enter FirstName Field Using id Locator
	    WebElement elementfname = driver.findElement(By.id("createLeadForm_firstName"));
	    elementfname.sendKeys("Haripriya");
	    //Enter LastName Field Using id Locator
	    WebElement elementlname = driver.findElement(By.id("createLeadForm_lastName"));
	    elementlname.sendKeys("N");
	    //Enter FirstName(Local) Field Using id Locator
	    WebElement elementfnamelcl = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	    elementfnamelcl.sendKeys("Haripriya");
	    //Enter Department Field Using any Locator of Your Choice
	    WebElement elementdepart = driver.findElement(By.id("createLeadForm_departmentName"));
	    elementdepart.sendKeys("Computer Science");
	    //Enter Description Field Using any Locator of your choice 
	    WebElement elementdescrip = driver.findElement(By.id("createLeadForm_description"));
	    elementdescrip.sendKeys("Working in ADF");
	    //Enter your email in the E-mail address Field using the locator of your choice
	    WebElement elementemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
	    elementemail.sendKeys("haripriya@gmail.com");
	    //Click on Create Button
	    WebElement createlead = driver.findElement(By.className("smallSubmit"));
	    createlead.click();
	    //Get the Title of Resulting Page. refer the video  using driver.getTitle()
	    System.out.println("The title is: " + driver.getTitle());
	    
	    
	}

}
