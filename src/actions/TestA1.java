package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestA1 {

	public static void main(String[] args) {
		// Right Click on searchTextBox;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchTextBox = driver.findElement(By.name("q"));
		Actions a = new Actions(driver);
		a.contextClick(searchTextBox).perform();
		

	}

}
