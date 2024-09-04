package jsonplaceholder.tests.api.apiService;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static jsonplaceholder.tests.api.helpers.CustomApiListener.withCustomTemplates;

public class ApiService {

    protected static RequestSpecification given() {
        return RestAssured.given().filter(withCustomTemplates());
    }
}