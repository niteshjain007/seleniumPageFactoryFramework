package com.talentica.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.talentica.utility.Utility;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase(){
		prop=new Properties();
		try {
		FileInputStream fi = new FileInputStream("src\\main\\java\\com\\talentica\\config\\config.properties");
		prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		
		if(prop.getProperty("browser").equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		String myURL= prop.getProperty("url");
		driver.get(myURL);
		driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

}
