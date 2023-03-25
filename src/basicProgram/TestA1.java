package basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA1 {

	public static void main(String[] args) 
	{
		// Current url
		// Page Title
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		String url=driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		driver.close();

	}

}
