package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_xpath {
	public Form_xpath(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement Form_firstname;

	@FindBy(xpath = ("//input[@id='lastName']"))
	public WebElement form_lastName;

	@FindBy(xpath = "//input[@id='userEmail']")
	public WebElement Form_userEmail;

	@FindBy(xpath = "//label[@for='gender-radio-2']")
	public WebElement Form_genderfemale;

	@FindBy(xpath = "//label[@for='gender-radio-1']")
	public WebElement Form_gendermale;

	@FindBy(xpath = "//input[@id='userNumber']")
	public WebElement Form_userNumber;

	@FindBy(id = "dateOfBirthInput")
	public WebElement dateOfBirthInput;

	@FindBy(xpath = "//input[@id='hobbies-checkbox-1']")  
	public WebElement Form_hobbies;

	@FindBy(xpath = "//*[@id=\"uploadPicture\"]")
	public WebElement uploadfile_form;

	@FindBy(xpath = "//input[@id='uploadPicture']")
	public WebElement uploadPicture;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	public WebElement form_CurrentAddress;

	@FindBy(id = "submit")
	public WebElement Form_submit;
	
	@FindBy(id="closeLargeModal")
	public WebElement Form_close_dailog;

	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5")
	public WebElement Form_menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Practice Form')]")
	public WebElement Form_practiceform;

	@FindBy(xpath = "//img[@title='Ad.Plus Advertising']")
	public WebElement Form_adv;

}
