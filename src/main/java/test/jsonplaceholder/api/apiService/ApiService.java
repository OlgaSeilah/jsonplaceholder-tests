package test.jsonplaceholder.api.apiService;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static test.jsonplaceholder.api.helpers.CustomApiListener.withCustomTemplates;

public class ApiService {

    protected static RequestSpecification given() {
        return RestAssured.given().filter(withCustomTemplates());
    }
}