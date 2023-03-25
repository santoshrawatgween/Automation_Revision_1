package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA3 {

	public static void main(String[] args) {
		
		// get all option through genric method;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 List<WebElement> dropdown = driver.findElements(By.id("gh-cat"));
		 
		 for(WebElement option:dropdown)
		 {
			 System.out.println(option.getText());
		 }
		 
		
		

	}

}
