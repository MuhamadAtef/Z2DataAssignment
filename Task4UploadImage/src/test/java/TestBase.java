import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;
@BeforeClass
    public void openChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/upload");

    }
@AfterClass
    public void closeChrome(){
        driver.quit();
    }
}
