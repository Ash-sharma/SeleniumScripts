package Working;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exWait {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		exWait w = new exWait();
		w.waitimplicit(driver);
		w.WaitEXplicit(driver);		
        
	}
       void waitimplicit(WebDriver driver)
       {
    	   driver.get("https://www.yahoo.com/");
    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	//implicit wait with timeouts
    	   WebElement searchbtn = driver.findElement(By.cssSelector("#uh-search-button"));
    	   System.out.println(searchbtn.getAttribute("title"));
    	   
       }
       
       void WaitEXplicit(WebDriver driver)
       {
    	   driver.get("https://www.amazon.com/");
    	   WebDriverWait wait = new WebDriverWait(driver, 5);					//explicit wait with webdriverwait 
    	   WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='nav-orders']/span[2]")));
    	   boolean status = el.isDisplayed();
    	   if(status)
    	   {System.out.println("el is displayed");}
    	   else
    	   {System.out.println("not displayed");}
    	   driver.quit();
       }
       
       void othermethods(WebDriver driver)										// implicit wait with timeouts methods
       {
    	   driver.get("https://www.yahoo.com/");								 
    	   driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    	   driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
       }
}
