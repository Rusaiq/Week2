package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input[@name='firstName']")).sendKeys("Raja");
//		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).click();
		String title=driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println(title);
			
		}else
		System.out.println("The Page title is not found");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Mocero Health Solution");
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(text.contains("Mocero Health Solution")) {
			System.out.println("Confirmed");
		}else {
			System.out.println("Not Confirmed");
		}
		driver.close();
		}
	

}

