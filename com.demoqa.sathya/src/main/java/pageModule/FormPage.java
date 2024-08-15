package pageModule;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.BasicFunction;
import webElement.Form_xpath;

public class FormPage extends Base {
	BasicFunction fun = new BasicFunction();

	public void form(ExtentTest test,String Firstname,String LastName,String MobileNumber) {
		Form_xpath form_xp = new Form_xpath(driver);
		try {
		
		fun.jsSrollIntoElement(driver, form_xp.Form_menu);
		
		fun.Click(driver, form_xp.Form_adv);
		
		fun.Click(driver, form_xp.Form_menu);
		
		fun.Click(driver, form_xp.Form_practiceform);
		
		fun.fluentWait(driver, form_xp.Form_firstname);
		
		fun.SendKeys(driver, form_xp.Form_firstname, Firstname);
		System.out.println("firstname entered");
		
		fun.SendKeys(driver, form_xp.form_lastName, LastName);
		System.out.println("lastname entered");
		
		fun.SendKeys(driver, form_xp.Form_userEmail, "sathyasheela1924@gmail.com");
		System.out.println("Email entered");
		
		fun.SendKeys(driver, form_xp.Form_genderfemale, "female");
		System.out.println("gender entered");
		
		fun.SendKeys(driver, form_xp.Form_userNumber, MobileNumber);
		System.out.println("userNumber entered");
		
		/*
		 * fun.jsSrollIntoElement(driver, form_xp.uploadfile_form);
		 * fun.Click(driver,form_xp.uploadfile_form ); Runtime.getRuntime().exec(
		 * "C:\\Automation\\com.demoqa.sathya\\src\\test\\resources\\fileupload.exe");
		 * test.log(LogStatus.INFO,test.addScreenCapture(fun.capture(driver)));
		 */
		
		
		fun.jsSrollIntoElement(driver, form_xp.form_CurrentAddress);
		fun.SendKeys(driver, form_xp.form_CurrentAddress, "abc");
		System.out.println("CurrentAddress entered");
			
		test.log(LogStatus.INFO, "Form Data Filled",test.addScreenCapture(fun.capture(driver)));
		
		fun.SendKeys(driver, form_xp.Form_submit, "sathya");
		System.out.println("submit entered");
		
		test.log(LogStatus.INFO, "After Clicking on Submit Button",test.addScreenCapture(fun.capture(driver)));
		
		fun.fluentWait(driver, form_xp.Form_close_dailog);
		fun.jsSrollIntoElement(driver, form_xp.Form_close_dailog);
		
		if(form_xp.Form_close_dailog.isDisplayed()) {
			System.out.println("testcase 1, PASSED");
			test.log(LogStatus.PASS, "testcase 1, PASSED",test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("testcase 1, FAILED");
			test.log(LogStatus.FAIL, "testcase 1, FAILED",test.addScreenCapture(fun.capture(driver)));
		}
		
		fun.Click(driver, form_xp.Form_close_dailog);
		System.out.println("Close button Clicked");
		
		} catch(Exception e) {
			System.out.println("Warning Occurred");
			e.printStackTrace();
		}
	}

}
