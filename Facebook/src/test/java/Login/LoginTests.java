package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("+2348110097379");
        driver.findElement(By.id("pass")).sendKeys("@aishak28262");
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
        Thread.sleep(20000);
        driver.quit();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setup();
    }

};
