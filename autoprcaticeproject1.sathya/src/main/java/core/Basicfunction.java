package core;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basicfunction {
	
	public void expicitwait(WebElement xpath, WebDriver driver) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf((xpath)));

	}

	public WebElement fluentWait(WebDriver driver, final WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout((Duration.ofSeconds(60)))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement elementWaitedFor = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return element;
			}
		});
		return elementWaitedFor;
	}

	public void Click(WebDriver driver, WebElement ele) {
		try {
			fluentWait(driver, ele);
			ele.click();
		} catch (Exception e) {
			System.out.println("expcetion occured");
			fluentWait(driver, ele);
			ele.click();
		}

	}

	public void SendKeys(WebDriver driver, WebElement ele, String value) {
		try {

			fluentWait(driver, ele);
			ele.click();
			ele.sendKeys(value);
		} catch (Exception e) {
			System.out.println("expcetion occured");
			fluentWait(driver, ele);
			ele.click();
		}
	}

	public void jsSrollIntoElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

	public String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(System.getProperty("user.dir") + "//src//test//resources//output//"
				+ System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}
}


