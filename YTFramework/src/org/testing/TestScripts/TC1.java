package org.testing.TestScripts;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assert1;
import org.testing.Base.Base;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 
{
	@Test
	public void bdb()
	{
	  System.out.println("Test1 annotation");	
	}
	
	@Test(enabled=false)
	public void bdkb()
	{
	  System.out.println("Test2 annotation");	
	}
	

}
