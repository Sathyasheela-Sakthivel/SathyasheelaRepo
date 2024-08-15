package runner2;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import core.Base;
import pageshop.SignUp;

public class Execution2 extends Base {
	SignUp signup = new SignUp();

	static ExtentTest test;
	static ExtentReports report;

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
	// @Parameters({ "chromebrowser" })
	public void beforemethod() throws InterruptedException {
		System.out.println("Beforemethod");
		browser();
	}

	@Test(priority = 1, enabled = true)
	public void testcase1() throws InterruptedException, IOException {
		System.out.println("testcase1");
		test = report.startTest("SignUp: test case 1");
		signup.personaldetail(test);
		signup.registration(test, toString());
		signup.login(test);
		signup.addcart(test);
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
