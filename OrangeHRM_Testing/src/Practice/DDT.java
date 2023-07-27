package Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {
	File src=new File("C:\\Users\\na21279\\eclipse-workspace\\Practice\\TestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	int rc=sheet.getLastRowNum();
	for(int i=0;i<=rc;i++)
	{
	String Location=sheet.getRow(i).getCell(0).getStringCellValue();
	String Hotels=sheet.getRow(i).getCell(1).getStringCellValue();
	String RoomType=sheet.getRow(i).getCell(2).getStringCellValue();
	System.out.println(Location+" "+Hotels+" "+RoomType);
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	//wait
	Thread.sleep(2000);
	//enter username
	WebElement UserName=driver.findElement(By.xpath("//input[@id='username']"));
	UserName.sendKeys("Admin810");
	
	//enter Password
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("admin123");
	
	//Wait
	Thread.sleep(2000);
	//Click on Login
	WebElement LoginButton=driver.findElement(By.xpath("//input[@id='login']"));
	LoginButton.click();
	//Wait
	Thread.sleep(4000);
	
	//Select The Location
	WebElement location=driver.findElement(By.xpath(""));
	location.sendKeys(Location);
	
	//Select The Hotel
	WebElement hotel=driver.findElement(By.xpath(""));
	hotel.sendKeys(Hotels);
	
	//Close The Driver
	driver.quit();
}
}
}
