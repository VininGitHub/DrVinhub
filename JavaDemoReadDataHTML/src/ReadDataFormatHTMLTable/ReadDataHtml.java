package ReadDataFormatHTMLTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataHtml {
	
	@Test
	public void ReadDataFormathtml()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\JavaSeleniumWD\\drivers\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.livechennai.com/gold_silverrate.asp");
		System.out.println(dr.getTitle());
		
		//get cell value from HTML/Web Table
		
		System.out.println(dr.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[3]/td[4]/font")).getText());
		//List<WebElement> t=dr.findElements(By.xpath(""));
		List<WebElement> trcount=dr.findElements(By.tagName("tr"));
		System.out.println(trcount.size());
		
		
		
		//Row count, 
		
		
		//Cell count
		
	}

	
}
