package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement UserName=driver.findElement(By.xpath("//input[@name='USERNAME']"));
		UserName.sendKeys("Demosalesmanager");
		WebElement Password=driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		Password.sendKeys("crmsfa");
		WebElement LoginButton=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		LoginButton.click();
		WebElement CRMSFA=driver.findElement(By.xpath("//div[@for='crmsfa']/a"));
		CRMSFA.click();
		WebElement Leads=driver.findElement(By.xpath("//a[text()='Leads']"));
		Leads.click();
		WebElement CreateLeads=driver.findElement(By.xpath("//a[text()='Create Lead']"));
		CreateLeads.click();
		WebElement CompanyName=driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		CompanyName.sendKeys("Mocero Health Solution");
		WebElement FirstName=driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		FirstName.sendKeys("Rusaiq");
		WebElement LastName=driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
		LastName.sendKeys("S");
		WebElement CreateLeadButton=driver.findElement(By.xpath("//input[@value='Create Lead']"));
		CreateLeadButton.click();
	}

}
