import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DownloadExcelTests extends TestBase{


    DownloadPage downloadPage;
    ExcelReader excelReader;

@Test
public void Test1() throws InterruptedException, IOException {
   downloadPage = new DownloadPage(driver);
    downloadPage.pressDownload();
    Thread.sleep(3000);
    excelReader = new ExcelReader();
    Object[][] data = excelReader.getExcelData();
    int row = data.length-8;
    Assert.assertEquals(row,36,"the rows number is not correct");

}



}
