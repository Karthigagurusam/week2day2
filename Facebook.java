package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Female" 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver;
		
		// To Launch the chrome
		ChromeDriver driver1 = new ChromeDriver();
		
		// To load the URL
		driver1.get("https://en-gb.facebook.com/");
		
		//Maximise the window
		driver1.manage().window().maximize();
		
		//Wait duration 
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver1.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();  
		
		//First name
		driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("karthiga");		
		
		//last name
		driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gurusamy");			
		
		
		//Registered password
		driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("omsairam123$A");	
	
		//Birthday day 
	driver1.findElement(By.xpath("//select[@name='birthday_day']")).click();
	//DOB Day
	WebElement day =	driver1.findElement(By.xpath("//select[@name='birthday_day']"));		
	Select selectday = new Select(day);
	selectday.selectByValue("18");
	
	//Birthday Month
	driver1.findElement(By.xpath("//select[@name='birthday_month']")).click();	
	WebElement month =	driver1.findElement(By.xpath("//select[@name='birthday_month']"));
	Select selectmonth = new Select(month);
	selectmonth.selectByValue("11");
	
	//Birthday Year
	driver1.findElement(By.xpath("//select[@name='birthday_year']")).click();	
	WebElement year = driver1.findElement(By.xpath("//select[@name='birthday_year']"));
	Select selectyear = new Select(year);
	selectyear.selectByValue("1999");
	
	driver1.findElement(By.xpath("(//div[@class='mtm _5wa2 _5dbb'][1]/span/span/input)[1]")).click();	//radio : female
	driver1.findElement(By.xpath("//input[@aria-label = 'Re-enter email address']")).sendKeys("madhumitha33@gmail.com");		//re-enter email
	
	driver1.findElement(By.xpath("//div[@class='_1lch']/button")).click();	// sign up
	//sign up done
		
		

	}

}
