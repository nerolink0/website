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

public class Security_Industries_Landing_Page {

	public static void main (final String[] args) throws Exception
	{
		// Cookies accept/learn more options
		String accept_cookies = "cookie_action_close_header";

		// links,xpaths,ids LOCATORS of all the elements needed
		String industries_path = "mega-menu-item-1834";
		String security_header = "mega-menu-item-28806";
		String security_page_heading = "//div[@id='et-boc']//h1[text()='Automated Security Guard Scheduling and']";

		//Subsections of the SECURITY Page
		String scheduling_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_0 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String time_attendance_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_1 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String billing_payroll_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_2 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String mobile_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_3 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String ai_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_4 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String rules_engine_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_5 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";
		String integration_security = "//div[@class='et_pb_module et_pb_blurb et_pb_blurb_7 et_clickable  et_pb_text_align_center  et_pb_blurb_position_top et_pb_bg_layout_light']";

		//
		String active_schedule_staff_security = "Number-1605054893235-clone185-clone695";
		String scheduled_location_Security = "Number-1605056185005-clone185-clone695";
		String staff_turnover_rate_security = "Number-1605120289037-clone185-clone695";
		String average_weekly_hours_worked_security = "Number-1605057833179-clone185-clone695";
		String average_hourly_wage_staff_security = "Number-1605059528193-clone185-clone695";
		String schedule_managers_security = "Number-1605059672709-clone185-clone695";
		String average_scheduler_wage_security = "Number-1605056781293-clone185-clone695";
		String time_managing_schedules_security = "Number-1605057062761-clone185-clone695";
		String unbillable_OT_security = "Number-1613595868466-clone695";

		//links within the form
		String scheduling_autofill = "//div[@id='scheduling']//a[text()='Auto Fill']";
		String absenteeism_link = "//div[@id='absenteeism']//a[text()='Absenteeism']";
		String absenteeism_free_replacement = "//div[@id='absenteeism']//a[text()='Find Replacement']";
		String absenteeism_ai_engine = "//div[@id='absenteeism']//a[text()='Celayix AI Engine']";
		String overtime = "//div[@id='overtime']//a[text()='overtime']";
		String ai_CelayixAI_1 = "//div[@id='artificial intelligence']//a[text()='Celayix AI']";
		String ai_CelayixAI_2 = "//div[@id='artificial intelligence']/div/p[2]/a[text()='Celayix AI']";
		String time_attendance = "//div[@id='time-attendance']//a[text()='Time & Attendance']";
		String time_attendance_2 = "//div[@id='time-attendance']//a[text()='Time & attendance']";
		String time_attendance_GPS = "//div[@id='time-attendance']//a[text()='GPS']";
		String payroll_time_attendance = "//div[@id='payroll-billing']//a[text()='Time & attendance']";
		String payroll_timeattendance_software = "//div[@id='payroll-billing']//a[text()='time & attendance software']";

		//heading paths
		String autofill_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Autofill: What Is It And What Are The Benefits?']";
		String absenteeism_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='The True Causes & Costs of Absenteeism in the Workplace']";
		String find_replacement_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Celayix Find Replacement – Find Shift Replacements Instantly!']";
		String AI_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Artificial Intelligence – What is it and How Do We use it?']";
		String overtime_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='The Impact of Overtime and How to Reduce it']";
		String time_attendance_pageheading = "//div[@id='main-content']//h1[text()='Feature Focus: Celayix Time & Attendance Software']";
		String GPS_pageheading = "//div[@id='main-content']//h1[@class='entry-title' and text()='Using Geofencing to Manage Your Workforce']";


		boolean heading0,heading1,heading2,heading3,heading4,heading5,heading6,heading7,heading8,heading9,heading10,heading11;

		//Headings of the links within the page


		//Buttons
		String research_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_1 et_pb_bg_layout_dark']";
		String pricing_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_2 et_pb_bg_layout_dark']";


		//Time for driver sleep
		int time = 3000;

		ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions()).withRemoteAddress(new URL("http://localhost:8585")).withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);

		//Dimension dimension = new Dimension(2048, 1536);

		//Changes resolution of the window
		//driver.manage().window().setSize(dimension);

		//MAximizes the window
		driver.manage().window().maximize();



		//Applying implicitly WAIT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);

		//Navigates to the Celayix Website
		driver.get("https://www.celayix.com");



		//Creating the WAIT class
		WebDriverWait wait = new WebDriverWait(driver,5);

		//Building the Action Class
		Actions hover = new Actions(driver);

		//Hovers to Industries Header to interact with the page
		hover.moveToElement(driver.findElement(By.id(industries_path))).build().perform();

		Thread.sleep(time);
		System.out.println("Hovers Industries");

		driver.findElement(By.id(security_header)).click();
		hover.moveToElement(driver.findElement(By.xpath(security_page_heading))).build().perform();


		//MOves to the "Everything You Need to Know" part of the Security page
		hover.moveToElement(driver.findElement(By.xpath("//div[@id='page-container']//h2[text()='Everything You Need to Succeed']"))).build().perform();

		//wait until cookies show up and accepts
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(accept_cookies)))).click();
		//System.out.println("Accepts Cookies");


		//SCHEDULING
		driver.findElement(By.xpath(scheduling_security)).click();


		//TIME_ATTENDANCE
		driver.findElement(By.xpath(time_attendance_security)).click();
		//Thread.sleep(time);

		driver.findElement(By.xpath(billing_payroll_security)).click();
		//Thread.sleep(time);

		driver.findElement(By.xpath(mobile_security)).click();
		driver.findElement(By.xpath(ai_security)).click();
		driver.findElement(By.xpath(rules_engine_security)).click();
		driver.findElement(By.xpath(integration_security)).click();


		//LINKS within the PAGE

		//link1
		driver.findElement(By.xpath(scheduling_autofill)).click();
		heading0 = driver.findElement(By.xpath(autofill_pageheading)).isDisplayed();

		if(heading0)
			System.out.println("Link 1 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link2
		driver.findElement(By.xpath(absenteeism_link)).click();
		heading1 = driver.findElement(By.xpath(absenteeism_pageheading)).isDisplayed();

		if(heading1)
			System.out.println("Link 2 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link3
		driver.findElement(By.xpath(absenteeism_free_replacement)).click();
		heading2 = driver.findElement(By.xpath(find_replacement_pageheading)).isDisplayed();

		if(heading2)
			System.out.println("Link 3 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link4
		driver.findElement(By.xpath(absenteeism_ai_engine)).click();
		heading3 = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading3)
			System.out.println("Link 4 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link5
		driver.findElement(By.xpath(overtime)).click();
		heading4 = driver.findElement(By.xpath(overtime_pageheading)).isDisplayed();

		if(heading4)
			System.out.println("Link 5 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link6
		driver.findElement(By.xpath(ai_CelayixAI_1)).click();
		heading5 = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading5)
			System.out.println("Link 6 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link7
		driver.findElement(By.xpath(ai_CelayixAI_2)).click();
		heading6 = driver.findElement(By.xpath(AI_pageheading)).isDisplayed();

		if(heading6)
			System.out.println("Link 7 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link8
		driver.findElement(By.xpath(time_attendance)).click();
		heading7 = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading7)
			System.out.println("Link 8 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link9
		driver.findElement(By.xpath(time_attendance_2)).click();
		heading8 = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading8)
			System.out.println("Link 9 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link10
		driver.findElement(By.xpath(time_attendance_GPS)).click();
		heading9 = driver.findElement(By.xpath(GPS_pageheading)).isDisplayed();

		if(heading9)
			System.out.println("Link 10 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link11
		driver.findElement(By.xpath(payroll_time_attendance)).click();
		heading10 = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading10)
			System.out.println("Link 11 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		//link12
		driver.findElement(By.xpath(payroll_timeattendance_software)).click();
		heading11 = driver.findElement(By.xpath(time_attendance_pageheading)).isDisplayed();

		if(heading11)
			System.out.println("Link 12 is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");
		Thread.sleep(time);




		//VIDEO SCREENSHOTTING
		WebElement video1_security = driver.findElement(By.id("scheduling"));
		System.out.println("Declared WebElement");
		Thread.sleep(time);

		//SCREENSHOT
		File screenshot1_video1_security = video1_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video1_security, new File("C:/Users/m.shawon/Downloads/Security_video1.png"));

		System.out.println("Screenshot TAken");

		WebElement video2_security = driver.findElement(By.id("absenteeism"));
		Thread.sleep(time);
		
		File screenshot1_video2_security = video2_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video2_security, new File("C:/Users/m.shawon/Downloads/Security_video2.png"));

		System.out.println("SS 2 taken");
		
		
		WebElement video3_security = driver.findElement(By.id("mobile"));
		Thread.sleep(time);
		
		File screenshot1_video3_security = video3_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video3_security, new File("C:/Users/m.shawon/Downloads/Security_video3.png"));

		System.out.println("SS 3 taken");
		
		WebElement video4_security = driver.findElement(By.id("overtime"));
		Thread.sleep(time);
		
		File screenshot1_video4_security = video4_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video4_security, new File("C:/Users/m.shawon/Downloads/Security_video4.png"));

		System.out.println("SS 4 taken");
		
		
		WebElement video5_security = driver.findElement(By.id("artificial-intelligence"));
		Thread.sleep(time);
		
		File screenshot1_video5_security = video5_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video5_security, new File("C:/Users/m.shawon/Downloads/Security_video5.png"));

		System.out.println("SS 5 taken");
		
		WebElement video6_security = driver.findElement(By.id("rules-engine"));
		Thread.sleep(time);
		
		File screenshot1_video6_security = video6_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video6_security, new File("C:/Users/m.shawon/Downloads/Security_video6.png"));

		System.out.println("SS 6 taken");
		
		WebElement video7_security = driver.findElement(By.id("time-attendance"));
		Thread.sleep(time);
		
		File screenshot1_video7_security = video7_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video7_security, new File("C:/Users/m.shawon/Downloads/Security_video7.png"));

		System.out.println("SS 7 taken");
		
		
		WebElement video8_security = driver.findElement(By.id("payroll-billing"));
		Thread.sleep(time);
		
		File screenshot1_video8_security = video8_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video8_security, new File("C:/Users/m.shawon/Downloads/Security_video8.png"));

		System.out.println("SS 8 taken");
		
		WebElement video9_security = driver.findElement(By.id("integration"));
		Thread.sleep(time);
		
		File screenshot1_video9_security = video9_security.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1_video9_security, new File("C:/Users/m.shawon/Downloads/Security_video9.png"));

		System.out.println("SS 9 taken");
		


		driver.findElement(By.id(active_schedule_staff_security)).sendKeys("1234");
		driver.findElement(By.id(scheduled_location_Security)).sendKeys("234");
		driver.findElement(By.id(staff_turnover_rate_security)).sendKeys("222");
		driver.findElement(By.id(average_weekly_hours_worked_security)).sendKeys("45");
		driver.findElement(By.id(average_hourly_wage_staff_security)).sendKeys("25.5");
		driver.findElement(By.id(schedule_managers_security)).sendKeys("5");
		driver.findElement(By.id(average_scheduler_wage_security)).sendKeys("17.777");
		driver.findElement(By.id(unbillable_OT_security)).sendKeys("15");
		driver.findElement(By.id(time_managing_schedules_security)).sendKeys("1234");
		Thread.sleep(time);

		System.out.println("Before research button");

		driver.findElement(By.xpath(research_button)).click();
		boolean research_heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Celayix Research']")).isDisplayed();
		
		if(research_heading)
			System.out.println("Research Link is PRESENT");

		driver.get("https://www.celayix.com/industries/security-guard-officer-scheduling-software/");

		driver.findElement(By.xpath(pricing_button)).click();

		boolean final_test = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Choose the plan that works for you']")).isDisplayed();

		if(final_test)
			System.out.println("Test Passed");

		else
			System.out.println("Test Failed");

		//Quits the test
		driver.quit();

	}

}
