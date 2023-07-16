import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestTest {
    @Test
    public void testlLoginWithInvalidData() {
        RestPageObject po = new RestPageObject();
        given().headers(po.getHeader()).formParams(po.getFormData()).
                when().post(po.endPoint).
                then().assertThat().statusCode(200).
                body("code", equalTo(1002)).
                body("message", equalTo("ERROR"));
    }
}