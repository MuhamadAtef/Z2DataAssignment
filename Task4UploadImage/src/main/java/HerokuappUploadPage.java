
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappUploadPage {

    private WebDriver driver;

    @FindBy(id = "file-upload")
    private WebElement chooseFile ;

    @FindBy(id = "file-submit")
    private WebElement uploadBtn ;



    public HerokuappUploadPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String imageName = "Z2Data-logo.png";
    private String imagePath = System.getProperty("user.dir")+"/UploadsImage/"+imageName;

    public void ChoosingImage(){
        chooseFile.sendKeys(imagePath);
    }

    public ConfirmedPage ClickingUploadBtn(){
        uploadBtn.click();
        return new ConfirmedPage(driver);
    }



}
