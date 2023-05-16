package config;

import org.openqa.selenium.By;

public class Locators {


	/************* Locators GENERAL *************/
	//Purchase Keywords
	
	
	//Download Keywords
	
	
	//	Android Keyboard events
	
	public static By Searchicon=By.xpath("//*[@id='search_mag_icon']");

	//Generic Ok Message 
	public static By okMessage= By.xpath("//*[@text='OK']");

	/*Login Buttons */
	public static By Storename = By.xpath("//*[@text='General Store']");
	public static By username=By.xpath("//*[@text and @class='android.widget.EditText']");
	public static By password=By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Password']]]]");
	public static By loginNowbutton=By.xpath("//*[@text='LOG IN NOW']");
	public static By Logo=By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.widget.ImageView'])[1]");
	public static By Version=By.xpath("//*[@text=concat('Let', \"'\", 's  Shop')]");

	/*Inapp Buttons */
	public static By Settings=By.xpath("//*[@id='hplogo']");
	public static By playButton=By.xpath("\"((((//*[@class='androidx.recyclerview.widget.RecyclerView']/*/*/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]]])[5]/*[@class='android.view.ViewGroup'])[1]/*[@class='android.view.ViewGroup'])[2]/*[@class='android.widget.Button'])[1]\"");
	public static By pauseButton=By.xpath("((((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='androidx.viewpager.widget.ViewPager']]]/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]])[2]/*[@class='android.view.ViewGroup'])[2]/*[@class='android.view.ViewGroup'])[2]/*[@class='android.widget.Button'])[2]");


	/*Signup Buttons */
	public static By SignupButton=By.xpath("//*[@text='SIGN UP FREE']");
	public static By SEmailid=By.xpath("//*[@text and @class='android.widget.EditText']");
	public static By Spassword=By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='*Password']]]]");
	public static By Sconfpassword=By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='*Confirm Password']]]]");
	public static By Naboutyou=By.xpath("//*[@text='NEXT: ABOUT YOU']");
	public static By Sfirstname=By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[1]/*/*/*[@class='android.widget.EditText'])[1]");
	public static By Slastname=By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[1]/*/*/*[@class='android.widget.EditText'])[2]");
	public static By Socupation=By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.FrameLayout']])[1]");
	public static By sPhysician= By.xpath("//*[@text='Physician - DO']");
	public static By sSpeciality=By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Select']]]])[1]");
	public static By sOrthopedic=By.xpath("//*[@text='Orthopedic Surgery']");
	public static By sCountry=By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.FrameLayout' and ./*[./*[@text='Select']]]]");
	public static By sUS=By.xpath("//*[@text='United States']");
	public static By sCity=By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='*City']]]]");
	public static By sState=By.xpath("//*[@class='android.widget.Button' and (./preceding-sibling::* | ./following-sibling::*)[@text='*State']]");
	public static By sAK=By.xpath("//*[@text='AK']");
	public static By sInterests=By.xpath("//*[@text='NEXT: YOUR INTERESTS']");
	public static By sInterestcheckbox=By.xpath("//*[@class='android.widget.FrameLayout' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Anesthesiology']]");
	public static By sDashboard=By.xpath("//*[@text='NEXT: DASHBOARD']");

	//Forget Password Locator below
	public static By fPassword=By.xpath("//*[@text='Forgot your password?']");
	public static By fMessage= By.xpath("//*[@text='An email has been sent to reset your password']");


	//HomePage Locators
	public static By bChannels=By.xpath("//*[@text='BROWSE CHANNELS']");
	public static By bCategories=By.xpath("//*[@text='BROWSE CATEGORIES']");

	public static By nRecommended=By.xpath("//*[@text='NEW AND RECOMMENDED']");
	public static By bPodcastepisodes=By.xpath("//*[@text='BROWSE PODCAST EPISODES']");
	
	public static By search=By.xpath("//*[@id='search_src_text']");

	public static By searchIcon=By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='Search']]");
	public static By libraryIcon=By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='Library']]");
	public static By cmeIcon=By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='CME/CE Log']]");

	//Search Page Locators
	public static By Categories=By.xpath("//*[@text='CATEGORIES']");
	public static By Browse=By.xpath("//*[@text='BROWSE']");
	public static By pChannels =By.xpath("//*[@text='PODCAST CHANNELS']");
	public static By cmecebundles=By.xpath("//*[@text='CME/CE BUNDLES']");
	public static By pEpisodes=By.xpath("//*[@text='PODCAST EPISODES']");
	//Podcast Channel Search Resuultset 
	public static By pcresultset=By.xpath("//*[@text='General Surgery Channel Priyadarshan']");
	//podcast Episode Search Resultset
	public static By peresultset=By.xpath("//*[@text='Episode Priyadarshan music']");
	
	//Play Episode xpaths
	
	public static By tPause=By.xpath("//*[@text='PAUSE']");
	public static By tPlay=By.xpath("//*[@text='PLAY']");
	
	
	
	/*********************** LOCATORS ***********************/


}
