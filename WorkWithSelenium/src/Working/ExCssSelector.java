package Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		
		WebElement mail = driver.findElement(By.cssSelector("a[id='uh-mail-link']"));// getting search field with css selector
		mail.click();
		
		WebElement username = driver.findElement(By.cssSelector("#login-username"));// getting username by css id selector
		username.sendKeys("ash_sharma");
		
		WebElement nextbtn = driver.findElement(By.cssSelector(".orko-button-primary.orko-button"));// getting next button by class name 
		nextbtn.click();
		
		WebElement signinbtn = driver.findElement(By.cssSelector("form[class='pure-form pure-form-stacked']>p>button"));// getting sign in button by traversing
		signinbtn.click();

	}

}
