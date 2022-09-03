package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[1]")).click();
		String link=driver.getCurrentUrl();
		driver.navigate().back();
//		Get and Print URL By Attribute without Clicking the Link
		WebElement GetURL=driver.findElement(By.linkText("Find the URL without clicking me."));
		String str=GetURL.getAttribute("href");
		System.out.println(str);
		driver.findElement(By.linkText("Broken?")).click();
//		Get Current URL
		String str1=driver.getCurrentUrl();
		System.out.println(str1);
		WebElement tagName=driver.findElement(By.tagName("h2"));
		String str2=tagName.getText();
		System.out.println(str2);
		if(str2.contains("404")) {
			System.out.println("Error Page");
		}else
			System.out.println("Page Loaded");
		driver.navigate().back();
		driver.findElement(By.xpath("//h5[text()='Duplicate Link']/following-sibling::div/div/a")).click();
		String link1=driver.getCurrentUrl();
		if(link.equals(link1)) {
			System.out.println("Duplicate Link");
		}else
			System.out.println("Different Link");
		driver.navigate().back();
		driver.findElement(By.linkText("How many links in this page?")).click();
		Thread.sleep(3000);
//		Finding the Links in the DOM
		List<WebElement> AllLinks=driver.findElements(By.xpath("//a[contains(@href,'xhtml')]"));
		System.out.println(AllLinks.size());
		driver.navigate().back();
		driver.findElement(By.linkText("How many links in this layout?")).click();
		Thread.sleep(3000);
		List<WebElement> AllLinks1=driver.findElements(By.xpath("//a[contains(@href,'xhtml')]"));
		System.out.println(AllLinks1.size());
		driver.quit();
				
		


	}

}
