package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver driver;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void fillTheTextBox(WebElement location, String value) {
		location.sendKeys(value);

	}

	public static void btnClick(WebElement location) {
		location.click();

	}

	public static void screenShot(String name) throws IOException {
	
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dsc=new File("C:\\Users\\zubee\\ClassWorkSpace\\MVN9am\\screenShot\\"+name+".png");
	  FileUtils.copyFile(src, dsc);	
	}
	
	
	public static String readExcel(String name,int row,int cell) throws IOException {
		
		File f= new File("C:\\Users\\zubee\\ClassWorkSpace\\MVN9am\\data\\SampleData.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fi);
		
		Sheet sheet = book.getSheet(name);
		Row rows = sheet.getRow(row);
		Cell cells = rows.getCell(cell);
		// to check celltype   1=String 0= non string
		int type = cells.getCellType();
		
		
		String value="";
		
		if (type==1) {
			
			 value = cells.getStringCellValue();
			
		}
		
		else if (DateUtil.isCellDateFormatted(cells)) {
			Date date = cells.getDateCellValue();
			
			SimpleDateFormat s=new SimpleDateFormat("dd, MMMM, yyyy");
			 value = s.format(date);
		}
		else {
			double d = cells.getNumericCellValue();
			
			long l=(long)d;
			 value = String.valueOf(l);
			
		}
		
		return  value; 

	}
	
	public static void date() {
		
		Date d= new Date();
		SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String format = s.format(d);
		System.out.println(format);
	

	}
	
	
	public static void implict(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	
		
		
	}
	
	

}
