import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmedPage {

    public WebDriver driver;

    //@FindBy(id = "uploaded-files")
    //private WebElement uploadedImage ;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedImage ;


    public ConfirmedPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);    }

    public String GettingImageName (WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(uploadedImage.getText());
       return uploadedImage.getText();

    }


}
