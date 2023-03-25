package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestA5 {

	public static void main(String[] args) throws InterruptedException {
		// Select option in multiSelectdropdown;
		// Deselect all option in dropdown one by one;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.name("cars"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("saab");
		Thread.sleep(3000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		
		driver.close();
		
       
		
		
		

	}

}
