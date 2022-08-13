package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement UserName=driver.findElement(By.id("username"));
		UserName.sendKeys("Demosalesmanager");
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
		WebElement LoginButton=driver.findElement(By.className("decorativeSubmit"));
		LoginButton.click();
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
		WebElement FirstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		FirstNameLocal.sendKeys("Jeinu");
		WebElement DepartmentName=driver.findElement(By.name("departmentName"));
		DepartmentName.sendKeys("IT");
		WebElement Description=driver.findElement(By.className("inputBox"));
		Description.sendKeys("I am so good in the Manual Testing field, now i am upgrading myself to Automation");
		WebElement EmailAddress=driver.findElement(By.id("createLeadForm_primaryEmail"));
		EmailAddress.sendKeys("mohammedrusaiq@gmail.com");
		WebElement StateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select DD=new Select(StateDD);
		DD.selectByVisibleText("New York");
		WebElement CreateLeadButton=driver.findElement(By.className("smallSubmit"));
		CreateLeadButton.click();
		System.out.println("Resulting Page Title is "+driver.getTitle());
		}

}
