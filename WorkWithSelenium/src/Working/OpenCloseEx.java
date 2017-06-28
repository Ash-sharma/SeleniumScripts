package Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenCloseEx {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("username");// to send username using scirpt
		
		WebElement pws = driver.findElement(By.id("pass"));
			pws.sendKeys("password");// to send password by script
	
		driver.findElement(By.id("loginbutton")).click();// to find login button and click it using script
	}

}
