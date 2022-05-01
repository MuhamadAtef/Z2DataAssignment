import org.openqa.selenium.WebDriver;

public class RequiredLink2 {

    private WebDriver driver;


    public RequiredLink2(WebDriver driver) {
        this.driver=driver;
    }

    public String getAssertionText (){
        return driver.getCurrentUrl();
    }
}
