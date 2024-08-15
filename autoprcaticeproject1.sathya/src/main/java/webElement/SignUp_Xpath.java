package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Xpath {
	public SignUp_Xpath(WebDriver driver) {
		PageFactory.initElements(driver, this);           
	
		

	}
	
	@FindBy(xpath= "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")                           
	public WebElement Login_Menu;
	
	@FindBy(xpath="//*[@id=\"email_create\"]")                           
	public WebElement create_email_button;

	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")  
	public WebElement email_submit_button;

	@FindBy(xpath="//*[@id=\"id_gender2\"]")
	public WebElement gender2_button;

	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	public WebElement cutomfristname_button;

	@FindBy(id="customer_lastname")
	public WebElement cutomlastname_button;

	@FindBy(id="email")
	public WebElement email_button;

	@FindBy(id="passwd")
	public WebElement passwd_button;

	@FindBy(id="firstname")
	public WebElement firstname_button;

	@FindBy(id="lastname")
	public WebElement lastname_button;

	@FindBy(id="address1")
	public WebElement address1_button;

	@FindBy(id ="city")
	public WebElement city_button;

	@FindBy(id="id_state")
	public WebElement idstate_button;

	@FindBy(id="postcode")
	public WebElement postcode_button;

	@FindBy(id="id_country")
	public WebElement idcountry_button;

	@FindBy(id="phone_mobile")
	public WebElement phone_number;

	@FindBy(id="alias")
	public WebElement alias_button;

	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")    
	public WebElement submit_button;
	
	@FindBy(xpath="//*[@id=\"email\"]")                           
	public WebElement login_email_button;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")                           
	public WebElement password_email_button;  
	
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")                        
	public WebElement login_sumbit_button;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")                        
	public WebElement whislist_button;
	
	@FindBy(xpath="//*[@id=\"name\"]")                           
	public WebElement whislist_name_button;   
	
	@FindBy(xpath="//*[@id=\"submitWishlist\"]/span")                 
	public WebElement whislist_save_button;
	
	@FindBy(xpath="//*[@id=\"mywishlist\"]/ul/li[1]/a/span ")                        
	public WebElement back_acc_button;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")                          
	public WebElement cart_button;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")                   
	public WebElement cart_womenwear_button;
	
	//@FindBy(xpath="//*[@id=\"center_column\"]/div/div/div[3]/h1")               
	//public WebElement womenwear_blouse_button;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div")                
	public WebElement printeddress_column_button;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[2]")  //*[@id="center_column"]/p[2]/a[1]/span                     
	public WebElement printbottom_block_button;
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]")                     
	public WebElement addto_cart_button;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")                      
	public WebElement checkout_button;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span  ")                      
	public WebElement final_checkout_button;
	
	
}


