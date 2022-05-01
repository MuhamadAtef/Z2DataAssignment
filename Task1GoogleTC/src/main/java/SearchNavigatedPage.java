import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchNavigatedPage {

    private WebDriver driver;


    //private By requiredLink = By.xpath("//a[@href=\"https://www.javatpoint.com/selenium-tutorial\"]//h3[@class=\"LC20lb MBeuO DKV0Md\"]");

    //private By requiredLink = By.linkText("Selenium Tutorial - javatpoint");

    private By requiredLink1 = By.partialLinkText("javatpoint");

    private By requiredLink2 = By.partialLinkText("Tutorialspoint");


    public  SearchNavigatedPage(WebDriver driver){
        this.driver = driver;
    }

    public RequiredLink1 SelectRequiredLink1(){
        driver.findElement(requiredLink1).click();
        return new RequiredLink1(driver);
    }
    

    public RequiredLink2 SelectRequiredLink2(){
        driver.findElement(requiredLink2).click();
        return new RequiredLink2(driver);
    }
}

