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


public class free_trial_support_opt_am {
    
    public static void main(final String[] args) throws Exception {

        
        // links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String support_options_link = "//div[@id='float']//h5[text()='Support Options']";
        String free_trial_path = "overlay_unique_id_27989";
        String free_trial_form_heading = "//div[@id='et-boc']//h3[text()='Free Trial Support']";
        String fname_ftrial = "input_31_2";
        String lname_ftrial = "input_31_10";
        String company_ftrial = "input_31_6";
        String email_ftrial = "input_31_8";
        String phone_ftrial = "input_31_9";
        String message_ftrial = "input_31_7";
        String captcha_ftrial = "input_31_14";
        String select_captcha_ftrial = "Car";
        String submit_button_ftrial = "gform_submit_button_31";
        String close_btn_ftrial = "//div[@id='overlay-27989']//span[@class='custom_btn']";
        
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
        
        
        driver.manage().addCookie(new Cookie("key", "value"));

        // building the Action class so that hovering over an element is possible
        Actions actionProvider = new Actions(driver);
        // Performs mouse move action onto the element
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        
        
        // Enters the action menu and clicks "Support Options" and finds "Ask a
        // Question"
        driver.findElement(By.xpath(support_options_link)).click();
        
        Thread.sleep(time);
        driver.findElement(By.id(free_trial_path)).click();
        
        
        
        //figuring out the wait.until
        WebDriverWait w = new WebDriverWait(driver,5);
        //waits till the form is loaded and locates the heading of the form "Ask a Question"
        w.until(ExpectedConditions.elementToBeClickable(By.xpath(free_trial_form_heading)));
        
        //sending inputs in the form
        driver.findElement(By.id(fname_ftrial)).sendKeys("Lebron");
        driver.findElement(By.id(lname_ftrial)).sendKeys("James");
        driver.findElement(By.id(company_ftrial)).sendKeys("National Basketball Association");
        driver.findElement(By.id(email_ftrial)).sendKeys("bot1@guildedcoffee.com");
        driver.findElement(By.id(phone_ftrial)).sendKeys("1234567890");
        
        driver.findElement(By.id(captcha_ftrial)).click();
        Select dropdown = new Select(driver.findElement(By.id(captcha_ftrial)));
        
        dropdown.selectByValue(select_captcha_ftrial);
        driver.findElement(By.id(message_ftrial)).sendKeys("It is a test");

        Thread.sleep(time);
        

        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.id(submit_button_ftrial)).isDisplayed();
        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.findElement(By.xpath(close_btn_ftrial)).click();

        driver.quit();

    }// end of main()

}// end of class
