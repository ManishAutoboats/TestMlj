package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
	WebElement btn=	driver.findElement(By.xpath("//button[@id='promptBox']"));
	
	 btn.click();
	 
	Alert a =   driver.switchTo().alert();
	
String s =	a.getText();

System.out.println(s);
	
	a.sendKeys("TesstAutomation");
	
	a.accept();
	
	
	
	
	
	
	
	
	}

}
