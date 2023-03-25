package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestA1 {

	public static void main(String[] args) {
		// Select a option from the dropdown via selectByIndex
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(3);
		driver.close();
		
		

	}

}
