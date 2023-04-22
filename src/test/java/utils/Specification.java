package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {

    public static RequestSpecification requestSpecification (String URL){
        return new RequestSpecBuilder()
                .setBaseUri(URL).setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecificationAny(int expected){
        return new ResponseSpecBuilder()
                .expectStatusCode(expected)
                .build();
    }

    public static void installSpecification(RequestSpecification requestSpecification, ResponseSpecification responseSpecification){
        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;

    }
}
