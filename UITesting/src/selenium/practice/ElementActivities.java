package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementActivities {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\shubh\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		//List<WebElement> m=driver.findElements(By.tagName("img"));
		//System.out.println(m.size());
		
		
		
		
		
		
	}

}
