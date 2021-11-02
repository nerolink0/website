package Headers;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Home_HealthCare_LandingPage {

	public static void main (final String[] args) throws Exception
	{
		// Cookies accept/learn more options
		String accept_cookies = "cookie_action_close_header";

		// links,xpaths,ids LOCATORS of all the elements needed
		String industries_path = "mega-menu-item-1834";
		String home_healthcare_header = "mega-menu-item-28801";
		String _page_heading = "//div[@id='et-boc']//h1[text()='Automated  Guard Scheduling and']";

		//Subsections of the  Page
		String scheduling_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_0 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String time_attendance_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_1 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String billing_payroll_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_2 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String mobile_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_3 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String ai_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_4 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String rules_engine_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_5 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String integration_ = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_7 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";

		//
		String active_schedule_staff_ = "Number-1605054893235-clone185-clone695";
		String scheduled_location_ = "Number-1605056185005-clone185-clone695";
		String staff_turnover_rate_ = "Number-1605120289037-clone185-clone695";
		String average_weekly_hours_worked_ = "Number-1605057833179-clone185-clone695";
		String average_hourly_wage_staff_ = "Number-1605059528193-clone185-clone695";
		String schedule_managers_ = "Number-1605059672709-clone185-clone695";
		String average_scheduler_wage_ = "Number-1605056781293-clone185-clone695";
		String time_managing_schedules_ = "Number-1605057062761-clone185-clone695";
		String unbillable_OT_ = "Number-1613595868466-clone695";

		//Buttons
		String key_features = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_dark']";
		String research_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_2 et_pb_bg_layout_dark']";
		String pricing_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_3 et_pb_bg_layout_dark']";

		//links within the form
		String absenteeism_link = "//div[@id='absenteeism']//a[text()='Absenteeism']";
		String find_available_replacement = "//div[@id='absenteeism']//a[text()='find available and qualified replacements']";
		String self_scheduling = "//div[@id='mobile']//a[text()='self-scheduling']";
		String shift_bidding = "//div[@id='mobile']//a[text()='shift-bidding']";
		String time_attendance_link = "//div[@id='time-attendance']//a[text()='time & attendance']";
		String time_attendance_GPS = "//div[@id='time-attendance']//a[text()='GPS']";
		String ai_CelayixAI_1 = "//div[@id='artificial-intelligence']//a[text()='Celayix AI']";
		String overtime = "//div[@id='overtime']//a[text()='overtime']";
		String payroll_time_attendance = "//div[@id='payroll-billing']//a[text()='Time & attendance']";
		String read_more_success = "//div[@id='main-content']//a[text()='Read more success stories →']";
		String pricing = "//div[@id='savingscalculator']//a[1]";
		String cost_benefit_analyzer = "//div[@id='savingscalculator']//a[2]";


		//page headings
		String absenteeism_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='The True Causes & Costs of Absenteeism in the Workplace']";
		String find_replacement_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Celayix Find Replacement – Find Shift Replacements Instantly!']";
		String self_scheduling_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='What is Self Scheduling and its Benefits?']";
		String shift_bidding_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Shift Bidding in Scheduling, and its Benefits']";
		String time_attendance_pageheading = "//div[@id='main-content']//h1[text()='Feature Focus: Celayix Time & Attendance Software']";
		String GPS_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Using Geofencing to Manage Your Workforce']";
		String AI_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Artificial Intelligence – What is it and How Do We use it?']";
		String overtime_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='The Impact of Overtime and How to Reduce it']";
		String customer_success_pageheading = "//div[@id='#success']//h2[text()='Customer Success Stories']";
		String cost_benefit_analyzer_pageheading = "//div[@id='main-content']//h1[text()='The Celayix Cost Benefit Analyzer']";
		String pricing_pageheading = "//div[@id='main-content']//h1[text()='Choose the plan that works for you']";


		//Time for driver sleep
		int time = 3000;

		boolean heading;

		ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions()).withRemoteAddress(new URL("http://localhost:8585")).withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);

		//Dimension dimension = new Dimension(2048, 1536);

		//Changes resolution of the window
		//driver.manage().window().setSize(dimension);

		//MAximizes the window
		driver.manage().window().maximize();



		//Applying implicitly WAIT
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);

		//Navigates to the Celayix Website
		driver.get("https://www.celayix.com");



		//Creating the WAIT class
		WebDriverWait wait = new WebDriverWait(driver,10);

		//Building the Action Class
		Actions hover = new Actions(driver);

		//Hovers to Industries Header to interact with the page
		hover.moveToElement(driver.findElement(By.id(industries_path))).build().perform();

		Thread.sleep(time);
		System.out.println("Hovers Industries");

		driver.findElement(By.id(home_healthcare_header)).click();
		//hover.moveToElement(driver.findElement(By.xpath(_page_heading))).build().perform();

		//wait until cookies show up and accepts
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(accept_cookies)))).click();
		//System.out.println("Accepts Cookies");

		//MOves to the "Everything You Need to Know" part of the  page
		driver.findElement(By.xpath(key_features)).click();


		driver.findElement(By.xpath(scheduling_)).click();
		Thread.sleep(time);

		driver.findElement(By.xpath(time_attendance_)).click();
		Thread.sleep(time);

		driver.findElement(By.xpath(billing_payroll_)).click();
		Thread.sleep(time);

		System.out.println("CLicked billig and payroll by CLASS");

		driver.findElement(By.xpath(mobile_)).click();
		driver.findElement(By.xpath(ai_)).click();
		driver.findElement(By.xpath(rules_engine_)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(integration_))).click();





		//hover.moveToElement(driver.findElement(By.xpath("//div[@id='page-container']//h2[text()='Automated Guard Shift Scheduling']"))).build().perform();
		Thread.sleep(time);

		System.out.println("Before finding the path of video 1");
		boolean test = driver.findElement(By.id("scheduling")).isDisplayed();
		//boolean test = 		driver.findElement(By.xpath("//div[@class='et_pb_column et_pb_column_3_5 et_pb_column_17  et_pb_css_mix_blend_mode_passthrough et-last-child']")).isDisplayed();

		System.out.println(test);

		//driver.findElement(By.xpath("//div[@class='et_pb_column et_pb_column_3_5 et_pb_column_17  et_pb_css_mix_blend_mode_passthrough et-last-child']")).click();
		//System.out.println("Clicked Video 1");


		//declaring webelement for the first video on the  page
		WebElement video1_ = driver.findElement(By.id("scheduling"));

		System.out.println("Declared WebElement");

		//hover.moveToElement(video1_);
		//System.out.println("Hovered to video 1");

		//SCREENSHOT
		File screenshot1_video1_ = video1_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video1_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video1_home_healthcare.png"));
		System.out.println("SS 1 taken");

		//File original_video1 = File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video1_home_healthcare.png");
		//ImageComparison imageComparison = new ImageComparison(20,20,0.15);

		//hover.moveToElement(driver.findElement(By.xpath("//div[@id='page-container']//h2[text()='Manage Sick Calls, No-Shows, and Last-Minute Schedule Changes']"))).build().perform();

		WebElement video2_ = driver.findElement(By.id("absenteeism"));

		File screenshot1_video2_ = video2_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video2_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video2_home_healthcare.png"));

		System.out.println("SS 2 taken");

		WebElement video3_ = driver.findElement(By.id("mobile"));

		File screenshot1_video3_ = video3_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video3_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video3.png"));

		System.out.println("SS 3 taken");

		WebElement video4_ = driver.findElement(By.id("overtime"));

		File screenshot1_video4_ = video4_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video4_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video4.png"));

		System.out.println("SS 4 taken");


		WebElement video5_ = driver.findElement(By.id("artificial-intelligence"));

		File screenshot1_video5_ = video5_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video5_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video5.png"));

		System.out.println("SS 5 taken");

		WebElement video6_ = driver.findElement(By.id("rules-engine"));

		File screenshot1_video6_ = video6_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video6_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video6.png"));

		System.out.println("SS 6 taken");

		WebElement video7_ = driver.findElement(By.id("time-attendance"));

		File screenshot1_video7_ = video7_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video7_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video7.png"));

		System.out.println("SS 7 taken");


		WebElement video8_ = driver.findElement(By.id("payroll-billing"));

		File screenshot1_video8_ = video8_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video8_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video8.png"));

		System.out.println("SS 8 taken");

		WebElement video9_ = driver.findElement(By.id("integration"));

		File screenshot1_video9_ = video9_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video9_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Home_Healthcare\\video9.png"));

		System.out.println("SS 9 taken");


		driver.findElement(By.id(active_schedule_staff_)).sendKeys("1234");
		driver.findElement(By.id(scheduled_location_)).sendKeys("234");
		driver.findElement(By.id(staff_turnover_rate_)).sendKeys("222");
		driver.findElement(By.id(average_weekly_hours_worked_)).sendKeys("45");
		driver.findElement(By.id(average_hourly_wage_staff_)).sendKeys("25.5");
		driver.findElement(By.id(schedule_managers_)).sendKeys("5");
		driver.findElement(By.id(average_scheduler_wage_)).sendKeys("17.777");
		driver.findElement(By.id(unbillable_OT_)).sendKeys("15");
		driver.findElement(By.id(time_managing_schedules_)).sendKeys("1234");





		//Visiting links within the PAGE
		//link1
		hover.moveToElement(driver.findElement(By.xpath(absenteeism_link))).build().perform();
		driver.findElement(By.xpath(absenteeism_link)).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(absenteeism_link))).click();
		heading = driver.findElement(By.xpath(absenteeism_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 1 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(find_available_replacement))).click();
		heading = driver.findElement(By.xpath(find_replacement_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 2 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link3
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(self_scheduling))).click();
		heading = driver.findElement(By.xpath(self_scheduling_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 3 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link4
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shift_bidding))).click();
		heading = driver.findElement(By.xpath(shift_bidding_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 4 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link5
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(time_attendance_link))).click();
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 5 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link6
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(time_attendance_GPS))).click();
		heading = driver.findElement(By.xpath(GPS_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 6 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link7
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ai_CelayixAI_1))).click();
		heading = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 7 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link8
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(overtime))).click();
		heading = driver.findElement(By.xpath(overtime_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 8 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");



		//link9
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll_time_attendance))).click();
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 9 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link10
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(read_more_success))).click();
		heading = driver.findElement(By.xpath(customer_success_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 10 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");


		//link11
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pricing))).click();
		heading = driver.findElement(By.xpath(pricing_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 11 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");



		//link12
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cost_benefit_analyzer))).click();
		heading = driver.findElement(By.xpath(cost_benefit_analyzer_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 12 is PRESENT");
		//returns back to the Home Healthcare page
		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");






		driver.findElement(By.xpath(research_button)).click();
		boolean research_heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Celayix Research']")).isDisplayed();

		if(research_heading)
			System.out.println("Research Link is PRESENT");

		driver.get("https://www.celayix.com/industries/home-health-care-staff-scheduling-software/");

		driver.findElement(By.xpath(pricing_button)).click();

		boolean final_test = driver.findElement(By.xpath(pricing_pageheading)).isDisplayed();

		if(final_test)
			System.out.println("Test Passed");

		else
			System.out.println("Test Failed");


		//Quits the test
		driver.quit();



	}//end of main()


}//end of class
