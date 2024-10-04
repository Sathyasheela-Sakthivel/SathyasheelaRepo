package javapactical;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class Baseclass {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop1=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Automation\\datadrivenproject\\properties\\config.properties");   
		prop1.load(fis);

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\datadrivenproject\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(prop1.getProperty("url"));
		driver.findElement(By.xpath(("//input[@placeholder='Username']"))).sendKeys(prop1.getProperty("username"));
		driver.findElement(By.xpath(("//input[@placeholder='Password']"))).sendKeys(prop1.getProperty("password"));  
		WebElement loginbutton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbutton.click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		WebElement admintxtbox=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		admintxtbox.sendKeys("Sara");
		WebElement admindropdown=driver.findElement(By.xpath("(//i)[12]"));
		admindropdown.click(); 
		WebElement hiddendropdown=driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		hiddendropdown.click();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		Set<Cookie>cookies=driver.manage().getCookies();//*[@id='L2AGLb']/div
		// WebElement ele=driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
		// JavascriptExecutor js = (JavascriptExecutor) driver; 
		//js.executeScript("aruguments[0].scrollintoview().ele");



	}










}










