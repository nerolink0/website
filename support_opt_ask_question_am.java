/*
// Celayix Website
// This test automated the Ask a Question part of the Support Options Form
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


public class support_opt_ask_question_am {
    
    public static void main(final String[] args) throws Exception {

        
        // links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");
        String support_options_link = "//div[@id='float']//h5[text()='Support Options']";
        String ask_a_question_link = "overlay_unique_id_27983";
        String askaq_form_heading = "//div[@id='et-boc']//h3[text()='Ask a Question']";
        String ask_q_submit_form = "gform_submit_button_30";
        String fname_askq = "input_30_2";
        String lname_askq = "input_30_10";
        String companyname_askq = "input_30_6";
        String email_askq = "input_30_8";
        String phone_askq = "input_30_9";
        String message_askq = "input_30_7";
        String captcha_askq = "input_30_14";
        String slct_captcha_askq = "Woodpecker";
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
        System.out.println("Entered the website");
        
        driver.manage().addCookie(new Cookie("key", "value"));

        // building the Action class so that hovering over an element is possible
        Actions actionProvider = new Actions(driver);
        // Performs mouse move action onto the element
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        System.out.println("Hovered the Action Menu");
        
        // Enters the action menu and clicks "Support Options" and finds "Ask a
        // Question"
        driver.findElement(By.xpath(support_options_link)).click();
        System.out.println("Clicked Support Options");
        Thread.sleep(time);
        driver.findElement(By.id(ask_a_question_link)).click();
        
        System.out.println("Clicked Ask a Question");
        //driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

        //figuring out the wait.until
        WebDriverWait w = new WebDriverWait(driver,5);
        //waits till the form is loaded and locates the heading of the form "Ask a Question"
        w.until(ExpectedConditions.elementToBeClickable(By.xpath(askaq_form_heading)));
        
        //sending inputs in the form
        driver.findElement(By.id(fname_askq)).sendKeys("Lebron");
        System.out.println("First Name input is present");
        driver.findElement(By.id(lname_askq)).sendKeys("James");
        driver.findElement(By.id(companyname_askq)).sendKeys("National Basketball Association");
        driver.findElement(By.id(email_askq)).sendKeys("bot1@guildedcoffee.com");
        driver.findElement(By.id(phone_askq)).sendKeys("1234567890");
        driver.findElement(By.id(message_askq)).sendKeys("Like it so far");
        
        driver.findElement(By.id(captcha_askq)).click();
        Select dropdown = new Select(driver.findElement(By.id(captcha_askq)));
        
        dropdown.selectByValue(slct_captcha_askq);
        

        //driver.findElement(By.xpath(slct_captcha_askq)).click();
        //Thread.sleep(time);
        
        System.out.println("Answered all");


        // Located the submit button to verify the test
        boolean passed = driver.findElement(By.id(ask_q_submit_form)).isDisplayed();
        Thread.sleep(time);
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();

    }// end of main()

}// end of class
