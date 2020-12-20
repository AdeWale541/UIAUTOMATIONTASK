package DashboardPagetests;

import loginPagetests.LoginPagetests;
import org.testng.annotations.Test;

public class Dashboardtests extends LoginPagetests {

    @Test(priority = 5)
    public void testVerifyCompanyImage(){
        dashboardPage.verifyCompanyImage();
    }
    @Test (priority = 6)
    public void testVerifyDashboardTest(){
        dashboardPage.verifyDashboardTest();
    }

    @Test (priority = 7)
    public void testLogout() throws InterruptedException{
        dashboardPage.clickLogout();
        Thread.sleep(4000);
    }


}
