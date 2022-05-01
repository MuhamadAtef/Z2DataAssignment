import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests extends TestBase{

    GoogleHomePage googleHomePage ;
    SearchNavigatedPage searchNavigatedPage ;
    RequiredLink1 requiredLink1 ;
    RequiredLink2 requiredLink2 ;

@Test
public void Test1(){
    googleHomePage=new GoogleHomePage(driver);
    googleHomePage.GoogleSearch("Selenium Tutorial");
    searchNavigatedPage=googleHomePage.ClickingGoogleSearch();
    requiredLink1 = searchNavigatedPage.SelectRequiredLink1();
    String actualResult=requiredLink1.getAssertionText();
    System.out.println(actualResult);
    String expectedResult = "https://www.javatpoint.com/selenium-tutorial";
    Assert.assertTrue(actualResult.contains(expectedResult),"failed Test");
}

    @Test
    public void Test2(){
        googleHomePage=new GoogleHomePage(driver);
        googleHomePage.GoogleSearch("Selenium Tutorial");
        searchNavigatedPage=googleHomePage.ClickingGoogleSearch();
        requiredLink2 = searchNavigatedPage.SelectRequiredLink2();
        String actualResult= requiredLink2.getAssertionText();
        System.out.println(actualResult);
        String expectedResult = "https://www.tutorialspoint.com/selenium/index.htm";
        Assert.assertTrue(actualResult.contains(expectedResult),"failed Test");
    }

}
