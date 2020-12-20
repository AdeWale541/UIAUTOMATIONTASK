package ProcessFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ProcessFlow {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.konga.com");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a")).click();
        driver.findElement(By.id("username")).sendKeys("testade567@gmail.com");
        driver.findElement(By.id("password")).sendKeys("testade1234");
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();





        driver.findElement(By.linkText("Computers and Accessories")).click();



        driver.findElement(By.linkText("Laptops")).click();

        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/ul/li[1]/a/label")).click();


        driver.findElement(By.xpath("  //*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/div/a/span")).click();



        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/a/img")).click();
    }

       public static void main (String args[]) throws InterruptedException{
        ProcessFlow test = new ProcessFlow();
                test.setUp ();
    }

    @AfterClass

    public void tearDown(){
        driver.quit();

    }

}
