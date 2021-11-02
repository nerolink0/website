package Headers;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Features_Celayix_Scheduler_Page {
	
	public static void main (final String[] args) throws Exception
	{

		// Cookies accept/learn more options
		String accept_cookies = "cookie_action_close_header";

		// links,xpaths,ids LOCATORS of all the elements needed
		String features_path = "mega-menu-item-28778";

		//Time & Attendance path
		String features_celayix_scheduler_header = "mega-menu-item-28156";

		//Links within the form
		String read_more_success = "//div[@id='main-content']//a[text()='Read more success stories →']";
		String pricing = "//div[@id='savingscalculator']//a[1]";
		String cost_benefit_analyzer = "//div[@id='savingscalculator']//a[2]";


		//Page Headings
		String scheduler_pageheading = "//div[@id='main-content']//h1[text()='Feature Focus: Celayix Employee Scheduling Software']";

		String tourButton1_pageheading = "//div[@id='main-content']//h1[text()='Celayix Scheduler Tour']";

		String customer_success_pageheading = "//div[@id='#success']//h2[text()='Customer Success Stories']";
		String cost_benefit_analyzer_pageheading = "//div[@id='main-content']//h1[text()='The Celayix Cost Benefit Analyzer']";
		String pricing_pageheading = "//div[@id='main-content']//h1[text()='Choose the plan that works for you']";

		String time_attendance_pageheading = "//div[@id='main-content']//h1[text()='Feature Focus: Celayix Time & Attendance Software']";


		//Buttons within the page
		String tourButton1 = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_1 et_pb_bg_layout_dark']";
		String mobiletourButton = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_2 et_pb_bg_layout_dark']";
		String research_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_4 et_pb_bg_layout_dark']";
		String pricing_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_5 et_pb_bg_layout_dark']";

		String carousal_next_button = "//button[@class='slick-next slick-arrow']";
		String carousal_previous_button = "//button[@class='slick-prev slick-arrow']";


		//Subsections
		//Subsections of the  Page
		String scheduling = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_0 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String time_attendance = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_2 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String billing_payroll = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_5 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String mobile = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_1 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String ai = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_3 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String rules_engine = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_4 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String integration = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_6 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String reporting = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_7 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";


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

		
		//Time for driver sleep
		int time = 3000;

		//boolean for checking the heading of the page is present or not
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

		//Hovers to Features Header to interact with the page
		hover.moveToElement(driver.findElement(By.id(features_path))).build().perform();

		//wait until cookies show up and accepts
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(accept_cookies)))).click();
		System.out.println("Accepts Cookies");
		Thread.sleep(time);
		//Hovers to Features
		hover.moveToElement(driver.findElement(By.id(features_path))).build().perform();
		
		Thread.sleep(time);
		System.out.println("Hovers Industries");

		//Clicks Celayix Scheduler 
		driver.findElement(By.id(features_celayix_scheduler_header)).click();

		heading = driver.findElement(By.xpath(scheduler_pageheading)).isDisplayed();
		if(heading)
			System.out.println("Celaix Scheduler is Correctly Loaded");


		driver.findElement(By.xpath(tourButton1)).click();
		heading = driver.findElement(By.xpath(tourButton1_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Tour page loaded CORRECTLY");
		else
			System.out.println("Tour page loaded INcorrectly");




		hover.moveToElement(driver.findElement(By.xpath(carousal_next_button))).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(carousal_next_button))).click();
		heading = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='slick-slide01']/div/div/div[2]/h2/a"))).isDisplayed();
		if(heading)
			System.out.println("Caraousal changed CORRECTLY --1");
		else
			System.out.println("Carousal changed INcorrectly--1");


		hover.moveToElement(driver.findElement(By.xpath(carousal_next_button))).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(carousal_next_button))).click();
		heading = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id='slick-slide02']/div/div/div[2]/h2/a")))).isDisplayed();
		if(heading)
			System.out.println("Caraousal changed CORRECTLY --2");
		else
			System.out.println("Carousal changed INcorrectly--2");


		//returns to Time & Attendance page
		driver.get("https://www.celayix.com/employee-scheduling-software/");

		
		//Checking the subsections
		driver.findElement(By.xpath(scheduling)).click();
		String scheduler_heading = "//div[@id='scheduler']//h2[text()='Employee Scheduling Software']";
		heading = driver.findElement(By.xpath(scheduler_heading)).isDisplayed();
		if(heading)
			System.out.println("scheduler_heading valid");
		else
			System.out.println("scheduler_heading INvalid");
		
		
		driver.findElement(By.xpath(mobile)).click();
		String mobile_heading = "//div[@id='mobile']//h2[text()='Celayix Mobile App']";
		heading = driver.findElement(By.xpath(mobile_heading)).isDisplayed();
		if(heading)
			System.out.println("mobile_heading valid");
		else
			System.out.println("mobile_heading INvalid");
		
		
		driver.findElement(By.xpath(time_attendance)).click();
		//String time_attendance_heading = "//div[@id='mobile']//h2[text()='Celayix Mobile Scheduling App']";
		heading = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();
		if(heading)
			System.out.println("time_attendance_heading  valid");
		else
			System.out.println("time_attendance_heading  INvalid");
		//return back to the scheding page
		driver.get("https://www.celayix.com/employee-scheduling-software/");

		
		driver.findElement(By.xpath(ai)).click();
		String ai_heading = "//div[@id='artificial-intelligence']//h2[text()='AI and Machine Learning']";
		heading = driver.findElement(By.xpath(ai_heading)).isDisplayed();
		if(heading)
			System.out.println("ai_heading valid");
		else
			System.out.println("ai_heading INvalid");
		
		
		driver.findElement(By.xpath(rules_engine)).click();
		String Rules_Engine_heading = "//div[@id='rules-engine']//a[text()='Scheduling Rules Engine']";
		heading = driver.findElement(By.xpath(Rules_Engine_heading)).isDisplayed();
		if(heading)
			System.out.println(" Rules_Engine_heading valid");
		else
			System.out.println("Rules_Engine_heading INvalid");
/*
		driver.findElement(By.xpath(billing_payroll)).click();
		String billing_payroll_heading = "//div[@id='timesheets']//h2[text()='Electronic Timesheets']";
		heading = driver.findElement(By.xpath(billing_payroll_heading)).isDisplayed();
		if(heading)
			System.out.println(" timesheets_heading valid");
		else
			System.out.println("timesheets_heading INvalid");
*/
		
		
		driver.findElement(By.xpath(integration)).click();
		String integration_heading = "//div[@id='integration']//h2[text()='An Integrated Scheduling Ecosystem']";
		heading = driver.findElement(By.xpath(integration_heading)).isDisplayed();
		if(heading)
			System.out.println(" integration_heading valid");
		else
			System.out.println("integration_heading INvalid");


		driver.findElement(By.xpath(reporting)).click();
		String reporting_heading = "//div[@id='reporting']//h2[text()='Reporting']";
		heading = driver.findElement(By.xpath(reporting_heading)).isDisplayed();
		if(heading)
			System.out.println(" reporting_heading valid");
		else
			System.out.println("reporting_heading INvalid");


		//link10
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(read_more_success))).click();
		heading = driver.findElement(By.xpath(customer_success_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 10 is PRESENT");
		//returns back to the Time & Attendance Landing page
				driver.get("https://www.celayix.com/employee-scheduling-software/");


		//link11
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pricing))).click();
		heading = driver.findElement(By.xpath(pricing_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 11 is PRESENT");
		//returns back to the Time & Attendance Landing page
		driver.get("https://www.celayix.com/employee-scheduling-software/");


		//link12
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cost_benefit_analyzer))).click();
		heading = driver.findElement(By.xpath(cost_benefit_analyzer_pageheading)).isDisplayed();

		if(heading)
			System.out.println("Link 12 is PRESENT");
		//returns back to the Time & Attendance Landing page
		driver.get("https://www.celayix.com/employee-scheduling-software/");
		
		String valueper100 = driver.findElement(By.id("Formula-1605123105742-clone185-clone695")).getText();
		String valueper100_2 = driver.findElement(By.id("Formula-1605121021140-clone185-clone695")).getText();


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

		System.out.println("Form - Done -> Worth My Time");
		
		
		String valueperinput = driver.findElement(By.id("Formula-1605123105742-clone185-clone695")).getText();
		
		if(valueper100 != valueperinput)
			System.out.println("THe number changed");
		else
			System.out.println("THe number UNCHANGED");

		
		
		String valueperinput_2 = driver.findElement(By.id("Formula-1605121021140-clone185-clone695")).getText();
		
		if(valueper100_2 != valueperinput_2)
			System.out.println("THe number changed -2");
		else
			System.out.println("THe number UNCHANGED -2");
			
		System.out.println("-----------\n" + valueperinput + " and " + valueperinput_2);

		

		//buttons on the bottom of the page
		//research
		driver.findElement(By.xpath(research_button)).click();
		boolean research_heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Celayix Research']")).isDisplayed();

		if(research_heading)
			System.out.println("Research Link is PRESENT");


		driver.get("https://www.celayix.com/employee-scheduling-software/");

		//pricing
		driver.findElement(By.xpath(pricing_button)).click();

		boolean final_test = driver.findElement(By.xpath(pricing_pageheading)).isDisplayed();

		if(final_test)
			System.out.println("Test Passed");

		else
			System.out.println("Test Failed");


		//Quits the driver and the test stops
		driver.quit();

		System.out.println("Test Clear So far");


	}//end of main()

}
