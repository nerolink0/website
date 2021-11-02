package Action_Menu;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Customer_Readiness_MoneyBack_AM {
	
	public static void main(final String[] args) throws Exception {
		
		// links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String no_risk_decision_path = "//div[@id='float']//h5[text()='No-Risk Decisions']";
        String moneyback_60_day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";
        
        String choose_your_industry = "select-1615949557365-button";
        String industry_type = "ui-id-4";
        String employee_avail_data = "//div[@id='radesktop']//div[@class='checkbox-group']";
        String active_employees = "//div[@id='radesktop']//input[contains(@id,'Number-1615943943838')]";
        String expected_purchase_date = "//div[@id='radesktop']//input[contains(@id,'Date-1615949971302')]";
        String todays_date = "//div[@class='daterangepicker ltr auto-apply single opensright show-calendar' and not(contains(@style,'display: none;'))]//td[@class='today active start-date active end-date available']";
        String expected_training_date = "//div[@id='radesktop']//input[contains(@id,'Date-1615949927234')]";
        String expected_golive_date = "//div[@id='radesktop']//input[contains(@id,'Date-1617667170806')]";
        
        String moneyback_button = "Calltoaction-1615950654328";
        
        //accept cookies button
        String accept_cookies = "cookie_action_close_header";

    
	       
		//time for sleep
	    int time = 2000;
	    
	    
	
	    // builds the driver for automation
	    ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
	            .withRemoteAddress(new URL("http://localhost:8585"))
	            .withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);
	    
	    driver.manage().window().maximize();
	    
	    //adding implicit wait
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	    // Clearing caches
	    driver.get("chrome://settings/clearBrowserData");
	    driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	    
	    // takes to the website provided
	    driver.navigate().to("https://www.celayix.com/");
	    
	    // Adds cookies
	    driver.manage().addCookie(new Cookie("key", "value"));
	    
	
	    // building the Action class so that hovering over an element is possible
	    Actions actionProvider = new Actions(driver);
	    
	    // Hovers action menu
	    actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
	    //Thread.sleep(time);
	    
	    
        // CLicks "No-risk Decisions" to expand and then clicks "60-Day moneyback guarantee" form
        driver.findElement(By.xpath(no_risk_decision_path)).click();
        driver.findElement(By.xpath(moneyback_60_day_form)).click();
        
        // hovering to load the form
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        
      //declaring wait class
        WebDriverWait w = new WebDriverWait(driver,10);
        
        //wait until the cookies can be accepted
	    w.until(ExpectedConditions.elementToBeClickable(By.id(accept_cookies))).click();
	    
	    
        //right now only checking for desktop, when resolution/display size is smaller, it uses 'ramobile' rather than 'radesktop'
        //need to come up with solution for checking which path to look for

         driver.findElement(By.id(choose_your_industry)).click(); //choose your industry
         driver.findElement(By.id(industry_type)).click();
         driver.findElement(By.xpath(employee_avail_data)).click(); //emplyee data availability
         driver.findElement(By.xpath(active_employees)).sendKeys("250"); //active employees
          
         driver.findElement(By.xpath(expected_purchase_date)).click(); //expected purchase date
         driver.findElement(By.xpath(todays_date)).click();

         driver.findElement(By.xpath(expected_training_date)).click();//expected training date
         driver.findElement(By.xpath(todays_date)).click();
         //Thread.sleep(time);
         driver.findElement(By.xpath(expected_golive_date)).click();//expected go live date
         driver.findElement(By.xpath(todays_date)).click();
         Thread.sleep(time);

	    
        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.id(moneyback_button)).isDisplayed();
        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        

        driver.quit();

	}// end of main()

}//end of class
