package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		Actions a=new Actions(driver);
		a.moveToElement (ele).build().perform();
		String t=ele.getAttribute("title");
		System.out.println(t);
		
		
		

	}

	private static Actions build() {
		// TODO Auto-generated method stub
		return null;
	}

}
