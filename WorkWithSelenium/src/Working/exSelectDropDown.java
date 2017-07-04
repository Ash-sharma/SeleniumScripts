package Working;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				String.format("%s/chromedriver.exe",
				System.getProperty("user.home")));
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement pickmonth= driver.findElement(By.id("month"));
		WebElement pickday = driver.findElement(By.name("birthday_day"));
		WebElement pickyear = driver.findElement(By.id("year"));
		
		exSelectDropDown s= new exSelectDropDown();
		s.selectedOptions(driver, pickmonth, pickday, pickyear);
		s.select(driver, pickmonth, pickday, pickyear);
		s.printoptions(driver, pickmonth, pickday, pickyear);

	}
	void selectedOptions(WebDriver driver, WebElement pickmonth, WebElement pickday, WebElement pickyear) // to print initial values selected when page loads
	{
		Select sa = new Select(pickmonth);
		Select sb = new Select(pickday);
		Select sc = new Select(pickyear);
		
		System.out.println("Initial values are - ");
		System.out.println(sa.getFirstSelectedOption().getText() + " "+ sb.getFirstSelectedOption().getText()+" "+ sc.getFirstSelectedOption().getText());
	}
	void select(WebDriver driver, WebElement pickmonth, WebElement pickday, WebElement pickyear) // to select birth date on facebook page
	{		
		Select se = new Select(pickmonth);
		se.selectByIndex(1);
		
		Select sf = new Select(pickday);
		sf.selectByValue("30");

		Select sg = new Select(pickyear);
		sg.selectByVisibleText("2000");
		
		System.out.println("new slected values are -");
		System.out.println(se.getFirstSelectedOption().getText()+" "+ sf.getFirstSelectedOption().getText()+" "+ sg.getFirstSelectedOption().getText());
	}
	void printoptions(WebDriver driver, WebElement pickmonth, WebElement pickday, WebElement pickyear) // to print all the options in the select tag
	{
		
		Select sm = new Select(pickmonth);
		List<WebElement> lm = sm.getOptions(); // to get all the options in month dropdown
		System.out.println("number of option in months = " +lm.size());
		System.out.println("Your options for months are -");
		for (WebElement e:lm)
		{
			System.out.println(e.getText());
		}
		
		Select sd=  new Select(pickday); 
		List<WebElement> ld = sd.getOptions();
		System.out.println("number of option in days = " +ld.size());
		System.out.println("your options in days are -");
		for (WebElement e:ld)
		{
			System.out.println( e.getText());
		}
		
		Select sy= new Select(pickyear);
		List<WebElement> ly = sy.getOptions();
		System.out.println("number of option in year = " +ly.size());
		
		System.out.println("list of options in years is very long so i won't print it" );		
			}
	
}
