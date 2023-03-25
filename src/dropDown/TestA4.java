package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestA4 {

	public static void main(String[] args) {
		
		// Size of dropdown
		// print all the option in dropdown;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		
		List<WebElement> options = s.getOptions();
		System.out.println("The Number of option in the dropdown are: "+options.size());
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		driver.close();

	}

}
