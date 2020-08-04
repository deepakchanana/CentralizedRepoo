package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
   public ChromeDriver driver;
   public Properties pr;
	@BeforeMethod
	public void init() throws IOException
	{
	System.setProperty("", "");
	driver=new ChromeDriver();
	driver.get("https://www.url.com");
	driver.manage().window().maximize();
	System.out.println("changes done");
	File f=new File("../YTFramework/Locators.properties");
	FileInputStream fi=new FileInputStream(f); 
	pr=new Properties();
	pr.load(fi);
	
	}

}
