package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //Launch URL "http://leaftaps.com/opentaps/control/login"
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //Enter UserName and Password Using Id Locator
		 WebElement usernameElement =driver.findElement(By.id("username"));
		 usernameElement.sendKeys("Demosalesmanager");
		 WebElement passwordElement = driver.findElement(By.id("password"));
		 passwordElement.sendKeys("crmsfa");
		 
		  //Click on Login Button using Class Locator
		  WebElement LoginElement= driver.findElement(By.className("decorativeSubmit"));
		  LoginElement.click();
		  
		  //Click on CRM/SFA Link
		  WebElement iconElement=driver.findElement(By.linkText("CRM/SFA"));
		  iconElement.click();
		  
		  //Click on Leads Button
		  WebElement leadsElement=driver.findElement(By.linkText("Leads"));
		  leadsElement.click();
		  
		  //Click on Create Lead 
		  WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		  createLead.click();
		  
		  //Enter CompanyName Field Using id Locator
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		  
		  //Enter FirstName Field Using id Locator
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suraj");
		  
		  //Enter LastName Field Using id Locator
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasad");
		  
		  //Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SRJ");
		  
		  //Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		  
		  //Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Information Technology");
		  
		  //Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sprasad649@gmail.com");
		  
		  //Select State/Province as NewYork Using Visible Text
		  WebElement elementStateDropdown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select statedd = new Select(elementStateDropdown);
		  statedd.selectByVisibleText("New York");
		  
		  //Click on Create Button
		  driver.findElement(By.name("submitButton")).click();
		  
         //Get the Title of Resulting Page. refer the video  using driver.getTitle()
		 System.out.println(driver.getTitle());
		 
		 //Click on Duplicate button
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
         //Clear the CompanyName Field using .clear() And Enter new CompanyName
		 WebElement companyName=driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		 companyName.clear();
		 companyName.sendKeys("Infosys");
		 
         //Clear the FirstName Field using .clear() And Enter new FirstName
		 WebElement firstName=driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		 firstName.clear();
		 firstName.sendKeys("SRJ");
		 
         //Click on Create Lead Button
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
         //Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		 System.out.println(driver.getTitle());
		 
		 }
}
