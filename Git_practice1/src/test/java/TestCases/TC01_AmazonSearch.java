package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC01_AmazonSearch {
public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\softwere testing\\automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		
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

	//	WebElement firstResult=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	//	firstResult.click();
						
	//	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	//	driver.switchTo().window(addr.get(1));

	//	Thread.sleep(3000);

		//get details of product title from searched product
	//	WebElement a=driver.findElement(By.xpath("//div[@id='corePriceDisplay_desktop_feature_div']//span[2]//span[2]//span[2]"));
	//	String productPricefromSearch=a.getText();
	//	System.out.println(productPricefromSearch);


	//	Thread.sleep(1000);	
	//	WebElement addToCart=driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
	//	addToCart.click();

	//	Thread.sleep(1000);		

		//WebElement closeBtn=driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
		//closeBtn.click();

	//	Thread.sleep(1000);	
	//	WebElement cartOptn=driver.findElement(By.xpath("//div[@id='nav-cart-text-container']"));
	//	cartOptn.click();

	//	System.out.println("==========================");
				
		// take  product price  from cart section
	//	WebElement b=driver.findElement(By.xpath("//div[@id='sc-active-cart']//form//div[@class='sc-item-price-block']"));
	//	String productPricefromCart=b.getText().replace(".00", "").trim();
	//	System.out.println(productPricefromCart);

	//	System.out.println("==========================");
		//to delete item from cart
	//	Thread.sleep(2000);	
	//	WebElement dropdown=driver.findElement(By.xpath("//select[@id='quantity']"));

		//Select sc =new Select(dropdown);
		//sc.selectByVisibleText("0 (Delete)");
		//sc.selectByIndex(0);

	//	WebElement del=driver.findElement(By.xpath("(//input[@type='submit'][@value='Delete'])[1]"));
	//	del.click();




		//Verify that product is added to our cart and compare 
		//if(productPricefromSearch.equals(productPricefromCart))
	//	{System.out.println("Test is pass");}
	//	else
	//	{System.out.println("Test is fail");}

		//move to element and sign out 
	//	Thread.sleep(2000);	
	//	WebElement accountandlist1 =driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	//	WebElement signoutBtn=driver.findElement(By.xpath("//span[text()='Sign Out']"));

	//	Thread.sleep(3000);	
	//	act.moveToElement(accountandlist1).moveToElement(signoutBtn).build().perform();


		// browser close
	//	Thread.sleep(2000);	
	//	driver.quit();



				}}
