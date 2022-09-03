package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
		String text=driver.findElement(By.linkText("11332")).getText();
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')][1]/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement NoRecords=driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text1=NoRecords.getText();
		System.out.println(text1);
		driver.close();
		}
}
