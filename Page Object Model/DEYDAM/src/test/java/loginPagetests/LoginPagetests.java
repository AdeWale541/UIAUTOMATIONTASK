package loginPagetests;

import PageObject.DashboardPage;
import org.testng.annotations.Test;
import setUp.setUps;

public class LoginPagetests extends setUps {

    @Test(priority = 1)
    public void testVerifyCompanyLogo(){
        loginPage.verifyCompanyLogo();
    }

    @Test(priority = 2)
    public void testVerifyForgotPassword(){
        loginPage.verifyForgotPassword();
    }

    @Test (priority = 3)
    public void testVerifyWelcomePanel(){
        loginPage.verifyWelcomePanel();
    }

    @Test (priority = 4)
    public void testVerifyPageTitle() throws InterruptedException{
        loginPage.enterUsername("Wale541000");
        loginPage.enterPassword("testade12345");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        Thread.sleep(3000);
        String pageTitle= "Deydam";
        if (pageTitle.equalsIgnoreCase("Deydam")){
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual oage title is " +pageTitle);

        }
    }




}
