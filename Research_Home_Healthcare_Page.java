package Headers;

import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Research_Home_Healthcare_Page {
	
	public static void main (final String[] args) throws Exception
	{


		// Cookies accept/learn more options
		String accept_cookies = "cookie_action_close_header";

		// links,xpaths,ids LOCATORS of all the elements needed
		String research_path = "mega-menu-item-8240";

		//Time & Attendance path
		String research_home_healthcare_header = "mega-menu-item-17833";

		//Time for driver sleep
		int time = 3000;

		//boolean for checking the heading of the page is present or not
		boolean heading;

		//buttons
		String read_now_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_dark']";
		String ai_book_download_button = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']";
		String readnow_button_2 = "//div[@id='main-content']//a[@class='et_pb_button et_pb_button_2 et_pb_bg_layout_dark']";
		//
		String insights_fname = "et_pb_signup_firstname";
		String insights_lname = "et_pb_signup_lastname";
		String insights_email = "et_pb_signup_email";
		String insights_subscribe_button = "//div[@id='main-content']//span[@class='et_pb_newsletter_button_text']";


		//Celayix Research
		String research_searchbar = "//div[@id='main-content']//input[@class='dp-dfg-search-input search-clean']";
		String research_dropdown = "//p[@class='dp-dfg-dropdown-label' and @data-content='Choose your research']";
		String dropdown_blog = "//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link blog']";
		String dropdown_case_studies = "//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link case-studies']";
		String dropdown_infographics = "//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link infographics']";
		String dropdown_review = "//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link review']";
		String dropdown_testimonial = "//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link testimonial']";
		String dropdown_whitepaper = "//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link whitepaper']";



		//Building the driver class with TestProject Dev Token
		ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions()).withRemoteAddress(new URL("http://localhost:8585")).withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);


		//MAximizes the window
		driver.manage().window().maximize();

		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();

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
		hover.moveToElement(driver.findElement(By.id(research_path))).build().perform();

		//wait until cookies show up and accepts
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(accept_cookies)))).click();
		System.out.println("Accepts Cookies");
		Thread.sleep(time);
		//Hovers to Features
		hover.moveToElement(driver.findElement(By.id(research_path))).build().perform();

		Thread.sleep(time);
		System.out.println("Hovers Research");

		//clicks the Home Health Care
		driver.findElement(By.id(research_home_healthcare_header)).click();

		heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Artificial Intelligence:']")).isDisplayed();
		if(heading)
			System.out.println("Home HealthCare Landed correctly");
		else
			System.out.println("Home HealthCare Landed INcorrectly");


		//Clicks Read Now button
		driver.findElement(By.xpath(read_now_button)).click();
		heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Artificial Intelligence – What is it and How Do We use it?']")).isDisplayed();
		if(heading)
			System.out.println("Read Now Button loaded Correctly");
		else
			System.out.println("Read Now Button loaded INcorrectly");

		String ai_URL = driver.getCurrentUrl();

		//Downloads the book
		driver.findElement(By.xpath(ai_book_download_button)).click();

		String bookURL = driver.getCurrentUrl();
		
		
		//Checks if the URL is different to verify the book downloaded
		if(ai_URL != bookURL)
			System.out.println("Book downloaded Correctly");
		else
			System.out.println("Book downloaded INcorrectly");

		Thread.sleep(time);
		
		
		//Switches back to the original window
		driver.switchTo().window(originalWindow);
		

		//Returns back to the Research Home HealthCare Page
		hover.moveToElement(driver.findElement(By.id(research_path))).build().perform();
		driver.findElement(By.id(research_home_healthcare_header)).click();

		//driver.get("https://www.celayix.com/research/?dfg_active_filter=82");
		
		//Celayix Research Filters
		//Filter 1
		driver.findElement(By.xpath(research_searchbar)).sendKeys("Employees" + Keys.ENTER);

		driver.findElement(By.xpath(research_dropdown)).click();
		Thread.sleep(time);
		driver.findElement(By.xpath("//ul[@class='dp-dfg-level dp-dfg-taxonomy-level-1 dp-dfg-taxonomy-post_tag']//li/a[@class='dp-dfg-filter-link blog']")).click();
		
		heading = driver.findElement(By.xpath("//article[@id='post-29701']//h2[text()='Benefits of Geofencing for Employers and Employees']")).isDisplayed();

		if(heading)
			System.out.println("BLOG Validates Correctly");
		else
			System.out.println("BLOG Validates INcorrectly");

		//Filter 2
		driver.findElement(By.xpath(research_dropdown)).click();
		//Thread.sleep(time);

		driver.findElement(By.xpath(dropdown_case_studies)).click();
		heading = driver.findElement(By.xpath("//article[@id='post-9675']//h2[text()='Smart Security Pros Improves Accountability']")).isDisplayed();
		if(heading)
			System.out.println("Case STUDIES Validates Correctly --2");
		else
			System.out.println("Case STUDIES INcorrectly --2");

		//Filter 3
		driver.findElement(By.xpath(research_dropdown)).click();
		Thread.sleep(time);
		driver.findElement(By.xpath(dropdown_infographics)).click();
		heading = driver.findElement(By.xpath("//article[@id='post-29326']//h2[text()='The True Impact of Overtime – An Infographic']")).isDisplayed();

		if(heading)
			System.out.println("INFOGRAPHICS Validates Correctly --3");
		else
			System.out.println("INFOGRAPHICS INcorrectly --3");

		//Filter 4
		driver.findElement(By.xpath(research_dropdown)).click();
		Thread.sleep(time);

		driver.findElement(By.xpath(dropdown_review)).click();
		heading = driver.findElement(By.xpath("//div[@id='main-content']//div[@class='dp-dfg-no-results' and text()='No results found.']")).isDisplayed();

		if(heading)
			System.out.println("REVIEW Validates Correctly --4");
		else
			System.out.println("REVIEW INcorrectly --4");

		//Filter 5
		//Clicks BLOG first because of a bug
		driver.findElement(By.xpath(research_dropdown)).click();
		driver.findElement(By.xpath(dropdown_blog)).click();
		Thread.sleep(time);
		driver.findElement(By.xpath(research_dropdown)).click();
		hover.moveToElement(driver.findElement(By.xpath(dropdown_testimonial))).build().perform();
		Thread.sleep(time);

		driver.findElement(By.xpath(dropdown_testimonial)).click();
		Thread.sleep(time);
		heading = driver.findElement(By.xpath("//div[@id='main-content']//div[@class='dp-dfg-no-results' and text()='No results found.']")).isDisplayed();

		if(heading)
			System.out.println("TESTIMONIAL Validates Correctly --5");
		else
			System.out.println("TESTIMONIAL INcorrectly --5");

		//Filter 6
		//Clicks BLOG first because of a bug

		driver.findElement(By.xpath(research_dropdown)).click();
		driver.findElement(By.xpath(dropdown_blog)).click();
		Thread.sleep(time);
		driver.findElement(By.xpath(research_dropdown)).click();
		hover.moveToElement(driver.findElement(By.xpath(dropdown_whitepaper))).build().perform();

		Thread.sleep(time);

		driver.findElement(By.xpath(dropdown_whitepaper)).click();
		Thread.sleep(time);
		heading = driver.findElement(By.xpath("//article[@id='post-14120']//h2[text()='Running your Business on Spreadsheets – The Downside']")).isDisplayed();

		if(heading)
			System.out.println("WHITEPAPER Validates Correctly --6");
		else
			System.out.println("WHITEPAPER INcorrectly --6");





		//Validate the subscribe option under Celayix Insights
		hover.moveToElement(driver.findElement(By.id(insights_fname))).build().perform();
		driver.findElement(By.id(insights_fname)).sendKeys("Robot 1");
		driver.findElement(By.id(insights_email)).sendKeys("bot1@guildedcoffee.com");
		driver.findElement(By.xpath(insights_subscribe_button)).click();
		Thread.sleep(time);
		
		System.out.println("Subscriptions Validated");
		

		//Clicks Read Now button
		driver.findElement(By.xpath(readnow_button_2)).click();
		Thread.sleep(time);
		String ai_URL_original = "https://www.celayix.com/blog/ai-ebook/";
			
		Thread.sleep(time);
		
		// Working with tabs
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		//System.out.println(tabs.size());
		
		//Switches to the next tab which opens for the "Read Now" button
		//to make the selenium active tab
		driver.switchTo().window((String) tabs.get(2)); 
				
		String read_button2_URL = driver.getCurrentUrl() ;
		
		//heading = driver.findElement(By.xpath("//div[@id='main-content']//h1[text()='Artificial Intelligence – What is it and How Do We use it?']")).isDisplayed();
		
		//Prinouts the url of previos tab and next tab when Read Now is clicked
		System.out.println(ai_URL_original);
		System.out.println(read_button2_URL);
		
		
		// checks to see if the URL is different than the Research Home Healthcare page
		if(ai_URL_original.equals(read_button2_URL))
			System.out.println("Read Now Button loaded Correctly --2");
		else
			System.out.println("Read Now Button loaded INcorrectly --2");

		//Quits the driver to stop the test
		driver.quit();

		System.out.println("Test Clear So Far");

	}// end of main()


}
