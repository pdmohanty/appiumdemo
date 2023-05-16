package testscripts;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import config.Locators;

import org.openqa.selenium.By;
//import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import ObjectRepository.AboutObject;
import io.appium.java_client.AppiumDriver;
import testcases.Mfunction;

public class BaseLibrary extends DriverScript {

	// Stores current window handle
	static String currentWindowHandle;

	static String methodReturnResult=null;

	// Create a browser instance and navigate to the test site

	@SuppressWarnings("rawtypes")
	public static String launchApp() throws Exception {
		try {
			System.out.println("Launching the App");
			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("VERSION", "11.0");
			capabilities.setCapability("platformName",CONFIG.getProperty("deviceName"));
			capabilities.setCapability("UDID", CONFIG.getProperty("UDID"));
//			DesiredCapabilities capabilities1 = new DesiredCapabilities();
//			capabilities.setCapability("browserstack.user", "priyadarshanmoha_fghIVH");
//			capabilities.setCapability("browserstack.key", "FHkuNuqjU2QmuBKkWUaP");
	    	
	    	// Set URL of the application under test
//			capabilities1.setCapability("app", "bs://1db5635b413b0563901d97c44c2da528a793ad13");
//			capabilities1.setCapability("browserstack.debug", true);
			
			//capabilities.setCapability("browserstack.local", "true");
	    	// Specify device and os_version for testing
			
//			capabilities1.setCapability("device", "Samsung Galaxy S21");
//			capabilities1.setCapability("os_version", "12.0");
	        
	    	// Set other BrowserStack capabilities
//			capabilities1.setCapability("project", "Demo Java Project");
//			capabilities1.setCapability("build", "browserstack-build-2");
//			capabilities1.setCapability("name", "trial_run_kevin");
			capabilities.setCapability("appPackage", CONFIG.getProperty("appPackage"));
			capabilities.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");
			
			
			//driver = new AppiumDriver(new URL(CONFIG.getProperty("Appium_Node_URL")), capabilities);
			try {
	            driver = new AppiumDriver(new URL(CONFIG.getProperty("Appium_Node_URL")), capabilities);
	        } catch (MalformedURLException e) {
	            System.out.println("Invalid grid URL");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
			
			System.out.println("App launched, proceeding to Test");
			wait = new WebDriverWait(driver, 60);
			Shortwait = new WebDriverWait(driver, 5);
			Boolean result=Mfunction.verifyElementDisplayed(Locators.Storename,"LoginButton");
			if (result==true) {
				return "Pass";
			}
			else return "Fail";
		} catch (Exception e) {
			System.out.println("The Cause is " + e.getCause());
			System.out.println("The Message is " + e.getMessage());
			//return false;

		}
		//return true;
		//return methodReturnResult;
		return "Pass";
	}
	//Login
	public static String Login(String Username, String Password) throws Exception {
		try {
			//Login Successful

//			driver.findElement(By.xpath("//*[@id='splashscreen']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='nameField']")));
	        Mfunction.input(By.xpath("//*[@id='nameField']"), "name", FunctionLibrary.generateStringOfLengthl(5));
//	        driver.findElement(By.xpath("//*[@id='nameField']")).sendKeys("Priyadarshan");
	        Mfunction.click(By.xpath("//*[@text=concat('Let', \"'\", 's  Shop')]"), "Shop");
//	        driver.findElement(By.xpath("//*[@text=concat('Let', \"'\", 's  Shop')]")).click();
	        Mfunction.click(By.xpath("//*[@text='ADD TO CART' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Air Jordan 4 Retro']]]"), "Add to cart");
//	        driver.findElement(By.xpath("//*[@text='ADD TO CART' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Air Jordan 4 Retro']]]")).click();
	        
	        Mfunction.click(By.xpath("//*[@id='appbar_btn_cart']"), "cart");
	        
//	        driver.findElement(By.xpath("//*[@id='appbar_btn_cart']")).click();
	        
	        Mfunction.click(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']"), "checkbox");
//	        driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();
	        
	        Mfunction.click(By.xpath("//*[@text='Visit to the website to complete purchase']"), "Visit Button");
//	        driver.findElement(By.xpath("//*[@text='Visit to the website to complete purchase']")).click();

			
			if (Mfunction.verifyElementDisplayed(Locators.Settings, "Google Logo")) {
				return "Pass";
			}else return "Fail";

		} catch (Throwable e) {
			System.out.println("The Message is " + e.getMessage());
			return "Fail";
		}
		//return "Pass";
	}


}
