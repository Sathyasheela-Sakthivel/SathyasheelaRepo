package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;

	public void browser() throws InterruptedException {
		/*
		 * if(browser.equalsIgnoreCase("chrome")) { String path =
		 * System.getProperty("user.dir") +
		 * "\\src\\test\\resources\\driverExe\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver", path); driver = new
		 * ChromeDriver(); }else if(browser.equalsIgnoreCase("FF")) {
		 * System.out.println("FireFox driver should be opened");} else {
		 * System.out.println("please check browser name"); }
		 */
		
	 
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\driverExe\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Execution complete");
	}


}
