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


public class newsletter_subscription_stayupdated_am {
    
    public static void main(final String[] args) throws Exception {

        
        // links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String stay_updated_path = "//div[@id='float']//h5[@class='et_pb_toggle_title' and text()='Stay Updated']";
        String newsletter_subs_path = "overlay_unique_id_27993";
        String newsletter_form_heading = "//div[@id='et-boc']//h3[text()='Monthly Newsletter']";
        String fname_news_subs = "input_28_1";
        String lname_news_subs = "input_28_10";
        String company_news_subs = "input_28_11";
        String email_news_subs = "input_28_14";
        String captcha_news_subs = "input_28_19";
        String select_captcha_news_subs = "Blue";
        String submit_button_news_subs = "gform_submit_button_28";
        String close_btn_news_subs = "//div[@id='overlay-27993']//span[@class='custom_btn']";
        
        //cookies locator path
        String cookies_id= "cookie-law-info-bar";
        String accept_cookies = "cookie_action_close_header";
        
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
        WebDriverWait w = new WebDriverWait(driver,10);

        // building the Action class so that hovering over an element is possible
        Actions actionProvider = new Actions(driver);
        
        // Performs mouse move action onto the element to interact with the page
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        //Thread.sleep(time);
        
        //waits until "Accept" option for cookies is available and then accepts it
        w.until(ExpectedConditions.elementToBeClickable(By.id(accept_cookies))).click();
        
        //	Hovers over action menu
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        Thread.sleep(time);
        
        
        
        // Enters the action menu and clicks "Stay Updated" and finds "Newsletter Subscription"
        w.until(ExpectedConditions.elementToBeClickable(By.xpath(stay_updated_path))).click();
        Thread.sleep(time);
        driver.findElement(By.id(newsletter_subs_path)).click();
        
        System.out.println("CLicking newsletter");
        
        
        
   
        //	Waits till the form is loaded and locates the heading of the form "Ask a Question"
        w.until(ExpectedConditions.elementToBeClickable(By.xpath(newsletter_form_heading)));
        
        //	Sending inputs in the form
        driver.findElement(By.id(fname_news_subs)).sendKeys("Lebron");
        driver.findElement(By.id(lname_news_subs)).sendKeys("James");
        driver.findElement(By.id(company_news_subs)).sendKeys("National Basketball Association");
        
        driver.findElement(By.id(captcha_news_subs)).click();
        Select dropdown = new Select(driver.findElement(By.id(captcha_news_subs)));
        
        dropdown.selectByValue(select_captcha_news_subs);
        
        driver.findElement(By.id(email_news_subs)).sendKeys("bot1@guildedcoffee.com");

        Thread.sleep(time);
        

        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.id(submit_button_news_subs)).isDisplayed();
        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        
        //	Closes the form
        driver.findElement(By.xpath(close_btn_news_subs)).click();

        driver.quit();

    }// end of main()

}// end of class
