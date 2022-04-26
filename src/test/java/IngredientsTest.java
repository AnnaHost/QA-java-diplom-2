import com.ya.BurgerRestClient;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class IngredientsTest extends BurgerRestClient {

    private static final String COURIER_PATH = "ingredients";

    @Test
    public void test(){
        ValidatableResponse createResponse = given()
                .spec(getBaseSpec())
                .get(COURIER_PATH)
                .then();
        createResponse.log().body();
    }

}
