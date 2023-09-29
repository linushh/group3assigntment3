package com.example.group3assignment3.RestAssuredTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

class WebControllerTest {

    @Test
    public void helloWorldReturnsCorrectMessage() {
        RestAssured.baseURI = "http://localhost:8080";
        given()
                .when()
                .get("/hello/Max")
                .then()
                .statusCode(200)
                .body("respons", equalTo("Hello, Max"));
    }
}