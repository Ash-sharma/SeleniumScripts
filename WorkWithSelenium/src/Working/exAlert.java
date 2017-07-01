package Working;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exAlert {

	public static void main(String[] args) {
		exAlert a = new exAlert();
		WebDriver driver = new FirefoxDriver();
		a.func(driver);
	}
		void func(WebDriver driver)
		{
			driver.get("http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm");
			Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			System.out.println(alt.toString());
			alt.accept();
			driver.manage().window().maximize();
			driver.quit();
		}
}
