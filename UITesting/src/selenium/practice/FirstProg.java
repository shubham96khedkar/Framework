package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProg {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("pqr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("dhyrt");
        driver.findElement(By.name("login")).click();
     
	}

}