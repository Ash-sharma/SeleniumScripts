package Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exNav {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Navigation nav = driver.navigate();
		exNav n = new exNav();
		n.nav(nav, driver);
	}
	
	void nav(Navigation nav, WebDriver driver)
	{
		nav.to("https://www.yahoo.com/");
		WebElement searchbox = driver.findElement(By.cssSelector("#uh-search-box"));
		searchbox.sendKeys("news");
		
		WebElement searchbtn = driver.findElement(By.cssSelector("#uh-search-button"));
		searchbtn.click();
				
		nav.back();
		nav.forward();
		nav.refresh();
		
	}

}
