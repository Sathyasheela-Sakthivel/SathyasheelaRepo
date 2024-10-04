package practice.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ExtentSparkReporter html = new ExtentSparkReporter("D:\\old laptop\\old laptop\\sathya\\downloads\\practice.com\\extentreport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("documentverification", "test to validate the application");
        
        
        //System.setProperty("webdriver.chrome.driver",
				//"D:\\old laptop\\old laptop\\sathya\\downloads\\practice.com\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		// C:\Users\BIS\eclipse\committers-2022-09\eclipse\chromedriver
		//WebDriver driver = (WebDriver) new ChromeDriver();
		//driver.navigate().to("https://uatdocverification.sysmedac.com//");
		
     // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
        // calling flush writes everything to the log file
        extent.flush();
    }
		

	}


