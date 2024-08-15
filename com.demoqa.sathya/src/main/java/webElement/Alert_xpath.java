package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_xpath {
	public Alert_xpath(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[3]/div/div[3]/h5") 
	public WebElement Alert_menu;

	@FindBy(id = "tabButton")
	public WebElement browser_tab;    

	@FindBy(id = "windowButton")
	public WebElement browser_window;

	@FindBy(xpath = "//*[@id=\"sampleHeading\"]")
	public WebElement sample_text;

	@FindBy(id = "sampleHeading")
	public WebElement sample2_text;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Modal Dialogs')]")
	public WebElement alert_ModalDialogs;

	@FindBy(id = "showSmallModal")
	public WebElement Small_modular_button;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]")
	public WebElement small_modal_text;

	@FindBy(xpath = "//*[@id=\"closeSmallModal\"]")
	public WebElement small_modal_Close;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Frames')]")
	public WebElement alert_frame_submenu;

	@FindBy(id = "frame1")
	public WebElement frame1;

	@FindBy(id = "frame2")
	public WebElement frame2;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Alerts')]")   
	public WebElement alert_alert_submenu;

	@FindBy(id = "alertButton")
	public WebElement alertbutton;

	@FindBy(id = "timerAlertButton")
	public WebElement timerAlertButton;

	@FindBy(id = "confirmButton")
	public WebElement confirmButton;

	@FindBy(id = "promtButton")
	public WebElement promtButton;

}
