package selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		String parent=driver.getWindowHandle();
		Set<String> w=driver.getWindowHandles();
		Iterator<String> it=w.iterator();
		while(it.hasNext()) {
			String child=it.next();
			
			if(!(child.equals(parent))) {
				driver.switchTo().window(child);
				String s=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				System.out.println(s);
				driver.close();
			}
			driver.switchTo().window(parent);
	        System.out.println(driver.getTitle());
		}
		
	}

}
