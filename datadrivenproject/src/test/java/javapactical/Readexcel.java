package javapactical;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;




public class Readexcel{
	String[][] Vardata = null;
	WebDriver driver;
		
		//String excelfilepath=",\\datafile\\"
		//XSSFWorkbook workbook= new XSSFWorkbook()

	
	@Test(dataProvider="productdata")
	public void getlogindata(String username,String password)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\datadrivenproject\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath(("//input[@placeholder='Username']"))).sendKeys(username);
		driver.findElement(By.xpath(("//input[@placeholder='Password']"))).sendKeys(password);  
		WebElement loginbutton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbutton.click();
		
		
		
		
		
	}
	
	
	
	@DataProvider(name = "productdata")
		public String[][] getvariant() throws IOException, BiffException {

			FileInputStream fis = new FileInputStream("C:\\Automation\\datadrivenproject\\properties\\Book1.xlsx");
			File ExcelFile=new File("C:\\Automation\\datadrivenproject\\properties\\Book1.xlsx");
			System.out.println(ExcelFile.exists());

		
			XSSFWorkbook file = new XSSFWorkbook(fis);
			
			XSSFSheet Sheetno = file.getSheet("Sheet1");

			int rowcount = Sheetno.getPhysicalNumberOfRows();
			int columncount = Sheetno.getRow(0).getLastCellNum();

			String testdata[][] = new String[rowcount - 1][columncount];

			for (int i = 0; i < rowcount-1; i++) {
				for (int j = 0; j < columncount; j++) {
              DataFormatter df=new DataFormatter();
					testdata[i ][j] = df.formatCellValue(Sheetno.getRow(i+1).getCell(j));

				}

			}

			return testdata;


}
}