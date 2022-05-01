
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement checkBox1 ;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement checkBox2 ;




    public HerokuappPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setCheckBox1(){
        checkBox1.click();
    }
    public boolean assertCheckBox1(){
        return checkBox1.isSelected();
    }


    public boolean assertCheckBox2(){
       return checkBox2.isSelected();
    }



}
