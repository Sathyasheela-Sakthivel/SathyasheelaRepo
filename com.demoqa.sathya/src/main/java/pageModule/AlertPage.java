package pageModule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.Base;
import core.BasicFunction;
import webElement.Alert_xpath;
import webElement.Form_xpath;

public class AlertPage extends Base {
	BasicFunction fun = new BasicFunction();

	public void Alert_menu() {
		Form_xpath form_xp = new Form_xpath(driver);
		Alert_xpath alert_xp = new Alert_xpath(driver);

		fun.Click(driver, form_xp.Form_adv);
		fun.jsSrollIntoElement(driver, alert_xp.Alert_menu);
		fun.Click(driver, alert_xp.Alert_menu);
		System.out.println("Alert Menu Clicked");
	}

	public void alert_Browser(ExtentTest test) throws IOException {
		Alert_xpath alert_xp = new Alert_xpath(driver);

		fun.jsSrollIntoElement(driver, alert_xp.alert_alert_submenu);
		fun.Click(driver, alert_xp.alert_alert_submenu);
		System.out.println("Browser sub Menu Clicked");

		fun.fluentWait(driver, alert_xp.browser_tab);
		fun.Click(driver, alert_xp.browser_tab);

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		fun.fluentWait(driver, alert_xp.sample_text);

		if (alert_xp.sample_text.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("alert_tab, PASSED");
			test.log(LogStatus.PASS, "alert_tab, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("alert_tab, FAILED");
			test.log(LogStatus.FAIL, "alert_tab, FAILED", test.addScreenCapture(fun.capture(driver)));
		}
		driver.close();
		System.out.println("tab 1 closed");

		driver.switchTo().window(tabs2.get(0));
		System.out.println("tab Switched Successfully");

		fun.fluentWait(driver, alert_xp.browser_window);
		fun.Click(driver, alert_xp.browser_window);
		System.out.println("browser window is clicked");

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				if (alert_xp.sample_text.getText().equalsIgnoreCase("This is a sample page")) {
					System.out.println("alert_tab, PASSED");
					test.log(LogStatus.PASS, "browser_window, PASSED", test.addScreenCapture(fun.capture(driver)));
				} else {
					System.out.println("alert_tab, FAILED");
					test.log(LogStatus.FAIL, "browser_window, FAILED", test.addScreenCapture(fun.capture(driver)));
				}

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}

	public void modular(ExtentTest test) throws IOException {
		Alert_xpath alert_xp = new Alert_xpath(driver);
		fun.fluentWait(driver, alert_xp.alert_ModalDialogs);

		fun.jsSrollIntoElement(driver, alert_xp.alert_ModalDialogs);
		fun.Click(driver, alert_xp.alert_ModalDialogs);
		System.out.println("modular_tab Clicked");

		fun.fluentWait(driver, alert_xp.Small_modular_button);
		fun.Click(driver, alert_xp.Small_modular_button);

		fun.fluentWait(driver, alert_xp.small_modal_text);
		if (alert_xp.small_modal_text.getText().equalsIgnoreCase("This is a small modal. It has very less content")) {
			System.out.println("Small_dialog, PASSED");
			test.log(LogStatus.PASS, "Small_dialog, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("Small_dialog, FAILED");
			test.log(LogStatus.FAIL, "Small_dialog, FAILED", test.addScreenCapture(fun.capture(driver)));
		}

		fun.Click(driver, alert_xp.small_modal_Close);
		System.out.println("smallmodular close Clicked");
	}

	public void frame(ExtentTest test) throws IOException, InterruptedException {
		Alert_xpath alert_xp = new Alert_xpath(driver);
		Thread.sleep(2000);
		fun.fluentWait(driver, alert_xp.alert_frame_submenu);
		fun.jsSrollIntoElement(driver, alert_xp.alert_frame_submenu);
		fun.Click(driver, alert_xp.alert_frame_submenu);
		System.out.println("frame tab Clicked");

		fun.fluentWait(driver, alert_xp.frame1);

		driver.switchTo().frame(alert_xp.frame1);
		fun.fluentWait(driver, alert_xp.sample_text);
		if (alert_xp.sample_text.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("frame1, PASSED");
			test.log(LogStatus.PASS, "frame1, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("frame1, FAILED");
			test.log(LogStatus.FAIL, "frame1, FAILED", test.addScreenCapture(fun.capture(driver)));
		}

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		fun.fluentWait(driver, alert_xp.frame2);
		fun.jsSrollIntoElement(driver, alert_xp.frame2);
		driver.switchTo().frame(alert_xp.frame2);
		System.out.println("Frame 2 Switched");

		fun.fluentWait(driver, alert_xp.sample_text);

		if (alert_xp.sample_text.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("frame2, PASSED");
			test.log(LogStatus.PASS, "frame2, PASSED", test.addScreenCapture(fun.capture(driver)));
		} else {
			System.out.println("frame2, FAILED");
			test.log(LogStatus.FAIL, "frame2s, FAILED", test.addScreenCapture(fun.capture(driver)));
		}

		driver.switchTo().defaultContent();

	}

	public void alert(ExtentTest test) throws IOException, InterruptedException {
		Alert_xpath alert_xp = new Alert_xpath(driver);

		fun.Click(driver, alert_xp.alert_alert_submenu);
		fun.fluentWait(driver, alert_xp.alert_alert_submenu);
		fun.jsSrollIntoElement(driver, alert_xp.alert_alert_submenu);
		System.out.println("alert submenu is Clicked");

		Thread.sleep(700);

		fun.Click(driver, alert_xp.alertbutton);
		fun.fluentWait(driver, alert_xp.alertbutton);
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		System.out.println("alert button is Clicked");

		Thread.sleep(700);

		fun.Click(driver, alert_xp.timerAlertButton);
		Thread.sleep(7000);
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		System.out.println("timerAlertButton is Clicked");

		Thread.sleep(700);

		fun.Click(driver, alert_xp.confirmButton);
		fun.fluentWait(driver, alert_xp.confirmButton);
		driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		System.out.println("cancelbutton is Clicked");

		Thread.sleep(700);

		fun.Click(driver, alert_xp.promtButton);
		fun.fluentWait(driver, alert_xp.promtButton);
		driver.switchTo().alert();
		fun.SendKeys(driver, alert_xp.promtButton,"sathya");
		driver.switchTo().alert().accept();
		System.out.println("promtButton is Clicked");
		
		test.log(LogStatus.PASS, "alert, passed", test.addScreenCapture(fun.capture(driver)));

	}
	
	// String text = obj.eleName.getAttribute("value");
}
