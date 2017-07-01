package Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				String.format("%s/chromedriver.exe",
				System.getProperty("user.home")));
		WebDriver driver = new ChromeDriver();
		Actions act = new  Actions(driver);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		exActions a = new exActions();
		//a.dropDownAction(driver, act);
		a.clicks(driver, act);
	

	}
	
	void dropDownAction(WebDriver driver, Actions act)
	{
		WebElement dep = driver.findElement(By.cssSelector(".nav-line-2")); 
		WebElement books = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"));
		act.moveToElement(dep); 	// hover mouse on departments 
		act.moveToElement(books).	// in deparment hover mouse on books
		moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/a[5]/span"))).click(); // select textbooks from the drop down
		act.perform();
		
	}
	void clicks(WebDriver driver, Actions act)
	{
		WebElement dep = driver.findElement(By.cssSelector(".nav-line-2"));
		act.contextClick();
		act.clickAndHold(driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")));
		act.release();
		act.doubleClick(dep);
		act.perform();
	}
}
