/*
// Cealyix Website
// This test automated the Configuration part of the 60 Day Money Back Guarantee Form
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

public class Configuration_MoneyBack_AM {
        public static void main(final String[] args) throws Exception {

                // links of all the elements needed
                String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");

                String no_risk_decision = "//div[@id='float']//h5[text()='No-Risk Decisions']";
                String moneyback_60day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";

                String config_link = "//div[@id='radesktop']//label[text()='Configuration']";
                String moneyback_button = "Calltoaction-1615950654328";

                String config_commentbox = "textarea-1615949174157";
                String config_shift_temp = "Number-1615950492298";
                String config_employee_type = "Number-1615951102180";
                String config_pay_rates = "Number-1615951136092";

                ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
                                .withRemoteAddress(new URL("http://localhost:8585"))
                                .withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);

                driver.navigate().to("https://www.celayix.com/");

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
                actionProvider.moveToElement(driver.findElement(By.xpath(config_link))).build().perform();

                // this portion writes into the text box
                driver.findElement(By.id(config_commentbox))
                                .sendKeys("I am loving it so far. The software is helping my business run smooth");

                driver.findElement(By.id(config_shift_temp)).sendKeys("266");
                driver.findElement(By.id(config_employee_type)).sendKeys("9999");
                driver.findElement(By.id(config_pay_rates)).sendKeys("765433" + Keys.ENTER);

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
