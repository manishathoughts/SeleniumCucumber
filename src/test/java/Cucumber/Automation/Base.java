package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
   public static Properties prop;
	
	public static WebDriver getdriver() throws IOException
	{
		 prop= new Properties();
		String project=System.getProperty("user.dir", "chromedriver.exe");
        System.out.println(project);
		FileInputStream fis= new FileInputStream(project+"//base.properties");
		prop.load(fis);
        System.setProperty("webdriver.chrome.driver", project+"//chromedriver.exe");
         driver= new ChromeDriver();
         driver.get(prop.getProperty("URL"));
		return driver;
	}
}
