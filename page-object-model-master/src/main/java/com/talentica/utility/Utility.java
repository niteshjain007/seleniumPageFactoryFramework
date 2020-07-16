package com.talentica.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static int PAGE_LOAD_TIMEOUT=60;

	
    public static  void takeScreenshot(String path, WebDriver driver)  {
	TakesScreenshot scrShot = ((TakesScreenshot) driver);
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile = new File(path);
	try {
		FileUtils.copyFile(SrcFile, DestFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
