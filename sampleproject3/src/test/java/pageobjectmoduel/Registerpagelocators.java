package pageobjectmoduel;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registerpagelocators {

	WebDriver driver;

	public Registerpagelocators(WebDriver driver) {

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



	@FindBy(xpath="//a[normalize-space()='Continue']")
	public WebElement continuebutton2;
	

	public void setmyacct() {

		myaccount.click(); 

	}

	public void setregister() {

		registerbutton.click();
	}

	public void setfrtname(String name) {

		firstname.sendKeys(name);

	}

	public void setlastname(String lname) {

		lastname.sendKeys(lname);

	}

	public void setmail(String emailaddress) {

		email.sendKeys(emailaddress);

	}

	public void setpaswd(String password) {

		paswd.sendKeys(password);

		/*
		 * JavascriptExecutor js= (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,900)", "");
		 */

	}

	public void setchekbx() {


		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		checkbox.click();

		/*
		 * Actions act =new Actions(driver);
		 * act.moveToElement(checkbox).click().perform();
		 */


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

	public void setcuntbutton() {


		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOf(continuebutton2));

		continuebutton2.click();	



	}


}


