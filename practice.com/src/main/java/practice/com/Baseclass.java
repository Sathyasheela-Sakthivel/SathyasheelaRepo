package practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Baseclass {
	
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;

		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"D:\\old laptop\\old laptop\\sathya\\downloads\\practice.com\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
			// C:\Users\BIS\eclipse\committers-2022-09\eclipse\chromedriver
			WebDriver driver1 = (WebDriver) new ChromeDriver();
			driver1.navigate().to("https://uatdocverification.sysmedac.com//");
			driver1.manage().window().maximize();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver1, 30);
			// JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView()");
			// jse.executeScript("arguments[0].click()");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//*[@id =':r1:']")).sendKeys("docverify@yopmail.com");
			driver1.findElement(By.xpath("//*[@id =':r2:']")).sendKeys("123456");
			driver1.findElement(By.xpath("//*[@id =':r3:']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text() ,'Input Data')]")))
			.click();
	// Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text() ,'Pre-Case')]")))
			.click();
	Thread.sleep(3000);
	WebDriverWait wait1 = new WebDriverWait(driver1, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			"//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-faruc5']")))
			.click();

	driver1.findElements(By.xpath(
			"//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1n0fcvr']"));
	Thread.sleep(3000);

	List<WebElement> opt = driver1.findElements(
			By.xpath("//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1n0fcvr']"));
	int s = opt.size();
	// Iterating through the list selecting the desired option
	for (int j = 0; j < opt.size(); j++) {
		// if the option is By Subject click that option
		// wait.until(ExpectedConditions.visibilityOfElementLocated(
		// By.xpath("//label[contains(text(),'VIVEKA RISK MANAGMENT SERVICES PVT
		// LTD')]")));

		if (opt.get(j).getText().equals("Viveka Risk Management Service Pvt Ltd")) {
			opt.get(j).click();

			break;
		}
	}

	WebDriverWait wait2 = new WebDriverWait(driver1, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			"//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-faruc5']")))
			.click();
	driver1.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li"));
	Thread.sleep(2000);
	List<WebElement> opt1 = driver1.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li"));
	int s1 = opt1.size();
	// Iterating through the list selecting the desired option
	for (int k = 0; k < opt1.size(); k++) {
		// if the option is By Subject click that option
		String str = "One Two".trim();
		if (opt1.get(k).getText().equals("AADHAR HOUSING FINANCE LTD")) {
			opt1.get(k).click();
			break;

		}
	}

	WebDriverWait wait3 = new WebDriverWait(driver1, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div"))).click();
	driver1.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]"));

	List<WebElement> opt2 = driver1.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]"));
	int s2 = opt2.size();
	// Iterating through the list selecting the desired option
	for (int a = 0; a < opt2.size(); a++) {
		// if the option is By Subject click that option

		if (opt2.get(a).getText().equals("ambattur")) {
			opt2.get(a).click();
			break;
		}
	}
	WebDriverWait wait4 = new WebDriverWait(driver1, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div"))).click();
	driver1.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
	Thread.sleep(2000);
	List<WebElement> opt3 = driver1.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
	int s3 = opt3.size();
	// Iterating through the list selecting the desired option
	for (int b = 0; b < opt3.size(); b++) {
		// if the option is By Subject click that option

		if (opt3.get(b).getText().equals("Home Loan")) {
			opt3.get(b).click();
			break;
		}
	}
	// to perform Scroll on application using Selenium
	JavascriptExecutor js1 = (JavascriptExecutor) driver1;    
	js1.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(500);

	driver1.findElement(By.xpath(
			"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"))
			.sendKeys("0081");

	/*
	 * driver1.findElement(By.xpath(
	 * "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium bg-success text-white css-oloert']"
	 * )) .click();
	 */
	
	WebElement checkBoxElement = driver1.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[2]/div[1]/div/div/label/span[1]"));
	// checkBoxElement.click();
	
	  boolean isDisplayed = checkBoxElement.isDisplayed();
	  
	   //performing click operation if element is displayed 
	   if (isDisplayed == true) {
		   checkBoxElement.click(); }   
	   
	   // coapplicant tab
	   JavascriptExecutor js10 = (JavascriptExecutor) driver1;
		js10.executeScript("window.scrollBy(0,-1150)", "");
   Thread.sleep(1000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[contains(text() ,'Co Applicant')]")))
				.click();
		/*
		 * driver1.findElement(By.xpath(
		 * "//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary light-blue text-white fs-6 rounded-3 css-1js1set']"
		 * )) .click();
		 */
	   driver1.findElement(By.xpath(
				"//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary light-blue text-white fs-6 rounded-3 css-1js1set']/following::input[1]"))
				.sendKeys("Karan");
	   driver1.findElement(By.xpath(
				"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputSizeSmall css-x7mp9n'][1]"))
				.sendKeys("2A,raja towers,frist floor");
	   JavascriptExecutor js13 = (JavascriptExecutor) driver1;
		js13.executeScript("window.scrollBy(0,450)", "");
	   driver1.findElement(By.xpath(
				"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputSizeSmall css-x7mp9n'][1]"))
	.sendKeys("poorna appartment");
	   driver1.findElement(By.xpath(
				"//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary light-blue text-white fs-6 rounded-3 css-1js1set']/following::input[2]"))
				.sendKeys("Chennai");
	   JavascriptExecutor js14 = (JavascriptExecutor) driver1;
		js14.executeScript("window.scrollBy(0,550)", "");
	   driver1.findElement(By.xpath(
				"//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary light-blue text-white fs-6 rounded-3 css-1js1set']/following::input[3]"))
				.sendKeys("600060");
	   
	   
	   
	   

	}
}

