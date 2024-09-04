package jsonplaceholder.tests.api.helpers;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class ResponseHelper {

    @Step("Get text from the field {fieldName}")
    public String getFieldValue(String fieldName, Response response) {
        if (response.getBody().jsonPath().get(fieldName) == null)
            return "field not found";
        else return response.getBody().jsonPath().get(fieldName).toString();
    }
}
