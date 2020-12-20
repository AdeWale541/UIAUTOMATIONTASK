package LoginPageTests;

import BasePage.BasePage;
import PageObject.LoginHomePage;
import org.testng.annotations.Test;

public class LoginPageTests extends BasePage {



    @Test(priority = 1)

    public void testLoginPageTitle() throws InterruptedException {
        loginPage.clickLoginmenu();
        loginPage.enterUsername("testade567@gmail.com");
        loginPage.enterPassword("testade1234");
        LoginHomePage loginHomePage = loginPage.clickLoginButton();
        Thread.sleep(3000);
        String pageTitle= "Konga";

        if (driver.getTitle().contains(pageTitle) ) {
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual page title is " + driver.getTitle());

        }



    }
}
