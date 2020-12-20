package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHomePage {
    public LoginHomePage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private By LoginPopup = By.xpath("//*[@id=\"app-content-wrapper\"]/div[1]/div/div[1]/p");
    private By ProfileBtn = By.xpath("  //*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/div/a/span");
    private By Logo = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/a/img");
//Using by to locate the LoginHomePage elements


    public String getLoginHomePageUrl(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        //wait until URL is visible
        wait.until(ExpectedConditions.urlToBe("https://www.konga.com/"));
        return driver.getCurrentUrl();
    }

    public void VerifyLoginPopup() {
        driver.findElement(LoginPopup).isDisplayed();
        //Verify the succcessful login pop up
    }

    public void clickProfileBtn() {
        driver.findElement(ProfileBtn).click();
        //click profile button
    }

    public LoginPage clickLogoutBtn(){
        driver.findElement(Logo).click();
        return new LoginPage(driver);
    }


}
