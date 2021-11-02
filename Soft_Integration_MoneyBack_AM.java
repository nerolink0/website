/*
// Celayix Website
// This test automated the Software Integration part of the 60 Day Money Back Guarantee Form
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

public class Soft_Integration_MoneyBack_AM {
    public static void main(final String[] args) throws Exception {

        // links,xpaths,ids LOCATORS of all the elements needed
        String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");

        String no_risk_decision = "//div[@id='float']//h5[text()='No-Risk Decisions']";
        String moneyback_60day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";

        String softare_integration = "//div[@id='radesktop']//label[text()='Software Integration']";

        // batch integration required checkboxes
        String billing_soft_checkbox_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-0' and text()='Billing Software']";
        String payroll_soft_checkbox_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-1' and text()='Payroll Software']";
        String payroll_service_checkbox_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-2' and text()='Payroll Service']";
        String hrm_checkbox_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-3' and text()='Human Resources Management Software']";
        String crm_checkbox_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-4' and text()='Customer Relationship Management (CRM) Software']";
        String healthcare_mng_soft_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-5' and text()='Healthcare Management Software']";
        String guardtouring_mng_soft_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-6' and text()='Guard Touring and Incident Management Software']";
        String library_mng_sys_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-7' and text()='Library Management System']";
        String manufacturing_rsrc_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-8' and text()='Manufacturing Resource Planning Software']";
        String hardware_timeclocks_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-9' and text()='Hardware Time Clocks']";
        String custom_inhouse_othersys_bi = "//div[@id='radesktop']//label[@for='checkbox-group-1615948376739-10' and text()='Custom In-House or Other Systems']";

        // real time integration required checkboxes
        String billing_soft_checkbox_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-0' and text()='Billing Software']";
        String payroll_soft_checkbox_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-1' and text()='Payroll Software']";
        String payroll_service_checkbox_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-2' and text()='Payroll Service']";
        String hrm_checkbox_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-3' and text()='Human Resources Management Software']";
        String crm_checkbox_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-4' and text()='Customer Relationship Management (CRM) Software']";
        String healthcare_mng_soft_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-5' and text()='Healthcare Management Software']";
        String guardtouring_mng_soft_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-6' and text()='Guard Touring and Incident Management Software']";
        String library_mng_sys_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-7' and text()='Library Management System']";
        String manufacturing_rsrc_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-8' and text()='Manufacturing Resource Planning Software']";
        String hardware_timeclocks_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-9' and text()='Hardware Time Clocks']";
        String custom_inhouse_othersys_ri = "//div[@id='radesktop']//label[@for='checkbox-group-1615949107591-10' and text()='Custom In-House or Other Systems']";

        // comment sections declaration
        String batch_integration_commentbox = "textarea-1615948923569"; // ID description of batch integration comment
                                                                        // box
        String realtime_integration_commentbox = "textarea-1615949422146"; // ID description of real time integration
                                                                           // comment box

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
        actionProvider.moveToElement(driver.findElement(By.xpath(softare_integration))).build().perform();

        // selecting the checkboxes
        driver.findElement(By.xpath(billing_soft_checkbox_bi)).click();
        driver.findElement(By.xpath(payroll_service_checkbox_bi)).click();
        driver.findElement(By.xpath(payroll_soft_checkbox_bi)).click();
        driver.findElement(By.xpath(hrm_checkbox_bi)).click();
        driver.findElement(By.xpath(crm_checkbox_bi)).click();
        driver.findElement(By.xpath(healthcare_mng_soft_bi)).click();
        driver.findElement(By.xpath(guardtouring_mng_soft_bi)).click();
        driver.findElement(By.xpath(library_mng_sys_bi)).click();
        driver.findElement(By.xpath(manufacturing_rsrc_bi)).click();
        driver.findElement(By.xpath(hardware_timeclocks_bi)).click();
        driver.findElement(By.xpath(custom_inhouse_othersys_bi)).click();

        // checking the realtime integration checkboxes
        driver.findElement(By.xpath(billing_soft_checkbox_ri)).click();
        driver.findElement(By.xpath(payroll_service_checkbox_ri)).click();
        driver.findElement(By.xpath(payroll_soft_checkbox_ri)).click();
        driver.findElement(By.xpath(hrm_checkbox_ri)).click();
        driver.findElement(By.xpath(crm_checkbox_ri)).click();
        driver.findElement(By.xpath(healthcare_mng_soft_ri)).click();
        driver.findElement(By.xpath(guardtouring_mng_soft_ri)).click();
        driver.findElement(By.xpath(library_mng_sys_ri)).click();
        driver.findElement(By.xpath(manufacturing_rsrc_ri)).click();
        driver.findElement(By.xpath(hardware_timeclocks_ri)).click();
        driver.findElement(By.xpath(custom_inhouse_othersys_ri)).click();

        // this portion writes into the batch integration text box
        driver.findElement(By.id(batch_integration_commentbox))
                .sendKeys("I am loving it so far. The software is helping my business run smooth");

        // this portion writes into the real time integration comment box
        driver.findElement(By.id(realtime_integration_commentbox)).sendKeys("Anything I write should be posted here");

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
