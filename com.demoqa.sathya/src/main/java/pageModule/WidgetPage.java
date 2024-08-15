package pageModule;

import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.BasicFunction;
import webElement.Form_xpath;
import webElement.Widget_xpath;

public class WidgetPage extends Base {

	BasicFunction fun = new BasicFunction();

	public void Widget_menu() {
		Form_xpath form_xp = new Form_xpath(driver);
		Widget_xpath Widget_xp = new Widget_xpath(driver);

		fun.Click(driver, form_xp.Form_adv);
		fun.jsSrollIntoElement(driver, Widget_xp.Widget_menu);
		fun.Click(driver, Widget_xp.Widget_menu);
		fun.fluentWait(driver, Widget_xp.Widget_Accordian_Submenu);
		System.out.println(" Widget Menu Clicked");
	}

	public void Widget_accordian(ExtentTest test) throws InterruptedException, IOException {

		Widget_xpath Widget_xp = new Widget_xpath(driver);

		fun.Click(driver, Widget_xp.Widget_Accordian_Submenu);
		Thread.sleep(1000);
		fun.fluentWait(driver, Widget_xp.Acc_heading1);
		fun.Click(driver, Widget_xp.Acc_heading1);

		System.out.println("widgetheading  is  Clicked");

		if (Widget_xp.Acc_Content1.isDisplayed()) {
			System.out.println("Acc_Content1, PASSED");
			test.log(LogStatus.PASS, "Acc_Content1, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Acc_Content1, FAILED");
			test.log(LogStatus.FAIL, "Acc_Content1, FAILED", test.addScreenCapture(fun.capture(driver)));
		}

		fun.Click(driver, Widget_xp.Acc_heading2);
		Thread.sleep(1000);
		fun.fluentWait(driver, Widget_xp.Acc_heading2);
		fun.Click(driver, Widget_xp.Acc_heading2);

		System.out.println("Acc_heading2 is  Clicked");
		if (Widget_xp.Acc_Content2.isDisplayed()) {
			System.out.println("Acc_Content2, PASSED");
			test.log(LogStatus.PASS, "Acc_Content2, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Acc_Content1, FAILED");
			test.log(LogStatus.FAIL, "Acc_Content2, FAILED", test.addScreenCapture(fun.capture(driver)));
		}

		fun.Click(driver, Widget_xp.Acc_heading3);
		Thread.sleep(1000);
		fun.fluentWait(driver, Widget_xp.Acc_heading3);
		fun.Click(driver, Widget_xp.Acc_heading3);

		System.out.println("Acc_heading3 is  Clicked");
		if (Widget_xp.Acc_Content3.isDisplayed()) {
			System.out.println("Acc_Content3, PASSED");
			test.log(LogStatus.PASS, "Acc_Content3, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Acc_Content1, FAILED");
			test.log(LogStatus.FAIL, "Acc_Content3, FAILED", test.addScreenCapture(fun.capture(driver)));
		}
	}

	public void SelectMenu(ExtentTest test) throws InterruptedException, IOException {

		Widget_xpath Widget_xp = new Widget_xpath(driver);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, Widget_xp.SelectMenu_Submenu);
		fun.Click(driver, Widget_xp.SelectMenu_Submenu);

		fun.fluentWait(driver, Widget_xp.old_SelectMenu);
		Select select = new Select(Widget_xp.old_SelectMenu);
		select.selectByVisibleText("Black");
		System.out.println("clicked the single old_SelectMenu");
		test.log(LogStatus.PASS, "oldSelectMenu, PASSED", test.addScreenCapture(fun.capture(driver)));

		fun.fluentWait(driver, Widget_xp.multi_SelectMenu);
		fun.jsSrollIntoElement(driver, Widget_xp.multi_SelectMenu);

		String cars_options = "volvo,saab,opel,audi";
		String cars[] = cars_options.split(",");
		for (String value : cars) {
			Select select1 = new Select(Widget_xp.multi_SelectMenu);
			select1.selectByValue(value);

		}
		System.out.println("clicked the multi_SelectMenu ");
		test.log(LogStatus.PASS, "multi_SelectMenu, PASSED", test.addScreenCapture(fun.capture(driver)));
	}
	
	public void AutoComplete(ExtentTest test) throws IOException, InterruptedException, AWTException {
		Widget_xpath Widget_xp = new Widget_xpath(driver);

		Thread.sleep(1000);
		fun.jsSrollIntoElement(driver, Widget_xp.Widget_AutoComplete_Submenu);
		fun.Click(driver, Widget_xp.Widget_AutoComplete_Submenu);
		System.out.println("Auto Complete sub menu clicked");

		fun.Click(driver, Widget_xp.autoCompleteMultiple);
		System.out.println("multi select field clicked");

		Robot robot = new Robot();

		for (int i = 1; i <= 3; i++) {
			Thread.sleep(800);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);
			System.out.println("Single value passed in multi option");
			Thread.sleep(800);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("Enter button clicked");
		}

		fun.jsSrollIntoElement(driver, Widget_xp.autoCompleteSingle);
		fun.Click(driver, Widget_xp.autoCompleteSingle);
		System.out.println("Single select field clicked");

		Thread.sleep(800);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		System.out.println("Single value passed in multi option");
		Thread.sleep(800);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enter button clicked");

		String Single_Sel = Widget_xp.autoComplet_SIngle_Text.getText();
		if (Single_Sel.equalsIgnoreCase("Yellow")) {
			System.out.println("Single Select, PASS");
			test.log(LogStatus.PASS, "Single Select, passed", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Single Select, FAIL");
			test.log(LogStatus.FAIL, "Single Select, failed", test.addScreenCapture(fun.capture(driver)));
		}

	}
	
	public void DatePicker(ExtentTest test) throws InterruptedException, AWTException, IOException {
		Widget_xpath wid_xp = new Widget_xpath(driver);

		Thread.sleep(1500);
		fun.jsSrollIntoElement(driver, wid_xp.Date_picker_menu);
		fun.Click(driver, wid_xp.Date_picker_menu);
		System.out.println("Date_picker_menu clicked");

		fun.Click(driver, wid_xp.Date_Picker_SelectDate);
		System.out.println("Date_Picker_SelectDate field clicked");

		Robot robot = new Robot();
		Thread.sleep(1000);
		for (int i = 1; i <= 10; i++) {
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		System.out.println("Backspace pressed");

		fun.SendKeys(driver, wid_xp.Date_Picker_SelectDate, "10/09/2021");

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enter button clicked");

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB button clicked");

		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		System.out.println("backSpace button clicked");

		fun.SendKeys(driver, wid_xp.Date_Picker_DateandTime, "September 7, 2021 10:46 AM");
		System.out.println("Date selected");
		test.log(LogStatus.PASS, "Date Select, passed", test.addScreenCapture(fun.capture(driver)));
	}

}
