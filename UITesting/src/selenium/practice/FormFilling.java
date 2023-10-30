package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//shubh//Downloads//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.facebook.com/");
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
		//driver.findElement(By.name("firstname")).sendKeys("Shubham");
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		//System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).isEnabled());
		//System.out.println(driver.findElement(By.xpath("//input[@id='sex-0']")).isSelected());
		 // System.out.println(driver.findElement(By.xpath("//button[@id='submit']")).getText());
		  driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		 // System.out.println(driver.findElement(By.xpath("//input[@id='sex-0']")).isSelected());
		  driver.findElement(By.xpath("//input[@id='exp-3']")).click();
		  driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("13.Nov.22");
		//  System.out.println(driver.findElement(By.xpath("//input[@id='datepicker']")).isDisplayed());
		  
		  //Single select dropdown
		  WebElement dropdown=driver.findElement(By.xpath("//select[@id='continents']"));
		  Select s=new Select(dropdown);
		  s.selectByVisibleText("Africa");
		//  s.selectByIndex(2);
		  //For getting first selected option
		  WebElement str=s.getFirstSelectedOption();
		  System.out.println(str.getText());
		  
		  //For multiselect dropdown
		  WebElement md=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		  Select s1=new Select(md);
		  //System.out.println(s1.isMultiple());
		  s1.selectByVisibleText("Navigation Commands");
		  s1.selectByVisibleText("Switch Commands");
		  //For getting first selected option
		  WebElement str2=s1.getFirstSelectedOption();
		  System.out.println(str2.getText());
		  //s1.deselectByVisibleText("Navigation Commands");
		  
		  //For uploading photo
		  driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\shubh\\OneDrive\\Desktop\\POOJA\\IMG_20200402_110300_3.jpg");
		  driver.findElement(By.xpath("//button[@id='submit']")).click();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
	}

}
