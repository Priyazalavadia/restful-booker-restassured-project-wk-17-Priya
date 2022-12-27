package com.restful.booker.crudtest;

import com.restful.booker.model.UserPojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class UserCrudTest {

    static ValidatableResponse response;

    public static String token() {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBody("{ \"username\" : \"admin\", \"password\" : \"password123\"}")
                .build();

        return given(requestSpec).post("https://restful-booker.herokuapp.com/auth").path("token");
    }


    @Test
    public void getAllBookingInfo() {

        Response response = given()
                .when()
                .get("/");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void getSingleBookingInfo() {
        Response response = given()
                .pathParam("bookingid", 1436)
                .when()
                .get("/{bookingid}");
        response.then().statusCode(201);
        response.prettyPrint();
    }

    @Test
    public void verifyUserCreatedBookingSuccessfully() {
        List<String> additionalNeedsList = new ArrayList<>();
        additionalNeedsList.add("Breakfast");
        additionalNeedsList.add("Wi-Fi");
        UserPojo userPojo = new UserPojo();
        userPojo.setFirstName("Abc");
        userPojo.setLastName("Testing");
        userPojo.setTotalPrice(1000);
        userPojo.setDepositPaidOrNot("True");
        userPojo.setBookingDates("check in: 2022-12-25, checkout: 2022-12-31");
        userPojo.setAdditionalNeeds(additionalNeedsList);


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","fb4a905abbdb163")
                .when()
                .body(userPojo)
                .post("");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void verifyUserUpdateSuccessfully() {


    }

    @Test
    public void VerifyUserDeleteSuccessfully() {


    }
}

