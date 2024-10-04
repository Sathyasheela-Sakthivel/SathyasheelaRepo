package pom;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmoduel.Registerpagelocators;



public class TestCase {
	public WebDriver driver;
	
	
	@BeforeClass()
	  public void Options() {
		
		
        
		//driver=new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		
		
		
		
		// Create ChromeOptions object to configure Chrome behavior
        ChromeOptions options = new ChromeOptions();

        // Suppress the "Choose your search engine" dialog and other first-run settings
        options.addArguments("--no-first-run");
        options.addArguments("--disable-search-engine-choice-screen");
     // Initialize Chrome driver with the options 
		  //WebDriver driver = new  ChromeDriver(options);

		
		  // Create a map for preferences to disable the search engine prompt and other pop-ups 
        Map<String, Object> prefs = new HashMap<String, Object>();
		  prefs.put("profile.default_content_setting_values.automatic_downloads", 1);// Allow automatic downloads
		  prefs.put("profile.default_content_setting_values.notifications", 2); //Disable notifications
		  prefs.put("profile.default_content_setting_values.popups", 0); // Disablepopups 
		  prefs.put("intl.accept_languages", "en-US,en"); // Set languagepreference to avoid prompts
		  
		  // Set preferences in ChromeOptions 
		  options.setExperimentalOption("prefs", prefs);
		  
		  // Initialize Chrome driver with the options 
		   driver = new  ChromeDriver(options);
		  
		  driver.manage().deleteAllCookies();
			
			driver.get("https://demo-opencart.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println(driver.getTitle());
			
		  
	    
	}

	
	@Test()
	public void verify_acct() {
		Registerpagelocators rp=new Registerpagelocators(driver);
		rp.setmyacct();
		rp.setregister();
		rp.setfrtname(randomString().toUpperCase());
		rp.setlastname(randomString().toUpperCase());
		rp.setmail(randomString()+"@gmail.com");
		
		String password=randomAlphanumberic();
		rp.setpaswd(password);
		rp.setchekbx();
		rp.cuntbutton();
		rp.setcuntbutton();
	}
		
	
	@Test
	public String randomString() {
		
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
				return generatedstring;
		
	
	}
		
		
public String randomNumberic() {
		
		String generatednumber=RandomStringUtils.randomNumeric(10);
				return generatednumber;
		
	
	}
		
public String randomAlphanumberic() {
	
	String generatedstring=RandomStringUtils.randomAlphabetic(5);
	String generatednumber=RandomStringUtils.randomNumeric(10);
			return (generatedstring+"@"+"$"+generatednumber);
	

}
	
		
		
	
	
	@AfterClass()
	public void teardown() {
		
		
		driver.quit();
		
	}
	
	
	
	
	
	
	

}
