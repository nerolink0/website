/*
// Cealyix Website
// This test automated the Business You Want Solved part of the 60 Day Money Back Guarantee Form
// The form is found under the Action Menu
*/

package Action_Menu;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.net.URL;

public class MoneyBack_60_Bus_Solved_AM {
        public static void main(final String[] args) throws Exception {

                // links of all the elements needed
                String action_menu_link = new String("//div[@id='float']//p[text()='Action Menu']");

                String no_risk_decision = "//div[@id='float']//h5[text()='No-Risk Decisions']";
                String moneyback_60day_form = "//div[@id='float']//a[text()='60-Day Money Back Guarantee']";

                String bus_prob_solved = "//div[@id='radesktop']//label[text()='Business Problems You Want Solved']";
                String moneyback_button = "Calltoaction-1615950654328";
                String cbox_bus_1 = "//div[@id='radesktop']//label[text()='Reduce Time Managing Schedules']";
                String cbox_bus_2 = "//div[@id='radesktop']//label[text()='Reduce Absenteeism Costs']";
                String cbox_bus_3 = "//div[@id='radesktop']//label[text()='Reduce Unbillable Overtime']";
                String cbox_bus_4 = "//div[@id='radesktop']//label[text()='Eliminate Timesheet Fraud']";
                String cbox_bus_5 = "//div[@id='radesktop']//label[text()='Eliminate Payroll Errors']";
                String cbox_bus_6 = "//div[@id='radesktop']//label[text()='Reduce Staff Turnover']";
                String cbox_bus_7 = "//div[@id='radesktop']//label[text()='Improve Business Scalability']";
                String cbox_bus_8 = "//div[@id='radesktop']//label[text()='Create Competitive Advantage']";
                String bus_commentbox = "textarea-1615947698342";

                ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
                                .withRemoteAddress(new URL("http://localhost:8585"))
                                .withToken("qiKOF5NkXH9EObytdDwnzjney-ddMsEuSZ99RG57jm81").build(ChromeDriver.class);

                driver.navigate().to("https://www.celayix.com/");

                Actions actionProvider = new Actions(driver);
                // Performs mouse move action onto the element
                actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();

                driver.findElement(By.xpath(no_risk_decision)).click();
                driver.findElement(By.xpath(moneyback_60day_form)).click();

                // hovering again to load the form
                actionProvider.moveToElement(driver.findElement(By.xpath(action_menu_link))).build().perform();
                Thread.sleep(2000);

                // moves to the business you want solved part of the form
                actionProvider.moveToElement(driver.findElement(By.xpath(bus_prob_solved))).build().perform();

                // this portion clicks the checkboxes
                driver.findElement(By.xpath(cbox_bus_1)).click();
                driver.findElement(By.xpath(cbox_bus_2)).click();
                driver.findElement(By.xpath(cbox_bus_3)).click();
                driver.findElement(By.xpath(cbox_bus_4)).click();
                driver.findElement(By.xpath(cbox_bus_5)).click();
                driver.findElement(By.xpath(cbox_bus_6)).click();
                driver.findElement(By.xpath(cbox_bus_7)).click();
                driver.findElement(By.xpath(cbox_bus_8)).click();

                // this portion writes into the text box
                driver.findElement(By.id(bus_commentbox))
                                .sendKeys("The software is helping my business run smooth.");
                
                Thread.sleep(2000);
                
                boolean passed = driver.findElement(By.id(moneyback_button)).isDisplayed();
                if (passed) {
                        System.out.println("Test Passed");
                } else {
                        System.out.println("Test Failed");
                }

                driver.quit();

        }// end of main()

}// end of public class
