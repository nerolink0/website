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

public class No_Risk_Decisions_Expanded_AM {
	
	public static void main(final String[] args) throws Exception {
		
		// links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String no_risk_decision_path = "//div[@id='float']//h5[text()='No-Risk Decisions']";	
        String live_custom_demo_form = "overlay_unique_id_27985";
        String form_14_day_trial = "overlay_unique_id_19980";
        String moneyback_60day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";
        
        String accept_cookies = "cookie_action_close_header";

	       
		//time for sleep
	    int time = 2000;
	    
	
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
	    
	    // Hovers action menu
	    actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
	   
	    w.until(ExpectedConditions.elementToBeClickable(By.id(accept_cookies))).click();
	    
	    actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
	    Thread.sleep(time);

	 
	    //Thread.sleep(time);

	    boolean check1 = driver.findElement(By.id(live_custom_demo_form)).isDisplayed();
	    
	    if (check1) {
            System.out.println("Live Custom Demo Form Present");
        } else {
            System.out.println("Live Custom Demo Form ABSENTt");
        }
        
	    boolean check2 = driver.findElement(By.id(form_14_day_trial)).isDisplayed();
	    
	    if (check2) {
            System.out.println("14 Day Trial Form Present");
        } else {
            System.out.println("14 Day Trial Form ABSENT");
        }
        
	    boolean check3 = driver.findElement(By.xpath(moneyback_60day_form)).isDisplayed();
	    
	    if (check3) {
            System.out.println("60 Day Moneyback Guarantee Form Present");
        } else {
            System.out.println("60 Day Moneyback Guarantee Form ABSENT");
        }
	    //Thread.sleep(time);
	    
        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.xpath(no_risk_decision_path)).isDisplayed();
        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        

        driver.quit();

	}// end of main()

}
