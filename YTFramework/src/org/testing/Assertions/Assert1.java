package org.testing.Assertions;

public class Assert1 {
	
	public static Boolean Assertionn(String exp,String actual)
	{
		if(actual.equals(exp))
		{
			System.out.println("Assertion passed");
			return true;
		}
		else
		{
			System.out.println("Assertion failed");
			return false;
		}
	}

}
