package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		 WebElement button = driver.findElement(By.xpath("//button[@id='menu1']"));
		 
		 button.click();
		 
	List<WebElement> values =driver.findElements((By.xpath("//ul[@class='dropdown-menu']/li/a")));
	
	//for each
	
	                 for(WebElement t:values) {
	                	 
	              String dropdownValue =  t.getText();
	              
	              if(dropdownValue.equals("JavaScript")) {
	            	  
	            	  t.click();
	            	  break;
	              }
	              
	              
	                	 
	                	 
	                 }
	
	
	}

}
