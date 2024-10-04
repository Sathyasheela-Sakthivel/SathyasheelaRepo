package practice.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Configuration {
	WebDriver driver;
	@Test
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"D:\\old laptop\\old laptop\\sathya\\downloads\\practice.com\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
			// C:\Users\BIS\eclipse\committers-2022-09\eclipse\chromedriver
			WebDriver driver = (WebDriver) new ChromeDriver();
			driver.navigate().to("https://uatdocverification.sysmedac.com//");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			// JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView()");
			// jse.executeScript("arguments[0].click()");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id =':r1:']")).sendKeys("docverify@yopmail.com");
			driver.findElement(By.xpath("//*[@id =':r2:']")).sendKeys("123456");
driver.findElement(By.xpath("//*[@id =':r3:']")).click();
			//vendor
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text() ,'Configuration')]")))
			.click();
			
			/*
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
			 * xpath("//*[contains(text() ,'Vendor')]"))) .click(); WebDriverWait wait11 =
			 * new WebDriverWait(driver, 60);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
			 * xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'][1]"
			 * ))); Thread.sleep(2000); driver.findElement(By.xpath(
			 * ("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'][1]"))).
			 * sendKeys("003"); driver.findElement(By.
			 * xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']//following::input"
			 * )).sendKeys("Testing"); driver.findElement(By.
			 * xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium px-5 css-1iyplym']"
			 * )).click();
			 * driver.findElement(By.xpath("//*[@class='swal-button swal-button--confirm']")
			 * ).click();
			 */
			 
			//bank
			/*
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
			 * xpath("//*[contains(text() ,'Bank')]"))) .click(); WebDriverWait wait20 = new
			 * WebDriverWait(driver, 60);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated( By.
			 * xpath("//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']"
			 * ))) .click();
			 * driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]"));
			 * List<WebElement> opt20 =
			 * driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]"));
			 * Thread.sleep(2000); int s13 = opt20.size(); // Iterating through the list
			 * selecting the desired option for (int t = 0; t< opt20.size(); t++) { // if
			 * the option is By Subject click that option
			 * 
			 * if (opt20.get(t).getText().equals("Testing")) { opt20.get(t).click(); break;
			 * }} driver.findElement(By.
			 * xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"))
			 * .sendKeys("testingbank1");
			 * 
			 * driver.findElement(By.
			 * xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']//following::input[1]"
			 * )).sendKeys("sathya1@gmail.com"); driver.findElement(By.
			 * xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']//following::input[2]"
			 * )).sendKeys("987654321"); driver.findElement(By.
			 * xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium px-5 css-151qn7m']"
			 * )) .click();
			 */
			//driver.findElement(By.xpath("//*[@class='swal-button swal-button--confirm']")).click();
			
			//Branch
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text() ,'Branch')]")))
			.click();
			WebDriverWait wait21 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']")))
					.click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));  
			List<WebElement> opt21 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
			Thread.sleep(2000);
			int s14 = opt21.size();
			// Iterating through the list selecting the desired option
			for (int t = 0; t< opt21.size(); t++) {
				// if the option is By Subject click that option

				if (opt21.get(t).getText().equals("testingbank1")) {
					opt21.get(t).click();
					break;
				}}
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")).sendKeys("098");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[1]")).sendKeys("IndianBank");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[2]")).sendKeys("9566022888");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[3]")).sendKeys("India@gmail.com");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[4]")).sendKeys("23,tree road second cross near annanagar metro");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[6]")).sendKeys("chennai");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[7]")).sendKeys("600089");
			driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[8]")).sendKeys("IndianBank");
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver; 
			js1.executeScript("window.scrollBy(0,410)", "");
			
			WebDriverWait wait22 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']//following::input[10]")))
					.click();
			Thread.sleep(2000);
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
			List<WebElement> opt22 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
			Thread.sleep(2000);
			int s15 = opt22.size();
			// Iterating through the list selecting the desired option
			for (int t = 0; t< opt22.size(); t++) {
				// if the option is By Subject click that option

				if (opt22.get(t).getText().equals("TamilNadu")) {
					opt22.get(t).click();
					break;
				}}
			driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium px-5 css-151qn7m']")).click();
			
			
			
			
			
	}

}//*[@id=":rf:"]
