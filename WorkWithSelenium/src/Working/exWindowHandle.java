package Working;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exWindowHandle {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				String.format("%s/chromedriver.exe",
						System.getProperty("user.home")));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dotdash.com/");
		driver.manage().window().maximize();
		String w1 = driver.getWindowHandle();
		System.out.println(w1);
		WebElement w = driver.findElement(By.xpath(".//*[@id='home_intro']/div[2]/div/div/div[1]/div[1]/div[1]/div/a/img"));
		w.click();
	
		Set<String> windowset= driver.getWindowHandles();
		Iterator<String> i = windowset.iterator();
		
		while(i.hasNext())
		{
			String w2 = i.next();
			driver.switchTo().window(w2);
			System.out.println(driver.getTitle());

			if(!w2.equalsIgnoreCase(w1))
			{
				driver.switchTo().window(w2);
				driver.findElement(By.xpath(".//*[@id='header_1-0']/div[1]/button")).click();
				WebElement search = driver.findElement(By.xpath(".//*[@id='search-input']"));
				search.click();
				search.sendKeys("yo");
				driver.close();
			}
		}
		
	}

}
