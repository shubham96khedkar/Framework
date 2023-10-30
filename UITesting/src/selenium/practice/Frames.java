package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//List<WebElement> l=driver.findElements(By.tagName("iframe"));
		//int s=l.size();
		//System.out.println(s);
		//String s=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		//System.out.println(s);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
		String s1=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(s1);
		
		
		
		

	}

}
