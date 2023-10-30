package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\Downloads\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));
		int columnsize=col.size();
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowsize=row.size();
		System.out.println("col: "+columnsize+","+"row: "+rowsize);
		
		for(int i=1;i<=rowsize;i++) {
	     for(int j=2;j<=columnsize;j++) {
		String cellvalue=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(cellvalue);
		
			}
			
		}
		

	}

}
