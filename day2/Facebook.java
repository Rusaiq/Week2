package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Rusaiq");
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("S");
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MobileNumber.sendKeys("7358406143");
		WebElement NewPassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		NewPassword.sendKeys("Rusaiq@123");
		driver.findElement(By.xpath("//select[@id='day']/option[14]")).click();
		driver.findElement(By.xpath("//select[@id='month']/option[1]")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[@value='1995']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		}

}
