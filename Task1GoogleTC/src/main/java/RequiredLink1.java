import org.openqa.selenium.WebDriver;

public class RequiredLink1 {

    private WebDriver driver;


    public RequiredLink1(WebDriver driver) {
        this.driver=driver;
    }

    public String getAssertionText (){
        return driver.getCurrentUrl();
    }
}
