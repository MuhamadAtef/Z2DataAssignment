import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.HashMap;

public class TestBase {

    public static WebDriver driver;

    public static String downloadPath = System.getProperty("user.dir")+"\\Downloads";

    public static ChromeOptions chromeOption()
    {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default.content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        options.setExperimentalOption("prefs", chromePrefs);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return options ;
    }

@BeforeClass
    public void openChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOption());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
        driver.manage().window().maximize();
    driver.navigate().to("https://www.vertex42.com/Files/download2/themed.php?file=gantt-chart_L.xlsx");

    }
@AfterClass
    public void closeChrome(){
        driver.quit();
    }
}
