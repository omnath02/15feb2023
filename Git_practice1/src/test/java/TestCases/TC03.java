package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {
public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\Velocity\\Selenium\\drivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
				


driver.manage().window().maximize();
Thread.sleep(2000);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.amazon.in/");




Thread.sleep(2000);


WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search.sendKeys("mobile");

Thread.sleep(2000);
   
	
WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit']"));
searchButton.click();
}}
