package testcases;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import config.Locators;
import testscripts.DriverScript;
import testscripts.FunctionLibrary;
//import testscripts.ImplementationLibrary;
import testscripts.BaseLibrary;

public class Testcases extends DriverScript {


	public static String emailid=FunctionLibrary.generateStringOfLengthl(3)+"auto@gmail.com";
	public static String password="Weekdays7@123";
	//Testcases Below
	public static String Logo() throws Exception {
		if (Mfunction.verifyElementDisplayed(Locators.Logo, "Logo")==true)
		{
			result="Pass";
		}else result="Fail";
		return result;

	}
	public static String version() throws Exception {
		Mfunction.scrollDownToBottom();
		String version= Mfunction.retrieveText(Locators.Version, "Version");
		if (version.contains("Shop")==true)
		{
			result="Pass";
		}else result="Fail";
		return result;

	}
	
	public static String fakeLogin(String Username, String Password) throws Exception {
		try {
			//Login Successful
			
			FunctionLibrary.closeDriver();
			Mfunction.verifyElementDisplayed(Locators.Storename, "Store Name");

		} catch (Throwable e) {
			System.out.println("The Message is " + e.getMessage());
			return "Fail";
		}
		return "Pass";
	}

	

}

