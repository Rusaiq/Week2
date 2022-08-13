package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps");
		 //To maximize the Browser
		 driver.manage().window().maximize();
		 //By ID & SendKeys
		 WebElement UserName=driver.findElement(By.id("username"));
		 UserName.sendKeys("Demosalesmanager");
		 //By Name
		 WebElement Password=driver.findElement(By.name("PASSWORD"));
		 Password.sendKeys("crmsfa");
		 //By ClassName & Click
		 WebElement LoginButton=driver.findElement(By.className("decorativeSubmit"));
		 LoginButton.click();
		 //By TagName & Get Text & Print
		 WebElement Content=driver.findElement(By.tagName("h2"));
		 String Text=Content.getText();
		 System.out.println(Text);
		 //By LinkText & Click
		 WebElement CRMSFA=driver.findElement(By.linkText("CRM/SFA"));
		 CRMSFA.click();
		 WebElement Leads=driver.findElement(By.linkText("Leads"));
		 Leads.click();
		 WebElement CreateLeads=driver.findElement(By.linkText("Create Lead"));
		 CreateLeads.click();
		 WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		 CompanyName.sendKeys("Mocero Health Solution");
		 WebElement FirstName=driver.findElement(By.id("createLeadForm_firstName"));
		 FirstName.sendKeys("Rusaiq");
		 WebElement LastName=driver.findElement(By.id("createLeadForm_lastName"));
		 LastName.sendKeys("S");
		 //DropDown & SendKeys
		 WebElement SourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 SourceDD.sendKeys("Direct Mail");
		 //DropDown -> Select Class by SelectIndex 
		 WebElement MarketingDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select DD=new Select(MarketingDD);
		 DD.selectByIndex(2);
		//DropDown -> Select Class by SelectValue
		 WebElement IndustryDD=driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select DD1=new Select(IndustryDD);
		 DD1.selectByValue("IND_DISTRIBUTION");
		//DropDown -> Select Class by SelectVisibleText 
		 WebElement OwnerShipDD=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select DD2=new Select(OwnerShipDD);
		 DD2.selectByVisibleText("Corporation");
		 WebElement CreateLeadButton=driver.findElement(By.className("smallSubmit"));
		 CreateLeadButton.click();
		 }
}

