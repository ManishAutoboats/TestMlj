package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));

		userName.sendKeys("TestAutomation");

		WebElement password = driver.findElement(By.cssSelector("[name='password']"));

		password.sendKeys("Test@12345");

		WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));
		
		  loginBtn.click();

	}

}
