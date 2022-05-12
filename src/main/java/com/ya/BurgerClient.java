package com.ya;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class BurgerClient extends BurgerRestClient{

    public ValidatableResponse createOrder(Burger burger, User user){
        return given()
                .spec(getBaseSpec())
                .header("Authorization", user.getAccessToken())
                .when()
                .body(burger)
                .post("orders")
                .then();
    }

    public void addIngredients(Burger burger){
        String ingredients;

        ValidatableResponse response = given()
                .spec(getBaseSpec())
                .when()
                .get("ingredients")
                .then();
        response.log().body();
        ingredients = response.extract().response().jsonPath().getString("data._id");
        //burger.setIngredients(ingredients);
    }

}
