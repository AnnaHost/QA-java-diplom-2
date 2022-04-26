import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class IngredientsTest {


    ValidatableResponse createResponse = given()
            .get()
            .then();
    

}
