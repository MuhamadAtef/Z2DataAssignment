import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends TestBase{

    W3SchoolsPage w3SchoolsPage;
    @Test
    public void assertionTest(){
        w3SchoolsPage = new W3SchoolsPage(driver);
        String companyName =w3SchoolsPage.getCompanyName();
        String countryName = w3SchoolsPage.getCountry();
        System.out.println(companyName);
        System.out.println(countryName);

        if(companyName=="Ernst Handel"){
            Assert.assertEquals(countryName,"Austria");

        }


    }
}
