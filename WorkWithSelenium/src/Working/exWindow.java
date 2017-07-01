package Working;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exWindow {

	public static void main(String[] args) {
		exWindow w1 = new exWindow();
		WebDriver driver = new FirefoxDriver();
		Window w2 = driver.manage().window();
		w1.playwithwindow(driver, w2);

	}
	void playwithwindow(WebDriver driver, Window w)
	{
		driver.get("https://www.amazon.com/");
		w.maximize();// to maximize the browser
		
		System.out.println(w.getPosition());
		System.out.println(w.getSize());
		System.out.println(w.getClass());
		
		Dimension d = new Dimension(1000, 500);
		w.setSize(d);
		
		Point p = new Point(250, 100);
		w.setPosition(p);
		
	}
}
