package com.example.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class IndexControllerTest {

    @Test
    public void whenTestApp_thenEmptyResponse() throws Exception {
        given()
                .when().get("/v1")
                .then()
                    .statusCode(200)
                    .body(is("FHDB Parser - v1.0.0"));
    }
}
