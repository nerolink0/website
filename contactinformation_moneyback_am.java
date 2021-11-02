/*
// Cealyix Website
// This test automated the Contact Information part of the 60 Day Money Back Guarantee Form
// The form is found under the Action Menu
*/

package Action_Menu;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.net.URL;

public class contactinformation_moneyback_am {
    public static void main(final String[] args) throws Exception {

        // links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");

        String no_risk_decision = "//div[@id='float']//h5[text()='No-Risk Decisions']";
        String moneyback_60day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";

        String contact_information = "//div[@id='radesktop']//label[text()='Contact Information']";

        // comment sections declaration
        String first_name_moneyback = "text-1615950870307";
        String last_name_moneyback = "text-1615950992510";
        String company_moneyback = "text-1615951003631";
        String email_moneyback = "text-1615950954035";

        String moneyback_button = "Calltoaction-1615950654328";

        // builds the driver for automation
        ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
                .withRemoteAddress(new URL("http://localhost:8585"))
                .withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);

        // takes to the website provided
        driver.navigate().to("https://www.celayix.com/");

        // building the Action class so that hovering over an element is possible
        Actions actionProvider = new Actions(driver);
        // Performs mouse move action onto the element
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();

        // Enters the action menu and clicks "No-Risk Decisions" & clicks "60-Day Money
        // Back Guarantee" form
        driver.findElement(By.xpath(no_risk_decision)).click();
        driver.findElement(By.xpath(moneyback_60day_form)).click();

        // hovering again to load the form
        actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
        Thread.sleep(2000);

        // moves to the configuration part of the form
        actionProvider.moveToElement(driver.findElement(By.xpath(contact_information))).build().perform();

        driver.findElement(By.id(first_name_moneyback)).sendKeys("Lebron");
        driver.findElement(By.id(last_name_moneyback)).sendKeys("James");
        driver.findElement(By.id(company_moneyback)).sendKeys("National Basketball Association");
        driver.findElement(By.id(email_moneyback)).sendKeys("bot1@guildedcoffee.com");
        Thread.sleep(3000);

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
