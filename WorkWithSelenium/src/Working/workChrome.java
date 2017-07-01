package Working;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workChrome {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
		System.setProperty("webdriver.chrome.driver",//"C:\\Users\\Aishwarya\\Selenium drivers\\chromedriver.exe");
				String.format("%s/chromedriver.exe",
				System.getProperty("user.home")));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
	}

}
