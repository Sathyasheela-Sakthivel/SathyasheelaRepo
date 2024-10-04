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

public class Postcase {

	
		@Test
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"D:\\old laptop\\old laptop\\sathya\\downloads\\practice.com\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
			// C:\Users\BIS\eclipse\committers-2022-09\eclipse\chromedriver
			WebDriver driver = (WebDriver) new ChromeDriver();
			driver.navigate().to("http://20.204.116.242:3000/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			// JavascriptExecutor jse = (JavascriptExecutor) driver;
			// jse.executeScript("arguments[0].scrollIntoView()");
			// jse.executeScript("arguments[0].click()");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id =':r1:']")).sendKeys("testadmin@gmail.com");
			driver.findElement(By.xpath("//*[@id =':r2:']")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id =':r3:']")).click();
			// WebDriverWait wait1 = new WebDriverWait(driver, 30);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text() ,'Input Data')]")))
					.click();
			// Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text() ,'Post-Case')]")))
					.click();
			Thread.sleep(3000);
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-faruc5']")))
					.click();

			driver.findElements(By.xpath(
					"//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1n0fcvr']"));
			Thread.sleep(3000);

			List<WebElement> opt = driver.findElements(
					By.xpath("//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1n0fcvr']"));
			int s = opt.size();
			// Iterating through the list selecting the desired option
			for (int j = 0; j < opt.size(); j++) {
				// if the option is By Subject click that option
				// wait.until(ExpectedConditions.visibilityOfElementLocated(
				// By.xpath("//label[contains(text(),'VIVEKA RISK MANAGMENT SERVICES PVT
				// LTD')]")));

				if (opt.get(j).getText().equals("VIVEKA RISK MANAGMENT SERVICES PVT LTD")) {
					opt.get(j).click();

					break;
				}
			}

			WebDriverWait wait2 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall  css-faruc5']")))
					.click();
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li"));
			Thread.sleep(2000);
			List<WebElement> opt1 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li"));
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

			WebDriverWait wait3 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div"))).click();
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]"));

			List<WebElement> opt2 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]"));
			int s2 = opt2.size();
			// Iterating through the list selecting the desired option
			for (int a = 0; a < opt2.size(); a++) {
				// if the option is By Subject click that option

				if (opt2.get(a).getText().equals("Annanagar")) {
					opt2.get(a).click();
					break;
				}
			}
			WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div"))).click();
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
			Thread.sleep(2000);
			List<WebElement> opt3 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
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
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(500);

			driver.findElement(By.xpath(
					"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"))
					.sendKeys("0081");

			driver.findElement(By.xpath(
					"//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium bg-success text-white css-oloert']"))
					.click();

			// ((JavascriptExecutor)
			// driver).executeScript("arguments[0].scrollIntoView(true);",
			// new WebDriverWait(driver,
			// 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":r1n:\"]"))));//
			// to perform Scroll on application using Selenium
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,-1150)", "");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"))
					.sendKeys("Vikram");
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,20)", "");
			driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).sendKeys("2nd cross,3rd Avenue ");
			driver.findElement(By.xpath("//*[@type='text']//following::input[2]")).sendKeys(" houseno:45A");
			driver.findElement(By.xpath("//*[@type='text']//following::input[3]")).sendKeys("Chennai");
			driver.findElement(By.xpath(("//*[@type='text']//following::input[4]"))).sendKeys("600050");
			driver.findElement(By.xpath("//*[@type='text']//following::input[5]"));
			// Create the object of the Select class
			// WebDriverWait wait5 = new WebDriverWait(driver, 60);
			// wait5.until(ExpectedConditions.visibilityOfElementLocated
			// (By.xpath("//*[@class='MuiInputBase-root MuiOutlinedInput-root
			// MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall
			// css-faruc5']"))).click();
			// Select se = new
			// Select(driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root
			// MuiSvgIcon-fontSizeMedium MuiSelect-icon MuiSelect-iconOutlined
			// css-uncf2l']")));

			// Select the option using the visible text
			// se.selectByVisibleText("TamilNadu");
			WebDriverWait wait5 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div/div")))
					.click();
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
			List<WebElement> opt4 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
			Thread.sleep(2000);
			int s4 = opt4.size();
			// Iterating through the list selecting the desired option
			for (int q = 0; q < opt4.size(); q++) {
				// if the option is By Subject click that option

				if (opt4.get(q).getText().equals("TamilNadu")) {
					opt4.get(q).click();
					break;
				}
			}
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("window.scrollBy(0,650)", "");
			driver.findElement(By.xpath("//*[@type='text']//following::input[6]")).sendKeys("9566022833");
			driver.findElement(By.xpath("//*[@type='text']//following::input[7]")).sendKeys("sathyasheela1924@gmail.com");
			driver.findElement(By.xpath("//*[@type='text']//following::input[8]")).sendKeys("Rajesh");
			driver.findElement(By.xpath("//*[@type='text']//following::input[9]")).sendKeys("uii7888990oo");
			driver.findElement(By.xpath("//*[@type='text']//following::input[10]")).sendKeys("5666788999");
			// Find the date time picker control
			/*
			 * //WebElement selectDate =
			 * driver.findElement(By.xpath("//input[@type='date']"));
			 * 
			 * //selectDate.click(); // find the element that triggers the calendar
			 * WebElement dateInput = driver.findElement(By.id("//input[@type='date']"));
			 * 
			 * // click on the element to display the calendar dateInput.click();
			 * 
			 * // find the specific date element in the calendar WebElement dateElement =
			 * driver.findElement(By.xpath("//input[@value='2023-03-14']"));
			 * 
			 * // click on the date element to select it dateElement.click();
			 */
			Thread.sleep(1000);
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("window.scrollBy(0,490)", "");
			WebDriverWait wait6 = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[13]/div[2]/div/div")))
					.click();
			driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
			List<WebElement> opt5 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
			Thread.sleep(2000);
			int s5 = opt5.size();
			// Iterating through the list selecting the desired option
			for (int w = 0; w < opt5.size(); w++) {
				// if the option is By Subject click that option

				if (opt5.get(w).getText().equals("self employee")) {
					opt5.get(w).click();
					break;
				}
			}
			driver.findElement(By.xpath(
					"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputSizeSmall css-x7mp9n']"))
					.sendKeys("The trigger is check property");
			// Validate Checkbox using isDisplayed() and click
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("window.scrollBy(0,230)", "");
			Thread.sleep(3000);
			//checkbox for profile
			WebElement checkBoxElement = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[15]/div[2]/div[1]/span[1]"));
			// checkBoxElement.click();
			
			  boolean isDisplayed = checkBoxElement.isDisplayed();
			  
			   //performing click operation if element is displayed 
			   if (isDisplayed == true) {
				   checkBoxElement.click(); }
			 
			   //radio button
			   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[16]/div/div[1]/span[1]/input")).click();
			   JavascriptExecutor js7 = (JavascriptExecutor) driver;
				js7.executeScript("window.scrollBy(0,250)", "");
			   wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[17]/div/div/div")))
						.click();
				driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[8]"));
				List<WebElement> opt6 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[8]"));
				Thread.sleep(2000);
				int s6 = opt6.size();
				// Iterating through the list selecting the desired option
				for (int e = 0; e < opt6.size(); e++) {
					// if the option is By Subject click that option

					if (opt6.get(e).getText().equals("Ambattur")) {  
						opt6.get(e).click();
						break;
					}}
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[19]/div/div/div")))
						.click();
				driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[7]"));
				List<WebElement> opt7 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[7]"));
				Thread.sleep(2000);
				int s7 = opt7.size();
				// Iterating through the list selecting the desired option
				for (int r = 0; r < opt7.size(); r++) {
					// if the option is By Subject click that option

					if (opt7.get(r).getText().equals("property check")) {  
						opt7.get(r).click();
						break;
					}}
				
				//office details
				JavascriptExecutor js8 = (JavascriptExecutor) driver;
				js8.executeScript("window.scrollBy(0,-1150)", "");
				Thread.sleep(3000);
				driver.findElement(By.xpath(
						"//*[@type='text']//following::input[23]")) //23
						.sendKeys("Worlddevcloud Technology ");
				JavascriptExecutor js9 = (JavascriptExecutor) driver;
				js9.executeScript("window.scrollBy(0,20)", "");
				driver.findElement(By.xpath("//*[@type='text']//following::input[24]")).sendKeys("2nd cross,3rd Avenue ");
				driver.findElement(By.xpath("//*[@type='text']//following::input[25]")).sendKeys(" officeno:97A");
				driver.findElement(By.xpath("//*[@type='text']//following::input[26]")).sendKeys("Chennai");
				driver.findElement(By.xpath(("//*[@type='text']//following::input[27]"))).sendKeys("600050");
				JavascriptExecutor js11 = (JavascriptExecutor) driver;
				js11.executeScript("window.scrollBy(0,20)", "");
				
				/*
				 * JavascriptExecutor js20 = (JavascriptExecutor) driver;
				 * js20.executeScript("window.scrollBy(0,90)", "");
				 */
				driver.findElement(By.xpath("//*[@type='text']//following::input[28]"));
				WebDriverWait wait11 = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[7]/div[2]/div/div")))
						.click();
				driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
				List<WebElement> opt11 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]"));
				Thread.sleep(2000);
				int s11 = opt11.size();
				// Iterating through the list selecting the desired option
				for (int z = 0; z< opt11.size(); z++) {
					// if the option is By Subject click that option

					if (opt11.get(z).getText().equals("TamilNadu")) {
						opt11.get(z).click();
						break;
					}}
				JavascriptExecutor js10 = (JavascriptExecutor) driver;
				js10.executeScript("window.scrollBy(0,560)", "");    //550
				Thread.sleep(3000);
				  driver.findElement(By.xpath(("//*[@id=\":r12:\"]"))).
				  sendKeys("Near tree rain hotel");
					/*
					 * driver.findElement(By.xpath(("//*[@id=\":r13:\"]"))).sendKeys("044262728299")
					 * ;
					 * 
					 * driver.findElement(By.xpath(("//*[@id=\":r14:\"]"))).sendKeys("9876544322");
					 */
				  //driver.findElement(By.xpath(("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[12]/div[2]/div/div"))).
				  //sendKeys("Trigger is to check office land");
				 
				  JavascriptExecutor js18 = (JavascriptExecutor) driver;
					js18.executeScript("window.scrollBy(0,150)", "");
				Thread.sleep(1000);
						WebElement checkBoxElement2 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[13]/div[2]/div[1]/span[1]"));
						// checkBoxElement.click();
						
						  boolean isDisplayed2 = checkBoxElement2.isDisplayed();
						  
						   //performing click operation if element is displayed 
						   if (isDisplayed2 == true) {
							   checkBoxElement2.click(); }
						   
						   //radio button
						   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[14]/div/div[1]/span[1]")).click();
						   WebDriverWait wait12 = new WebDriverWait(driver, 60);
							wait.until(ExpectedConditions.visibilityOfElementLocated(
									By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[15]/div/div/div")))
									.click();
							driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[8]"));
							List<WebElement> opt12 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[8]"));
							Thread.sleep(2000);
							int s12 = opt12.size();
							// Iterating through the list selecting the desired option
							for (int d = 0; d< opt11.size(); d++) {
								// if the option is By Subject click that option

								if (opt12.get(d).getText().equals("Ambattur")) {
									opt12.get(d).click();
									break;
								}}
							//driver.findElement(By.xpath(("//*[@type='text']//following::input[27]"))).sendKeys("600050");

							
							
							JavascriptExecutor js12 = (JavascriptExecutor) driver; 
							js12.executeScript("window.scrollBy(0,490)", "");
							
							Thread.sleep(1000);
							wait.until(ExpectedConditions.visibilityOfElementLocated(
									By.xpath("//*[contains(text() ,'Next ')]")))
									.click();
							//driver.findElement(By.xpath(
									//*[@id=\"root\"]/main/div/div[2]/div[2]/div[2]/div/button[2]")).click();

															//loan page   
							Thread.sleep(3000);
							driver.findElement(By.xpath(
									"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")).sendKeys("10000000");
							
							
							
							driver.findElement(By.xpath(
									"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input")).sendKeys("rajan");
							driver.findElement(By.xpath(
									"//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']//following::input[2]")).sendKeys("prabhu");
							//save
							WebDriverWait wait13 = new WebDriverWait(driver, 60);
							wait.until(ExpectedConditions.visibilityOfElementLocated(
									By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div[1]/div[4]/div/div[2]/div/div")))
									.click();
							driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
							List<WebElement> opt13 = driver.findElements(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
							Thread.sleep(1000);
							int s13 = opt13.size();
							// Iterating through the list selecting the desired option
							for (int t = 0; t< opt13.size(); t++) {
								// if the option is By Subject click that option

								if (opt13.get(t).getText().equals("Rupan k")) {
									opt13.get(t).click();
									break;
								}}
							JavascriptExecutor js15 = (JavascriptExecutor) driver;
							js15.executeScript("window.scrollBy(0,450)", "");
							driver.findElement(By.xpath(
									"//*[@id=\"root\"]/main/div/div[2]/div[2]/div[2]/div/button[3]")).click();
		
	}

	};

