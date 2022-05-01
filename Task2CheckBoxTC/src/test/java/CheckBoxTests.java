import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends TestBase{


    HerokuappPage herokuappPage ;

@Test
public void Test1(){
    herokuappPage = new HerokuappPage(driver);
    herokuappPage.setCheckBox1();
    boolean CB1actualResult = herokuappPage.assertCheckBox1();
    System.out.println(CB1actualResult);
    Assert.assertTrue(CB1actualResult,"CheckBox 1 is selected");
    boolean CB2actualResult = herokuappPage.assertCheckBox2();
    System.out.println(CB2actualResult);
    Assert.assertTrue(CB2actualResult,"CheckBox 2 is selected");
    }



}
