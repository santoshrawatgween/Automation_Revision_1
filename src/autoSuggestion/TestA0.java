package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA0 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("seleni");
		
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct']"));
		for(WebElement ele:suggestions)
		{
			System.out.println(ele.getText());
		}
		driver.close();

	}

}
