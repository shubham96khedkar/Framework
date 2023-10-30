package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\shubh\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
		Actions a=new Actions(driver);
        WebElement m=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        a.moveToElement(m).build().perform();
        a.contextClick().build().perform();
        Thread.sleep(3000);
       // WebElement p=driver.findElement(By.xpath("//div[@class='bxc-grid__text a-text-center   bxc-grid__text--light']"));
      //  a.moveToElement(p).build().perform();
        WebElement t=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       // a.moveToElement(t).click().keyDown(Keys.SHIFT).sendKeys("apple").release().build().perform();
        a.moveToElement(t).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("pple").build().perform();
        Thread.sleep(3000);
        driver.quit();
		
        
        
	}

}
