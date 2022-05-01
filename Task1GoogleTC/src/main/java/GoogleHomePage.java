import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class GoogleHomePage {

    private WebDriver driver;

    @FindBy(css ="input[class=\"gLFyf gsfi\"]")
    private WebElement searchField ;


    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void GoogleSearch(String searchItem){
        searchField.sendKeys(searchItem);


    }

    public SearchNavigatedPage ClickingGoogleSearch(){
        searchField.sendKeys(Keys.ENTER);
        return new SearchNavigatedPage(driver);
    }

}
