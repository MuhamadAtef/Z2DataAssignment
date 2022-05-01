

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class test {


        @Test
        public void request() {

                    given().
                    get("https://api.agify.io/?name=Ahmed").
                    then().
                    assertThat().
                    body("name", equalTo("Ahmed")
                            ,"age",equalTo(33)
                            ,"count",equalTo(133489));


        }


    }


