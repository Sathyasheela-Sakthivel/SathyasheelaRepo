  package runner;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import core.Base;
import pageModule.AlertPage;
import pageModule.FormPage;
import pageModule.InteractionPage;
import pageModule.WidgetPage;
import util.ReadExcel;


public class Excecution extends Base {
	FormPage form = new FormPage();
	AlertPage alert = new AlertPage();
	WidgetPage Widget = new WidgetPage();
	InteractionPage interaction = new InteractionPage();
	static ExtentTest test;
	static ExtentReports report;

	@DataProvider(name = "excelData")
	public Object[][] readExcel() throws InvalidFormatException, IOException {
		return ReadExcel.readExcel(System.getProperty("user.dir") + "/src/test/resources/dataSheet/form.xlsx",
				"PracticeForm");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
		report = new ExtentReports(
				System.getProperty("user.dir") + "//src//test//resources//output//ExtentReportResults.html");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");

	}

	@BeforeMethod
	@Parameters({ "chromebrowser" })
	public void beforemethod() throws InterruptedException {
		System.out.println("Beforemethod");
		browser();

	}

	@Test(priority = 1, enabled = true, dataProvider = "excelData")
	public void testcase1(String Firstname, String LastName, String MobileNumber) throws InterruptedException {
		System.out.println("testcase1");
		test = report.startTest("Form: test case 1");
		form.form(test, Firstname, LastName, MobileNumber);

	}

	@Test(priority = 2, enabled = false)
	public void testcase2() throws IOException, InterruptedException {
		System.out.println("testcase2");
		test = report.startTest("Alert: test case 2");
		alert.Alert_menu();
		alert.alert_Browser(test);
		alert.modular(test);
		alert.frame(test);
		alert.alert(test);
	}

	@Test(priority = 4, enabled = false)

	public void testcase4() throws IOException, InterruptedException {
		System.out.println("testcase4");
		test = report.startTest("Interaction: test case 4");
		interaction.Interaction_menu();
		interaction.Sortable_Submenu(test);
		interaction.selectable(test);
		interaction.Droppable(test);
		interaction.resizable(test);
	}

	@Test(priority = 3, enabled = false)

	public void testcase3() throws IOException, InterruptedException, AWTException {
		System.out.println("testcase3");
		test = report.startTest("Widget: test case 3");
		Widget.Widget_menu();
		Widget.Widget_accordian(test);
		Widget.AutoComplete(test);
		Widget.DatePicker(test);
		Widget.SelectMenu(test);

	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
		driver.close();
		driver.quit();
		report.flush();
	}

	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");

	}

}
