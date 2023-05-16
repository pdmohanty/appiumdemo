package testscripts;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import testcases.Testcases;
import jxl.read.biff.BiffException;

public class Keywords extends DriverScript {
	/* Start of the Login Testcases */ 
	//Launch of the App without any crash
	public static String launching() throws Exception{
		try{
			System.out.println("Launch call started");
			result=BaseLibrary.launchApp();

			System.out.println("Launch call passed");

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			return result;
		}
		return result;
	}
	
	public static String login() throws Exception{
		try{
			System.out.println("Login call started");
			result=BaseLibrary.Login("priyadarshanm@icloud.com", "Weekdays7@123");

			System.out.println("Login call passed");

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			return result;
		}
		return result;
	}
	
//	invalidcredential tests 
	public static String invalidcreds() throws Exception{
		try{
			System.out.println("Invalid Creds call started");

			result=Testcases.fakeLogin("fake", "fake");

			System.out.println("Invalid Creds test passed");

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			return result;
		}
		return result;
	}
	//Version
		public static String version() throws Exception{
			try{
				System.out.println("Version Check call started");
				result=BaseLibrary.launchApp();
				result=Testcases.version();

				System.out.println("Version Check call passed");

			} catch (Throwable e) {
				System.out.println(e.getMessage());
				return result;
			}
			return result;
		}
	//Logo of the app
	public static String logo() throws Exception{
		try{
			System.out.println("Logo Verification call started");
			result=Testcases.Logo();

			System.out.println("Logo verification call passed");

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			return result;
		}
		return result;
	}
	
}