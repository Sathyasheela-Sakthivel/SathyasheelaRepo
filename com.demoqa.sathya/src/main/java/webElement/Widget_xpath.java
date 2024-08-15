package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widget_xpath {

	public Widget_xpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[4]/div/div[3]/h5")
	public WebElement Widget_menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Accordian')]")
	public WebElement Widget_Accordian_Submenu;

	@FindBy(id = "section1Heading")
	public WebElement Acc_heading1;

	@FindBy(id = "section1Content")
	public WebElement Acc_Content1;

	@FindBy(id = "section2Heading")
	public WebElement Acc_heading2;

	@FindBy(id = "section2Content")
	public WebElement Acc_Content2;

	@FindBy(id = "section3Heading")
	public WebElement Acc_heading3;

	@FindBy(id = "section3Content")
	public WebElement Acc_Content3;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Auto Complete')]")
	public WebElement Widget_AutoComplete_Submenu;

	@FindBy(id = "autoCompleteMultipleInput")
	public WebElement autoCompleteMultiple;

	@FindBy(id = "autoCompleteSingleInput")   
	public WebElement autoCompleteSingle;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Select Menu')]")  
	public WebElement SelectMenu_Submenu;
	
	@FindBy(id = "oldSelectMenu")   
	public WebElement old_SelectMenu; 
	
	@FindBy(id = "cars")   
	public WebElement multi_SelectMenu;
	
	@FindBy(xpath = "//*[@id='autoCompleteSingleContainer']/div/div[1]/div[1]")  
	public WebElement autoComplet_SIngle_Text;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Date Picker')]") 
	public WebElement Date_picker_menu;
	  
	@FindBy(id = "datePickerMonthYearInput") 
	public WebElement Date_Picker_SelectDate;
	  
	@FindBy(id = "dateAndTimePickerInput") 
	public WebElement Date_Picker_DateandTime;


}
