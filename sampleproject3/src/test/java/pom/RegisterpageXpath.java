package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RegisterpageXpath  {
	WebDriver driver;



	public RegisterpageXpath(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//span[normalize-space()='My Account']") 
	public WebElement myaccount;

	@FindBy(xpath= "//a[@class='dropdown-item'][normalize-space()='Register']")
	public WebElement registerbutton;    

	@FindBy(xpath="//input[@id='input-firstname']")
	public WebElement firstname;

	@FindBy(xpath="//input[@id='input-lastname']")
	public WebElement lastname;

	@FindBy(xpath="//input[@id='input-email']")
	public WebElement email;

	@FindBy(xpath="//input[@id='input-password']")
	public WebElement paswd;

	@FindBy(xpath="//*[@id=\"input-newsletter\"]")
	public WebElement newsletter;

	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/input")
	public WebElement checkbox;

	@FindBy(xpath="//button[normalize-space()='Continue']")
	public WebElement continuebutton;


	public void myacct() {

		myaccount.click(); 

	}

	public void register() {

		registerbutton.click();
	}

	public void frtname(String name) {

		firstname.sendKeys();

	}

	public void lastname(String name) {

		lastname.sendKeys();

	}

	public void mail(String emailaddress) {

		email.sendKeys();

	}

	public void setpaswd(String password) {

		paswd.sendKeys();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");

	}

public void setchekbx() {


	/*
	 * Actions act =new Actions(driver);
	 * act.moveToElement(checkbox).click().perform();
	 */

checkbox.click();
/*
 * WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
 * wait1.until(ExpectedConditions.visibilityOfElementLocated((By) checkbox));
 */
/*
 * JavascriptExecutor js= (JavascriptExecutor) driver;
 * js.executeScript("arguments[0].click();", checkbox);
 */




}
public void cuntbutton() {
	continuebutton.click();



}


}