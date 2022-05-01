import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadImageTests extends TestBase{

      HerokuappUploadPage herokuappUploadPage;
      ConfirmedPage confirmedPage;



@Test
public void Test1() throws InterruptedException {

    confirmedPage = new ConfirmedPage(driver);
    herokuappUploadPage = new HerokuappUploadPage(driver);
    herokuappUploadPage.ChoosingImage();
    confirmedPage = herokuappUploadPage.ClickingUploadBtn();
    String actualResult=confirmedPage.GettingImageName(driver);
    System.out.println(actualResult);
    String expectedResult = herokuappUploadPage.imageName;
    Assert.assertEquals(actualResult,expectedResult);


}



}
