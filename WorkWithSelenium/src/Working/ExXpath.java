package Working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExXpath {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='lst-ib']"));// getting search field with xpath
		search.sendKeys("news");
		
		WebElement searchbtn = driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div[3]/center/input[1]"));// getting search button field with xpath by traversing
		System.out.println(searchbtn.getAttribute("name"));
		
		WebElement luckybtn = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/div/div/div[3]"));// getting search button field with xpath by traversing
		System.out.println(luckybtn.getTagName());
		
		driver.close();
	}

}
