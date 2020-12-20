package BasePage;

import PageObject.LoginHomePage;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BasePage {


    protected LoginPage loginPage;
    protected LoginHomePage loginHomePage;
    //create Page Object


    protected WebDriver driver;
    //create a Webdriver Object
    @BeforeTest

    public void BasePage(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//Importing chromedriver
        driver = new ChromeDriver();
//Instatiating a webdriver object
        driver.manage().window().maximize();
//Maximize the window
        driver.get("https://www.konga.com");
//Launch application URL
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//Wait 5 seconds
        loginPage = new LoginPage (driver);
        loginHomePage = new LoginHomePage(driver);
//Instantiate loginpage and loginhomepage
    }


    @AfterTest

    public void closeBrowser(){
        driver.quit();
        //Close the windpw and quit the session
    }
}
