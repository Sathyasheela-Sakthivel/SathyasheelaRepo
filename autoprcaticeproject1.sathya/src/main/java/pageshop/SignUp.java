package pageshop;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.Basicfunction;
import webElement.SignUp_Xpath;

public class SignUp extends Base {
	Basicfunction fun = new Basicfunction();

	public void personaldetail(ExtentTest test) throws InterruptedException {
		SignUp_Xpath signup = new SignUp_Xpath(driver);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.Login_Menu);
		fun.fluentWait(driver, signup.Login_Menu);
		fun.Click(driver, signup.Login_Menu);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.create_email_button);
		fun.fluentWait(driver, signup.create_email_button);

		Thread.sleep(1000);
		fun.SendKeys(driver, signup.create_email_button, "sathyashee1924@gmail.com");
		System.out.println("email box is clicked");

		fun.Click(driver, signup.create_email_button);
		fun.fluentWait(driver, signup.email_submit_button);
		fun.Click(driver, signup.email_submit_button);
		System.out.println("sucessfully acc created");
		Thread.sleep(2000);
	}

	public void registration(ExtentTest test, String Indiana) throws InterruptedException {
		SignUp_Xpath signup = new SignUp_Xpath(driver);

		Thread.sleep(5000);
		fun.jsSrollIntoElement(driver, signup.gender2_button);
		fun.fluentWait(driver, signup.gender2_button);
		fun.Click(driver, signup.gender2_button);

		
		  Thread.sleep(2000); fun.jsSrollIntoElement(driver,
		  signup.cutomfristname_button); fun.fluentWait(driver,
		  signup.cutomfristname_button); fun.Click(driver,
		  signup.cutomfristname_button); fun.SendKeys(driver,
		  signup.cutomfristname_button, "sathya");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver,
		  signup.cutomlastname_button);
		  fun.fluentWait(driver,signup.cutomlastname_button); 
		  fun.Click(driver, signup.cutomlastname_button);
		  fun.SendKeys(driver, signup.cutomlastname_button, "sheela");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.email_button);
		  fun.fluentWait(driver, signup.email_button);
		  fun.Click(driver, signup.email_button);
		  String text = signup.login_email_button.getAttribute("value");
		  if(text.equalsIgnoreCase("sathyasheela1924@gmail.com")) {
			  System.out.println("Email id is valid");
		  } else {
			  System.out.println("Email id is Invalid");
		  }
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.passwd_button);
		  fun.fluentWait(driver, signup.passwd_button); fun.Click(driver,
		  signup.passwd_button); fun.SendKeys(driver, signup.passwd_button,
		  "sathya1924");
		  
			/*
			 * Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.firstname_button);
			 * fun.fluentWait(driver, signup.firstname_button); fun.Click(driver,
			 * signup.firstname_button); fun.SendKeys(driver, signup.firstname_button,
			 * "sathya");
			 * 
			 * Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.lastname_button);
			 * fun.fluentWait(driver, signup.lastname_button); fun.Click(driver,
			 * signup.lastname_button); fun.SendKeys(driver, signup.lastname_button,
			 * "sheela");
			 */
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.address1_button);
		  fun.fluentWait(driver, signup.address1_button); fun.Click(driver,
		  signup.address1_button); fun.SendKeys(driver, signup.address1_button,
		  "97Anorthmada street");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.city_button);
		  fun.fluentWait(driver, signup.city_button); fun.Click(driver,
		  signup.city_button); fun.SendKeys(driver, signup.city_button, "chennai");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.idstate_button);
		  fun.fluentWait(driver, signup.idstate_button); fun.Click(driver,
		  signup.idstate_button); Select select = new Select(signup.idstate_button);
		  select.selectByVisibleText("Indiana");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.postcode_button);
		  fun.fluentWait(driver, signup.postcode_button); fun.Click(driver,
		  signup.postcode_button); fun.SendKeys(driver, signup.postcode_button,
		  "600050");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.idcountry_button);
		  fun.fluentWait(driver, signup.idcountry_button); fun.Click(driver,
		  signup.idcountry_button); fun.SendKeys(driver, signup.idcountry_button,
		  "United State");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.phone_number);
		  fun.fluentWait(driver, signup.phone_number); fun.Click(driver,
		  signup.phone_number); fun.SendKeys(driver, signup.phone_number,
		  "9000000000");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.alias_button);
		  fun.fluentWait(driver, signup.alias_button); fun.Click(driver,
		  signup.alias_button); fun.SendKeys(driver, signup.alias_button,
		  "97A Northmada");
		  
		  Thread.sleep(1000); fun.jsSrollIntoElement(driver, signup.submit_button);
		 		fun.fluentWait(driver, signup.submit_button);
		fun.Click(driver, signup.submit_button);
		System.out.println("submit button is clicked");
	}

	public void login(ExtentTest test) throws InterruptedException {
		SignUp_Xpath signup = new SignUp_Xpath(driver);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.Login_Menu);
		fun.fluentWait(driver, signup.Login_Menu);
		fun.Click(driver, signup.Login_Menu);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.login_email_button);
		fun.fluentWait(driver, signup.login_email_button);
		fun.Click(driver, signup.login_email_button);
		fun.SendKeys(driver, signup.login_email_button, "sathyasheela1924@gmail.com");
		Thread.sleep(2000);
		fun.jsSrollIntoElement(driver, signup.password_email_button);
		fun.fluentWait(driver, signup.password_email_button);
		fun.Click(driver, signup.password_email_button);
		fun.SendKeys(driver, signup.password_email_button, "sathya1924");

		Thread.sleep(2000);
		fun.jsSrollIntoElement(driver, signup.login_sumbit_button);
		fun.fluentWait(driver, signup.login_sumbit_button);
		fun.Click(driver, signup.login_sumbit_button);

		Thread.sleep(6000);
		fun.jsSrollIntoElement(driver, signup.whislist_button);
		fun.fluentWait(driver, signup.whislist_button);
		//Thread.sleep(3000);
		fun.Click(driver, signup.whislist_button);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.whislist_name_button);
		fun.fluentWait(driver, signup.whislist_name_button);
		fun.Click(driver, signup.whislist_name_button);
		fun.SendKeys(driver, signup.whislist_name_button, "Blouse");
		fun.fluentWait(driver, signup.whislist_save_button);
		fun.Click(driver, signup.whislist_save_button);

		fun.fluentWait(driver, signup.back_acc_button);
		fun.Click(driver, signup.back_acc_button);
		Thread.sleep(1000);
	}

	public void addcart(ExtentTest test) throws InterruptedException, IOException {
		SignUp_Xpath signup = new SignUp_Xpath(driver);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.cart_button);
		fun.fluentWait(driver, signup.cart_button);
		fun.Click(driver, signup.cart_button);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.cart_womenwear_button);
		fun.fluentWait(driver, signup.cart_womenwear_button);
		fun.Click(driver, signup.cart_womenwear_button);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.printeddress_column_button);
		fun.fluentWait(driver, signup.printeddress_column_button);
		fun.Click(driver, signup.printeddress_column_button);
		fun.jsSrollIntoElement(driver, signup.printeddress_column_button);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.printbottom_block_button);
		fun.fluentWait(driver, signup.printbottom_block_button);
		fun.Click(driver, signup.printbottom_block_button);
		System.out.println("printblock button is clicked");

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.addto_cart_button);
		fun.fluentWait(driver, signup.addto_cart_button);
		fun.Click(driver, signup.addto_cart_button);
		fun.jsSrollIntoElement(driver, signup.addto_cart_button);
		System.out.println("item is added");

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, signup.checkout_button);
		fun.fluentWait(driver, signup.checkout_button);
		Thread.sleep(1000);
		driver.getWindowHandles();
		fun.Click(driver, signup.checkout_button);
		System.out.println("proceed to checkout");

		Thread.sleep(2000);
		fun.jsSrollIntoElement(driver, signup.final_checkout_button);
		fun.fluentWait(driver, signup.final_checkout_button);
		Thread.sleep(1000);
		fun.Click(driver, signup.final_checkout_button);
		System.out.println("proceed to finalcheckout");
		test.log(LogStatus.PASS, "SignUp, passed", test.addScreenCapture(fun.capture(driver)));

	}

}
