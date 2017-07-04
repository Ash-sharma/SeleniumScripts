package Working;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3windowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				String.format("%s/chromedriver.exe",
				System.getProperty("user.home")));
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dotdash.com/");
		driver.manage().window().maximize();
		String w1 = driver.getWindowHandle();// getting the handle for the parent window
		System.out.println(w1);
		WebElement w = driver.findElement(By.xpath(".//*[@id='home_intro']/div[2]/div/div/div[1]/div[1]/div[1]/div/a/img")); // clicking on the link  for the second window
		w.click();
		WebElement ww = driver.findElement(By.xpath(".//*[@id='home_intro']/div[2]/div/div/div[1]/div[2]/div[1]/div/a/img")); // clicking on the link for the third window 
		ww.click();
		
		Set<String> windowset= driver.getWindowHandles(); // getting handles for all the windows and saving in the set
		for(String s: windowset)
		{
			System.out.println(s);	// printing all the handles
		}
		
		String ww1 = (String) windowset.toArray()[1];  // saving the handle of 3rd window in the string ww1
		driver.switchTo().window(ww1);
		driver.findElement(By.xpath(".//*[@id='menu-button_1-0']")).click(); // clicking on the menu in window 
		driver.close();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String ww2 = (String) windowset.toArray()[2];// saving the 2nd window in the ww2 string
		driver.switchTo().window(ww2);
		driver.findElement(By.xpath(".//*[@id='header_1-0']/div[1]/button")).click(); // clicking on the search button
		WebElement search = driver.findElement(By.xpath(".//*[@id='search-input']"));
		search.click();
		search.sendKeys("yo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().window(w1);// back to the main window
		driver.findElement(By.xpath("html/body/div[2]/header[2]/div[1]/a[2]")).click();

	}

}
