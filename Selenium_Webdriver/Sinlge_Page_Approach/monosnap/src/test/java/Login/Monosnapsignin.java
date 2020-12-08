package Login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Monosnapsignin {

    private WebDriver driver;
    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://monosnap.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click ();

        driver.findElement (By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]")).sendKeys("testade567@gmail.com");
        driver.findElement (By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("testade1234");
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click ();
        Thread.sleep(10000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException{
        Monosnapsignin test = new Monosnapsignin();
        test.setUp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }



};
