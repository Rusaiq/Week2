package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		For Check Box, we can use normal click
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[8]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
//		Disable CheckBox
		Boolean enable=driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isSelected();	
		if(enable){
			System.out.println("The Checkbox is not Disable");
		} else 
			System.out.println("The Checkbox is Disable");
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-mu')]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
	}
}
