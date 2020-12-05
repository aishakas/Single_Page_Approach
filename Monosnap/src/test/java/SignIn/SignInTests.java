package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class SignInTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp()throws InterruptedException {
        //Import ChromeDriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Import the webpage URL
        driver.get("https://monosnap.com/");
        //Wait for 5 seconds
        Thread.sleep(5000);
        //Maximise the window
        driver.manage().window().maximize();
        //fetch page title
        System.out.println(driver.getTitle());
        //Wait till page is fully loaded
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click accept cookies
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[3]/div[2]")).click();
        //click on the signin button on the homepage
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]")).click();
        //locate email field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]")).sendKeys("ak.kasali@yahoo.com");
        //locate password field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("aishak28262");
        //locate button field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        Thread.sleep(20000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        SignInTests test = new SignInTests();
        test.setUp ();
    }


}
