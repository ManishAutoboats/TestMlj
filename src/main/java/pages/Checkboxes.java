package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.manage().window().maximize();
		
	List<WebElement> allCheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	         int len =  allCheckbox.size(); //6
	
	
	for(WebElement ele:allCheckbox) {
		
		
		if(!ele.isSelected()) {
			ele.click();
		}
		
		
	  
		  
		  
		  
	
		 
		
		  
		  
	  }
		
	 
	    }
		
		
		
	
		
	
}
