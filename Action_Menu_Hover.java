package Action_Menu;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class Action_Menu_Hover {
	
	public static void main(final String[] args) throws Exception {
		
		// links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String no_risk_decision_path = "//div[@id='float']//h5[text()='No-Risk Decisions']";
        String support_options_path = "//div[@id='float']//h5[text()='Support Options']";
        String stay_updated_path = "//div[@id='float']//h5[@class='et_pb_toggle_title' and text()='Stay Updated']";
	
	       
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
	    
	
	    // building the Action class so that hovering over an element is possible
	    Actions actionProvider = new Actions(driver);
	    
	    // Hovers action menu
	    actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
	    Thread.sleep(time);
	    
        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.xpath(no_risk_decision_path)).isDisplayed();
        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        

        driver.quit();

	}// end of main()

}//end of class
