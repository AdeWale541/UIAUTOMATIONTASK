package BasePageTests;

import BasePage.BasePage;
import org.testng.annotations.Test;

public class BasePageTests extends BasePage {

        @Test(priority = 0)
        public void TestBasePage() {
            String pageURL = "https://www.konga.com";

            if (driver.getCurrentUrl().contains(pageURL)) {
                System.out.println("The webpage URL is " + pageURL);
            } else {
                System.out.println("Invalid URL, Actual webpage URL is " + driver.getCurrentUrl());
            }
        }

}