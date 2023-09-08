package com.sgtesting.tests;

public class ExecuteAutoItTestScriptDemo {
	
	public static void main(String[] args) {
		 executeDemo();
	}

	private static void executeDemo()
	{
		
		try
		{
			Runtime.getRuntime().exec("D:\\DemoAutomation\\Automation\\AutoIT\\FirstAutoIt.exe");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
