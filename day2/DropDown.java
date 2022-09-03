package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement DropDown=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select drp=new Select(DropDown);
		drp.selectByVisibleText("Selenium");
		//This is not Select DropDown so we need to click both the xpath
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[text()='AWS']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		}
}
