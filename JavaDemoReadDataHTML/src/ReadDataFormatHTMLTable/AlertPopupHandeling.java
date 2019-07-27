package ReadDataFormatHTMLTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AlertPopupHandeling {
	
	System.setProperty("webdriver.chrome.driver","C:\\JavaSeleniumWD\\drivers\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
}
	
