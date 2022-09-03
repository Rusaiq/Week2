package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String GetTitle=driver.getTitle();
		System.out.println("The Title of the Page is "+GetTitle);
		//Navigate Concept
		driver.navigate().back();
		WebElement Disable=driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::button"));
		if(Disable.isEnabled()) {
			System.out.println("The Button is Enabled");
		}else
			System.out.println("The Button is Disabled");
		Point GetPosition=driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println(GetPosition);
		WebElement Color=driver.findElement(By.xpath("(//span[text()='Save'])[1]"));
//		GetCssValue Concept
		String t=Color.getCssValue("color");
		System.out.println(t);
		WebElement HeightWidth=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
//		GetSize, GetHeight & GetWidth 
		int h=HeightWidth.getSize().getHeight();
		int w=HeightWidth.getSize().getWidth();
		System.out.println(h);
		System.out.println(w);
		WebElement Mouse=driver.findElement(By.xpath("//h5[text()='Mouse over and confirm the color changed']/following::button[1]/span"));
//		GetCssValue (Background Color)
		String Color1=Mouse.getCssValue("background-color");
		Actions MouseHover=new Actions(driver);
		MouseHover.moveToElement(Mouse).perform();
		String Color2=Mouse.getCssValue("background-color");
//		Not Equal conditions goes inside
		if(!Color1.equals(Color2)) {
			System.out.println("The Color Changed");
		}else
			System.out.println("The Color not Changed");
		driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']/following::button[1]/span")).click();
		driver.findElement(By.xpath("//div[@class='card ui-fluid']")).click();
//		To Perform the Hidden Button 
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", Disable);
//		List of WebElement Concept
		List<WebElement> Round=driver.findElements(By.xpath("//div[@class='card']/following::h5[text()='How many rounded buttons are there?']/following::button"));
		int buttonSize=Round.size();
		System.out.println("The Rounded Buttons are "+buttonSize);
		driver.close();
		}

}
