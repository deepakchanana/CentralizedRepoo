package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	
	public static void drop_down(String visibleText,WebElement e)
	{
		Select s=new Select(e);
		s.selectByVisibleText(visibleText);
	}
}
