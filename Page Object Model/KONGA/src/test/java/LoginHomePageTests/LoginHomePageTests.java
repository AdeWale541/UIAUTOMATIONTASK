package LoginHomePageTests;

import LoginPageTests.LoginPageTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginHomePageTests extends LoginPageTests {
    @Test(priority = 1)
    public void testVerifyLoginPopup() {
        loginHomePage.VerifyLoginPopup();
    }

    @Test(priority = 2)
    public void assertpageURL() throws InterruptedException {
        String loginURL = "https://www.konga.com/";
        Assert.assertEquals(loginHomePage.getLoginHomePageUrl(), loginURL, "You are not on loginpage");
        Thread.sleep(4000);
    }

    @Test(priority = 3)
    public void assertname() throws InterruptedException {
        loginHomePage.clickProfileBtn();
        Thread.sleep(4000);
        if (driver.getPageSource().contains("ade")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    @Test(priority = 4)
    public void pagetitle() {
    String PageTitle = driver.getTitle();
        System.out.println("The page title is " +PageTitle);
    }

    @Test(priority = 5)
    public void assertitems(){

        if (driver.getPageSource().contains("Account Information")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (driver.getPageSource().contains("Test")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (driver.getPageSource().contains("Delivery Address")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (driver.getPageSource().contains("My Wallet")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (driver.getPageSource().contains("Email Address")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

    }


    @Test(priority = 6)
    public void successfullogout() throws InterruptedException{
        loginHomePage.clickLogoutBtn();
         Thread.sleep(5000);
         String BaseURL = "https://www.konga.com/";
         Assert.assertEquals(loginPage.getHomePageUrl(),BaseURL,"Account logged out. Page URL is " + driver.getCurrentUrl());

    }
}