package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class InputFields {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p6680");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Rusaiq");
		WebElement elementCountry=driver.findElement(By.xpath("//input[@value='Chennai']"));
		String text=elementCountry.getText();
		elementCountry.sendKeys(text+" ," + " India");
		WebElement elementDisable=driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
//		isEnabled Concept
		Boolean text1=elementDisable.isEnabled();
		if(text1)
				{
			System.out.println("The Text Box is Enabled");
				}else
				{
					System.out.println("The Text Box is Disabled");
				}
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement retrievedElement=driver.findElement(By.xpath("//input[contains(@value,'My learning is superb')]"));
		//GetAttribute
		System.out.println("The Typed Text is " +retrievedElement.getAttribute("value"));
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("rusaiq@yopmail.com" +Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am so good in Manual Testing");
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ql-picker-options'])[2]/span[@data-value='large']")).click();
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("I am so good in Manual Testing");
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]")).sendKeys(Keys.ENTER);
		WebElement ErrorMsg=driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		String text2=ErrorMsg.getText();
		System.out.println("The error Message "+text2);
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[3]")).click();
		WebElement LabelPosition=driver.findElement(By.xpath("//label[text()='Username']"));
		String text3=LabelPosition.getText();
		System.out.println("The Label Position Changes "+text3);
		WebElement EnterElement=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		EnterElement.sendKeys("Rusaiq");
		WebElement ChooseOption=driver.findElement(By.xpath("(//span[@class='ui-autocomplete-query'])[1]"));
		Actions Builder=new Actions(driver);
		Thread.sleep(4000);
		Builder.moveToElement(ChooseOption).perform();
		for(int i=0;i<3;i++)
		{
			EnterElement.sendKeys(Keys.DOWN);
		}
		Thread.sleep(3000);
		EnterElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-widget ui-state')]")).click();
		for(int i=0;i<=3;i++) {
			WebElement DatePicker=driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']"));
			DatePicker.click();
		}
		driver.findElement(By.linkText("20")).click();
		WebElement Spin=driver.findElement(By.xpath("//input[contains(@class,'ui-spinner-input ui-inputfield ui-state')]"));
		Spin.sendKeys("23");
		for(int i=0;i<=3;i++)
		{
		driver.findElement(By.xpath("(//span[@class='ui-button-text'])[4]")).click();
		}
//	Get Location Concept
	Point location=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")).getLocation();
	driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext ui')])[9]")).sendKeys("50");
	Point location1=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]")).getLocation();
	if(location!=location1) {
		System.out.println("The Slider Changed");
	}else
		System.out.println("The Slider Not Changed");
	driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
//	isDisplayed Concept
	Boolean displayed=driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
	if(displayed) {
		System.out.println("The keyboard is Displayed");
		}else
		System.out.println("The Keyboard is not Displayed");
	//driver.findElement(By.xpath("//button[@title='Close the keypad']")).click();
	WebElement toolBar=driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]"));
	toolBar.sendKeys("Rusaiq TestLeaf");
	}

}
