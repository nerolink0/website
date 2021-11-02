package Headers;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Industries {
	
	
	
	public static void main(final String[] args) throws Exception
	{
		

		// Cookies accept/learn more options
		String accept_cookies = "cookie_action_close_header";
		
		// links,xpaths,ids LOCATORS of all the elements needed
		String industries_path = "mega-menu-item-1834";
		String all_industries = "mega-menu-item-4565";
		String security_header = "mega-menu-item-28806";
		String home_healthcare_header = "mega-menu-item-28801";
		String longterm_healthcare_header = "mega-menu-item-28804";
		String hospitality_header = "mega-menu-item-28802";
		String events_venues_header = "mega-menu-item-28800";
		String manufacturing_header = "mega-menu-item-28805";
		String libraries_header = "mega-menu-item-28803";
		
		// Headings of the subsections of INDUSTRIES
		String all_industries_page_heading = "//div[@id='et-boc']//h2[text()='Industries']";
		String security_page_heading = "//div[@id='et-boc']//h1[text()='Automated Security Guard Scheduling and']";
		String home_healthcare_page_heading = "//div[@id='et-boc']//h1[text()='Automated Home Health Care Scheduling and']";
		String longterm_healthcare_page_heading = "//div[@id='et-boc']//h1[text()='Automated Long Term Health Care']";
		String hospitality_page_heading = "//div[@id='et-boc']//h1[text()='Automated Scheduling and']";
		String events_venues_page_heading = "//div[@id='et-boc']//h1[text()='Automated Staff Scheduling and Time & Attendance']";
		String manufacturing_page_heading = "//div[@id='et-boc']//h1[text()='Automated Employee Shift Scheduling']";
		String libraries_page_heading = "//div[@id='et-boc']//h1[text()='Automated Library Staff Scheduling and']";
		
		// Subsections of Industries
		String security_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_0 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String healthcare_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_2 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String longterm_healthcare_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_4 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String hospitality_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_6 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String events_venues_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_1 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String manufacturing_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_3 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String libraries_industries_page = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_5 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		
		// industry page paths, locations -> RESEARCH
		String research_industries_heading = "//div[@class='et_pb_column et_pb_column_3_5 et_pb_column_14  et_pb_css_mix_blend_mode_passthrough et-last-child']//h2[@class='et_pb_module_header']";
		String fname_research_industries = "et_pb_signup_firstname";
		String lname_research_industries = "et_pb_signup_lastname";
		String email_research_industries = "et_pb_signup_email";
		String subscribe_button_research_industries = "//div[@class='et_pb_column et_pb_column_3_5 et_pb_column_14  et_pb_css_mix_blend_mode_passthrough et-last-child']//a[@class='et_pb_newsletter_button et_pb_button']";
		
		// Need to Know More? section of the Industries page
		String needtoknowmore_section_industries = "//div[@class='et_pb_section et_pb_section_7 et_pb_with_background et_section_regular']//h2[text()='Need to Know More?']";
		
		// Live Demo and Price Check PATHS - BUTTONS
		String livedemo_industries = "//div[@class='et_pb_row et_pb_row_11 et_pb_gutters2']//a[@class='et_pb_button et_pb_button_1 et_pb_bg_layout_dark']";
		String price_check_industries = "//div[@class='et_pb_row et_pb_row_11 et_pb_gutters2']//a[@class='et_pb_button et_pb_button_2 et_pb_bg_layout_dark']";
		
		// Industries > Live Demo > PATHS/LOCATORS
		String fname_demo_industries = "input_24_1";
	    String lname_demo_industries = "input_24_10";
	    String company_demo_industries = "input_24_11";
	    String phone_demo_industries = "input_24_4";
	    String email_demo_industries = "input_24_14";
	    String captcha_demo_industries = "input_24_18";
	    String select_captcha_demo_industries = "Daisy";
	    String submit_button_demo_industries = "gform_submit_button_24";
	    String close_button_demo_industries = "//div//a[@class='overlay-close overlay-customclose-btn-19980']";
	    
	    //Price 
	    String pricing_page_heading = "//div[@id='page-container']//h1[text()='Choose the plan that works for you']";
	    
	    // Scrollers
	    String scroll_1_industries = "//div[@class='et_pb_column et_pb_column_4_4 et_pb_column_9  et_pb_css_mix_blend_mode_passthrough et-last-child']";
	    String scroll_2_industries = "//div[@class='et_pb_column et_pb_column_4_4 et_pb_column_11  et_pb_css_mix_blend_mode_passthrough et-last-child']";
	    
	    
		//time for sleep
	    int time = 2000;
	    
	    //Booleans
	    boolean test0,test1,test2,test3,test4,test5,test6,test7,
	    heading1,heading2,heading3,heading4,heading5,heading6,heading7,heading8,
	    livedemo_button;
	    
	
	    // builds the driver for automation
	    ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
	            .withRemoteAddress(new URL("http://localhost:8585"))
	            .withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);
	    
	    driver.manage().window().maximize();
	    
	    //adding implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // Clearing caches
	    driver.get("chrome://settings/clearBrowserData");
	    driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	    
	    // takes to the website provided
	    driver.navigate().to("https://www.celayix.com/");
	    
	    // Adds cookies
	    driver.manage().addCookie(new Cookie("key", "value"));
	    
	    //declaring wait class
        WebDriverWait w = new WebDriverWait(driver,10);
        
	    
	
	    // building the Action class so that hovering over an element is possible
	    Actions actionProvider = new Actions(driver);
	    
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    //Thread.sleep(time);
	    
	    test0 = driver.findElement(By.id(all_industries)).isDisplayed();
	    if(test0)
	    	System.out.println("All Industries is Present");
	    else
	    	System.out.println("ABSENT - All Industries");
	    
	    test1 = driver.findElement(By.id(security_header)).isDisplayed();
	    if(test1)
	    	System.out.println("Security is Present");
	    else
	    	System.out.println("ABSENT - Security");
	    
	    test2 = driver.findElement(By.id(home_healthcare_header)).isDisplayed();
	    if(test2)
	    	System.out.println("Healthcare is Present");
	    else
	    	System.out.println("ABSENT - Healthcare");
	    
	    test3 = driver.findElement(By.id(longterm_healthcare_header)).isDisplayed();
	    if(test3)
	    	System.out.println("Longterm Healthcare is Present");
	    else
	    	System.out.println("ABSENT - Longterm Healthcare");
	    
	    test4 = driver.findElement(By.id(hospitality_header)).isDisplayed();
	    if(test4)
	    	System.out.println("Hospitality is Present");
	    else
	    	System.out.println("ABSENT - Hospitality");
	    
	    test5 = driver.findElement(By.id(events_venues_header)).isDisplayed();
	    if(test5)
	    	System.out.println("Evenst and Venues is Present");
	    else
	    	System.out.println("ABSENT - Events & Venues");
	    
	    test6 = driver.findElement(By.id(manufacturing_header)).isDisplayed();
	    if(test6)
	    	System.out.println("Manufacturing is Present");
	    else
	    	System.out.println("ABSENT - Manufacturing");
	    
	    test7 = driver.findElement(By.id(libraries_header)).isDisplayed();
	    if(test7)
	    	System.out.println("Libraries is Present");
	    else
	    	System.out.println("ABSENT - Libararies");
	    
	    
	    
	    //INDUSTRIES SUBSECTIONS > LINKS > PAGES 
	    
	    // clicking to check "All Industries" is present
	    driver.findElement(By.id(all_industries)).click();
	    heading1 = driver.findElement(By.xpath(all_industries_page_heading)).isDisplayed();
	    if(heading1)
	    	System.out.println(heading1 + " All Industires Page");
	    else
	    	System.out.println(heading1 + " All Industires Page");
	    
	    w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(accept_cookies)))).click();
	    
	    // Clicking to check "Security" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(security_header)).click();
	    heading2 = driver.findElement(By.xpath(security_page_heading)).isDisplayed();
	    if(heading2)
	    	System.out.println(heading2 + " Security Page");
	    else
	    	System.out.println(heading2+ " Security Page");
	    
	    // Clicking to check "Home Healthcare" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(home_healthcare_header)).click();
	    heading3 = driver.findElement(By.xpath(home_healthcare_page_heading)).isDisplayed();
	    if(heading3)
	    	System.out.println(heading3 + " Home Health Care Page");
	    else
	    	System.out.println(heading3 + " Home Healthcare Page");
	    
	    // Clicking to check "Longterm Home Healthcare" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(longterm_healthcare_header)).click();
	    heading4 = driver.findElement(By.xpath(longterm_healthcare_page_heading)).isDisplayed();
	    if(heading4)
	    	System.out.println(heading4 + " Longterm Health Care Page");
	    else
	    	System.out.println(heading4 + " Longterm Healthcare Page");

	    // Clicking to check "Hospitality" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(hospitality_header)).click();
	    heading5 = driver.findElement(By.xpath(hospitality_page_heading)).isDisplayed();
	    if(heading5)
	    	System.out.println(heading5 + " Hospitality Page");
	    else
	    	System.out.println(heading5 + " Hospitality Page");

	    // Clicking to check "Events & Venues" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(events_venues_header)).click();
	    heading6 = driver.findElement(By.xpath(events_venues_page_heading)).isDisplayed();
	    if(heading6)
	    	System.out.println(heading6 + " Events & Venues Pages");
	    else
	    	System.out.println(heading6+" Events & Venues Page");

	    // Clicking to check "Manufacturing" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(manufacturing_header)).click();
	    heading7 = driver.findElement(By.xpath(manufacturing_page_heading)).isDisplayed();
	    if(heading7)
	    	System.out.println(heading7 + " Manufacturing Care");
	    else
	    	System.out.println(heading7 +" Manufacturing Page");

	    // Clicking to check "Libraries" is present
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(libraries_header)).click();
	    heading8 = driver.findElement(By.xpath(libraries_page_heading)).isDisplayed();
	    if(heading8)
	    	System.out.println(heading8 + " Libraries Care");
	    else
	    	System.out.println(heading8 +" Libraries Page");


	    
	    // Clicks "Industries" on the header to test the page
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
	    
	    // CLicks the SECURITY link and comes back to industry page hovering over the industry heading and clicking it
	    driver.findElement(By.xpath(security_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();

	    // Clicks the HOME HEALTHCARE and comes back to industry
	    driver.findElement(By.xpath(healthcare_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
		 // CLicks the LONG TERM CARE link and comes back to industry page hovering over the industry heading and clicking it
	    driver.findElement(By.xpath(longterm_healthcare_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
	    // CLicks the HOPSITALITY link and comes back to industry page hovering over the industry heading and clicking it
	    driver.findElement(By.xpath(hospitality_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
	    // CLicks the EVENTS & VENUES link and comes back to industry page hovering over the industry heading and clicking it
	    driver.findElement(By.xpath(events_venues_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
	    // CLicks the MANUFACTURING link and comes back to industry page hovering over the industry heading and clicking it
	    driver.findElement(By.xpath(manufacturing_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
	    // CLicks the Libraries link and comes back to industry page hovering over the industry heading and clicking it
	    driver.findElement(By.xpath(libraries_industries_page)).click();
	    actionProvider.moveToElement(driver.findElement(By.id(industries_path))).build().perform();
	    driver.findElement(By.id(industries_path)).click();
	    
	    //Scrolling CHECKING
	    driver.findElement(By.xpath(scroll_1_industries)).isDisplayed();
	    //Thread.sleep(time);
	    driver.findElement(By.xpath(scroll_2_industries)).isDisplayed();
	    //Thread.sleep(time);
	    
	    // Moves to the "Celayix Research Insights" and then writes into the fields
	    actionProvider.moveToElement(driver.findElement(By.xpath(research_industries_heading))).build().perform();
	    driver.findElement(By.id(fname_research_industries)).sendKeys("Lebron");
	    driver.findElement(By.id(lname_research_industries)).sendKeys("James");
	    driver.findElement(By.id(email_research_industries)).sendKeys("l.james@nba.com");
	    driver.findElement(By.xpath(subscribe_button_research_industries)).isDisplayed();
	    //Thread.sleep(time);
	   
	    driver.findElement(By.xpath(needtoknowmore_section_industries));
	    driver.findElement(By.xpath(livedemo_industries)).click();
	    System.out.println("Clicks Live DEMO");
	    
	    // Fills out the LIVE DEMO FORM
	    driver.findElement(By.id(fname_demo_industries)).sendKeys("Lebron");
	    driver.findElement(By.id(lname_demo_industries)).sendKeys("James");
	    driver.findElement(By.id(company_demo_industries)).sendKeys("NBA");
	    driver.findElement(By.id(phone_demo_industries)).sendKeys("1112223456");
	    driver.findElement(By.id(email_demo_industries)).sendKeys("ljames@nba.com");
	    driver.findElement(By.id(captcha_demo_industries)).click();
	    
	    // Creating the dropdown class to select captcha
	    Select dropdown = new Select(driver.findElement(By.id(captcha_demo_industries)));
	    
	    // Selects the captcha
        dropdown.selectByValue(select_captcha_demo_industries);
        
        System.out.println("Selected Captcha");
        
        // Submit button is present
        livedemo_button = driver.findElement(By.id(submit_button_demo_industries)).isDisplayed();
        
        if(livedemo_button)
        	System.out.println(livedemo_button + " Submit button -> LIVE DEMO");
        else
        	System.out.println(livedemo_button + " Submit button -> LIVE DEMO");
        
        
        // Closes the form
        actionProvider.moveToElement(driver.findElement(By.xpath(close_button_demo_industries))).build().perform();
        driver.findElement(By.xpath(close_button_demo_industries)).click();

	    // Clicks the CHECK PRICE Button
	    driver.findElement(By.xpath(price_check_industries)).click();
	    //Thread.sleep(time);
	    
	    boolean test = driver.findElement(By.xpath(pricing_page_heading)).isDisplayed();
	    
	    if(test)
	    	System.out.println("Test Passed");
	    else
	    	System.out.println("Test Failed");

	    
	    
	    // driver quits the test automation
	    driver.quit();
	    
		
	}// end of main

}//end of class
