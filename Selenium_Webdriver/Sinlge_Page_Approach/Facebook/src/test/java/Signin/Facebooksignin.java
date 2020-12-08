package Signin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Facebooksignin {
    private WebDriver driver;
    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement (By.id("email")).sendKeys("testade567@gmail.com");
        driver.findElement (By.id("pass")).sendKeys("testade1234");
        driver.findElement (By.xpath ("//*[@id=\"u_0_b\"]")).click ();
        Thread.sleep(10000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException{
        Facebooksignin test = new Facebooksignin();
        test.setUp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }


};
