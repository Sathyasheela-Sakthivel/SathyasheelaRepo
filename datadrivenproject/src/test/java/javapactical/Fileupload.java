package javapactical;



import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fileupload {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\datadrivenproject\\src\\main\\resources\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
    //Upload file
    String file="C:\\Users\\Sathyasheela\\Downloads\\Book1.xls";
    WebElement fileuplod=driver.findElement(By.name("upfile"));
    fileuplod.sendKeys("C:\\Users\\Sathyasheela\\Downloads\\Book1.xls");
    driver.findElement(By.xpath(("//input[@value='Press']"))).click();
	}

}
