package corebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * public class Baseclass {
 * 
 * public static void main(String[] args) throws IOException {
 * 
 * 
 * 
 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
 * 
 * 
 * ChromeOptions options = new ChromeOptions(); //driver = new
 * ChromeDriver(options);
 * options.addArguments("--disable-search-engine-choice-screen");
 * 
 * chrome_options = Options()
 * chrome_options.add_argument("--disable-search-engine-choice-screen") driver =
 * webdriver.Chrome(options=chrome_options)
 * 
 * 
 * 
 * driver.get("https://demo-opencart.com/");
 * driver.manage().window().maximize(); System.out.println(driver.getTitle());
 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * Properties prop2=new Properties(); FileInputStream file1=new FileInputStream(
 * "C:\\Automation\\sampleproject3\\src\\test\\resources\\config.properties");
 * prop2.load(file1); //driver.get(prop1.getProperty("url"));
 * //driver.findElement(By.xpath(("//input[@placeholder='Username']"))).sendKeys
 * (prop1.getProperty("username")); WebElement
 * account=driver.findElement(By.xpath("//span[normalize-space()='My Account']")
 * ); account.click();
 * 
 * driver.findElement(By.
 * xpath("//a[@class='dropdown-item'][normalize-space()='Register'] ")).click();
 * 
 * 
 * 
 * WebElement
 * friname=driver.findElement(By.xpath("//input[@id='input-firstname']"));
 * friname.sendKeys("sathya"); WebElement
 * lastname=driver.findElement(By.xpath("//input[@id='input-lastname'] "));
 * lastname.sendKeys("s"); WebElement
 * email=driver.findElement(By.xpath("//input[@id='input-email']"));
 * email.sendKeys("sat123@yopmail.com"); WebElement
 * password=driver.findElement(By.xpath("//input[@id='input-password']"));
 * password.sendKeys("Sat@123");
 * 
 * JavascriptExecutor js= (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,900)", "");
 * 
 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
 * "//*[@id=\"input-newsletter\"]")));
 * 
 * WebElement
 * newsletter=driver.findElement(By.xpath("//*[@id=\"input-newsletter\"]"));
 * js.executeScript("arguments[0].scrollIntoView(true)",newsletter );
 * newsletter.isEnabled();
 * 
 * 
 * WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
 * "//*[@id=\"form-register\"]/div/div/input")));
 * 
 * 
 * WebElement checkbox=driver.findElement(By.xpath(
 * "//*[@id=\"form-register\"]/div/div/input"));
 * js.executeScript("arguments[0].scrollIntoView(true)", checkbox);
 * checkbox.click();
 * 
 * 
 * 
 * 
 * WebElement
 * contin=driver.findElement(By.xpath("//button[normalize-space()='Continue']"))
 * ; js.executeScript("arguments[0].scrollIntoView(true)", contin);
 * contin.click();
 * 
 * // TODO Auto-generated method stub
 * 
 * }
 * 
 * private static Object Options() { // TODO Auto-generated method stub return
 * null; }
 * 
 * }
 */