package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestA0 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Mouse Hover on Electronics Tab;
		// Click on Apple button
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		a.moveToElement(ele1).perform();
		
		WebElement appleButton = driver.findElement(By.xpath("//a[text()='Apple']"));
		appleButton.click();
		
		
		
		
		
		
		

	}

}
