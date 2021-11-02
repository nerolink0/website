/*
// Celayix Website
// This test automated the Free Trial Support part of the Support Options Form
// The form is found under the Action Menu
*/

package Action_Menu;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;
import jdk.internal.org.jline.utils.Log;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class MoneyBack_60Day_Form_Trigger_AM {
    
    public static void main(final String[] args) throws Exception {

        
        // links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String no_risk_decision_path = "//div[@id='float']//h5[text()='No-Risk Decisions']";
        String moneyback_60_day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";
        String moneyback_button = "Calltoaction-1615950654328";

        
        
        //time for sleep
        int time = 2000;
        

        // builds the driver for automation
        ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
                .withRemoteAddress(new URL("http://localhost:8585"))
                .withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("chrome://settings/clearBrowserData");
        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
        
        // takes to the website provided
        driver.navigate().to("https://www.celayix.com/");
        
        // Adds cookies
        driver.manage().addCookie(new Cookie("key", "value"));
        
        //figuring out the wait.until
        WebDriverWait w = new WebDriverWait(driver,15);

        // building the Action class so that hovering over an element is possible
        Actions actionProvider = new Actions(driver);
        
        // Performs mouse move action onto the element to interact with the page
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        Thread.sleep(time);
        
        // CLicks "No-risk Decisions" to expand and then clicks "60-Day moneyback guarantee" form
        driver.findElement(By.xpath(no_risk_decision_path)).click();
        driver.findElement(By.xpath(moneyback_60_day_form)).click();
        
        // hovering to load the form
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();

        
        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.id(moneyback_button)).isDisplayed();
        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        

        driver.quit();

    }// end of main()

}// end of class
