import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3SchoolsPage {

    private WebDriver driver;

    @FindBy(xpath = "//td[text()=\"Ernst Handel\"]")
    private WebElement companyName ;

    @FindBy(xpath = "//td[text()=\"Austria\"]")
    private WebElement country ;

    public W3SchoolsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getCompanyName(){
        return companyName.getText();
    }

    public String getCountry(){
        return country.getText();
    }


}
