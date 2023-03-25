package basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA2 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		String url1 = driver.getCurrentUrl();
		
		
		
		driver.navigate().to("https://www.amazon.com/");
		String url2 = driver.getCurrentUrl();
		
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		System.out.println(url1);
		System.out.println(url2);
		
		driver.close();
	}

}
