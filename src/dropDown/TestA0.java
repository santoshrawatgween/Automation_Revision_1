package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestA0 {

	public static void main(String[] args) 
	{
		// Select a option from dropdown via selectByValue
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		s.selectByValue("2984");  //baby
		
		driver.close();
		

	}

}
