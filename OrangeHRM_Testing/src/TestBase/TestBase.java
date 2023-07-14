package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public static WebDriver driver; //Rename WebDriver name to driver
	
	//Intializing of Properties File
	public static Properties prop=new Properties();
	
	//Adding the file 
	public static File file=new File("C:\\Users\\na21279\\Documents\\GitHub\\OrangeHRM_Automation\\OrangeHRM_Testing\\Configuration\\config.properties");
	
	//Add Properties File Path
	public static FileInputStream fileinput=null;
	static {
		try {
			fileinput=new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileinput);
		}catch(IOException e) {
			
		}
	}
	
	
	

}
