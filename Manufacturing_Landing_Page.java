package Headers;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Manufacturing_Landing_Page {
	
	public static void main (final String[] args) throws Exception
	{
		// Cookies accept/learn more options
		String accept_cookies = "cookie_action_close_header";

		// links,xpaths,ids LOCATORS of all the elements needed
		String industries_path = "mega-menu-item-1834";
		String manufacturing_header = "mega-menu-item-28805";


		//Subsections of the  Page
		String scheduling = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_0 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String time_attendance = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_1 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String billing_payroll = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_2 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String mobile = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_3 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String ai = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_4 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String rules_engine = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_5 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String integration = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_7 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";

		//Subsection Links
		String autofill_subsection = "//div[@id='benefits']//a[text()='AutoFill']";
		String find_replacement_subsection = "//div[@id='benefits']//a[text()='Find Replacement']";
		String self_scheduling_subsection = "//div[@id='benefits']//a[text()='Self-Scheduling']";
		String shift_bidding_subsection = "//div[@id='benefits']//a[text()='Shift-Bidding']";


		// locators of the form 
		String active_schedule_staff = "Number-1605054893235-clone185-clone695";
		String scheduled_location = "Number-1605056185005-clone185-clone695";
		String staff_turnover_rate = "Number-1605120289037-clone185-clone695";
		String average_weekly_hours_worked = "Number-1605057833179-clone185-clone695";
		String average_hourly_wage_staff = "Number-1605059528193-clone185-clone695";
		String schedule_managers = "Number-1605059672709-clone185-clone695";
		String average_scheduler_wage = "Number-1605056781293-clone185-clone695";
		String time_managing_schedules = "Number-1605057062761-clone185-clone695";
		String unbillable_OT = "Number-1613595868466-clone695";


		//links within the form
		String absenteeism_link_1 = "//div[@id='absenteeism']//a[text()='absenteeism can easily cost over $2,500 per employee per year']";
		String find_replacement = "//div[@id='absenteeism']//a[text()=' Find Replacement']";
		String absenteeism_ai = "//div[@id='absenteeism']//a[text()='Celayix AI']";
		String self_scheduling = "//div[@id='mobile']//a[text()='self-scheduling']";
		String shift_bidding = "//div[@id='mobile']//a[text()='shift-bidding']";
		String time_attendance_link = "//div[@id='time-attendance']//a[text()='Time & Attendance']";
		String time_attendance_GPS = "//div[@id='time-attendance']//a[text()=' GPS']";
		String ai_CelayixAI_1 = "//div[@id='artificial-intelligence']//a[text()='Celayix AI']";
		String ai_CelayixAI_2 = "//div[@id='artificial-intelligence']//p[3]//a[text()='Celayix AI']";
		String overtime = "//div[@id='overtime']//a[text()='overtime']";
		String overtime_2 = "//div[@id='overtime']//p[2]//a[text()='overtime']";
		String payroll_time_attendance = "//div[@id='payroll-billing']//a[text()='Time & attendance']";
		String payroll_time_attendance_2 = "//div[@id='payroll-billing']//a[text()='time & attendance']";
		String employee_shift_scheduling_integration = "//div[@id='time-attendance']//a[text()='employee shift-scheduling']";
		String time_attendance_integration = "//div[@id='time-attendance']//a[text()='time & attendance']";

		String read_more_success = "//div[@id='main-content']//a[text()='Read more success stories →']";
		String pricing = "//div[@id='savingscalculator']//a[1]";
		String cost_benefit_analyzer = "//div[@id='savingscalculator']//a[2]";

		//BUTTONS
		String research_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_1 et_pb_bg_layout_dark']";
		String pricing_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_2 et_pb_bg_layout_dark']";




		//page headings
		String autofill_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Autofill: What Is It And What Are The Benefits?']";

		String absenteeism_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='The True Causes & Costs of Absenteeism in the Workplace']";
		String find_replacement_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Celayix Find Replacement – Find Shift Replacements Instantly!']";
		String self_scheduling_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='What is Self Scheduling and its Benefits?']";
		String shift_bidding_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Shift Bidding in Scheduling, and its Benefits']";
		String time_attendance_pageheading = "//div[@id='main-content']//h1[text()='Feature Focus: Celayix Time & Attendance Software']";
		String GPS_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Using Geofencing to Manage Your Workforce']";
		String AI_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Artificial Intelligence – What is it and How Do We use it?']";
		String overtime_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='The Impact of Overtime and How to Reduce it']";
		String employee_shift_scheduling_pageheading = "//div[@id='main-content']//h1[text()='Feature Focus: Celayix Employee Scheduling Software']";
		String customer_success_pageheading = "//div[@id='#success']//h2[text()='Customer Success Stories']";
		String cost_benefit_analyzer_pageheading = "//div[@id='main-content']//h1[text()='The Celayix Cost Benefit Analyzer']";
		String pricing_pageheading = "//div[@id='main-content']//h1[text()='Choose the plan that works for you']";




		//Time for driver sleep
		int time = 3000;

		boolean heading;

		//Building the driver class with TestProject Dev Token
		ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions()).withRemoteAddress(new URL("http://localhost:8585")).withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);


		//MAximizes the window
		driver.manage().window().maximize();

		//Applying implicitly WAIT
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Clears the cache before running the test
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

		//Clicks the Manufacturing from the Industries Header
		driver.findElement(By.id(manufacturing_header)).click();






		//Finding and clicking the subsections of the Manufacturing landing page
		driver.findElement(By.xpath(scheduling)).click();



		/*
		//wait until cookies show up and accepts
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(accept_cookies)))).click();
		System.out.println("Accepts Cookies");
		 */



		driver.findElement(By.xpath(time_attendance)).click();
		driver.findElement(By.xpath(billing_payroll)).click();
		driver.findElement(By.xpath(mobile)).click();
		driver.findElement(By.xpath(ai)).click();
		driver.findElement(By.xpath(rules_engine)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(integration))).click();
		Thread.sleep(time);

		System.out.println("CLicked all the subsections");


		/*
		 * Here Screenshots are taken of the divs where the videos are placed but doesnot compare.
		 * Therefore commenting out, can be fixed later when a solution comes up
		 
		//SCREENSHOT

		//declaring webelement for the first video on the  page
		WebElement video1_ = wait.until(ExpectedConditions.elementToBeClickable(By.id("scheduling")));
		System.out.println("Declared WebElement");


		File screenshot1_video1_ = video1_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video1_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video1.png"));
		System.out.println("SS 1 taken");


		WebElement video2_ = driver.findElement(By.id("absenteeism"));

		File screenshot1_video2_ = video2_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video2_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video2.png"));

		System.out.println("SS 2 taken");

		WebElement video3_ = driver.findElement(By.id("mobile"));

		File screenshot1_video3_ = video3_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video3_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video3.png"));

		System.out.println("SS 3 taken");

		WebElement video4_ = driver.findElement(By.id("overtime"));

		File screenshot1_video4_ = video4_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video4_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video4.png"));

		System.out.println("SS 4 taken");


		WebElement video5_ = driver.findElement(By.id("artificial-intelligence"));

		File screenshot1_video5_ = video5_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video5_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video5.png"));

		System.out.println("SS 5 taken");

		WebElement video6_ = driver.findElement(By.id("rules-engine"));

		File screenshot1_video6_ = video6_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video6_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video6.png"));

		System.out.println("SS 6 taken");

		WebElement video7_ = driver.findElement(By.id("time-attendance"));

		File screenshot1_video7_ = video7_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video7_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video7.png"));

		System.out.println("SS 7 taken");


		WebElement video8_ = driver.findElement(By.id("payroll-billing"));

		File screenshot1_video8_ = video8_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video8_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video8.png"));

		System.out.println("SS 8 taken");

		WebElement video9_ = driver.findElement(By.id("integration"));

		File screenshot1_video9_ = video9_.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video9_, new File("C:\\Users\\m.shawon\\Celayix Website\\Screenshots\\Hospitality\\video9.png"));

		System.out.println("SS 9 taken");
		 */
		
		
		
		// writing to the form
		driver.findElement(By.id(active_schedule_staff)).sendKeys("1234");
		driver.findElement(By.id(scheduled_location)).sendKeys("234");
		driver.findElement(By.id(staff_turnover_rate)).sendKeys("222");
		driver.findElement(By.id(average_weekly_hours_worked)).sendKeys("45");
		driver.findElement(By.id(average_hourly_wage_staff)).sendKeys("25.5");
		driver.findElement(By.id(schedule_managers)).sendKeys("5");
		driver.findElement(By.id(average_scheduler_wage)).sendKeys("17.777");
		driver.findElement(By.id(unbillable_OT)).sendKeys("15");
		driver.findElement(By.id(time_managing_schedules)).sendKeys("1234");





		//SUBlink0
		hover.moveToElement(driver.findElement(By.xpath(autofill_subsection))).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(autofill_subsection))).click();
		heading = driver.findElement(By.xpath(autofill_pageheading)).isDisplayed();

		if(heading)
			System.out.println("SUBLink 0 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//SUBLink1
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(find_replacement_subsection))).click();
		heading = driver.findElement(By.xpath(find_replacement_pageheading)).isDisplayed();

		if(heading)
			System.out.println("SUBLink 1 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//SUBLink2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(self_scheduling_subsection))).click();
		heading = driver.findElement(By.xpath(self_scheduling_pageheading)).isDisplayed();

		if(heading)
			System.out.println("SUBLink 2 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//SUBLink3
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shift_bidding_subsection))).click();
		heading = driver.findElement(By.xpath(shift_bidding_pageheading)).isDisplayed();

		if(heading)
			System.out.println("SUBLink 3 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//Visiting links within the PAGE

		//link1
		driver.findElement(By.xpath(absenteeism_link_1)).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(absenteeism_link))).click();
		heading = driver.findElement(By.xpath(absenteeism_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 1 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(find_replacement))).click();
		heading = driver.findElement(By.xpath(find_replacement_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 2 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");

		//link3
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(absenteeism_ai))).click();
		heading = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 3 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");

		
		
		//link4
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(self_scheduling))).click();
		heading = driver.findElement(By.xpath(self_scheduling_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 4 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link5
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(shift_bidding))).click();
		heading = driver.findElement(By.xpath(shift_bidding_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 5 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link6
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(overtime))).click();
		heading = driver.findElement(By.xpath(overtime_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 6-1 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(overtime_2))).click();
		heading = driver.findElement(By.xpath(overtime_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 6-2 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//link7
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ai_CelayixAI_1))).click();
		heading = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 7 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link8
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ai_CelayixAI_2))).click();
		heading = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 8 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//link9
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(time_attendance_link))).click();
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 9 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link10
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(time_attendance_GPS))).click();
		heading = driver.findElement(By.xpath(GPS_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 10 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//link11
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll_time_attendance))).click();
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 11 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link12
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(payroll_time_attendance_2))).click();
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 12 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link13
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(employee_shift_scheduling_integration))).click();
		heading = driver.findElement(By.xpath(employee_shift_scheduling_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 13 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//link14
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(time_attendance_integration))).click();
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 14 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		
		//link15
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(read_more_success))).click();
		heading = driver.findElement(By.xpath(customer_success_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 15 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");


		//link16
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pricing))).click();
		heading = driver.findElement(By.xpath(pricing_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 16 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//link17
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cost_benefit_analyzer))).click();
		heading = driver.findElement(By.xpath(cost_benefit_analyzer_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 17 is PRESENT");
		//returns back to the Manufacturing Landing page
		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");



		//buttons on the bottom of the page
		//research
		driver.findElement(By.xpath(research_button)).click();
		boolean research_heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Celayix Research']")).isDisplayed();

		if(research_heading)
			System.out.println("Research Link is PRESENT");


		driver.get("https://www.celayix.com/industries/manufacturing-shift-scheduling-software/");

		//pricing
		driver.findElement(By.xpath(pricing_button)).click();

		boolean final_test = driver.findElement(By.xpath(pricing_pageheading)).isDisplayed();

		if(final_test)
			System.out.println("Test Passed");

		else
			System.out.println("Test Failed");





		//Quitting the driver to finish the test
		driver.quit();

		System.out.println("Test Clear So far");


	}//end of main()


}
