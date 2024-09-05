package helpers;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import jsonplaceholder.tests.api.helpers.ResponseHelper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Checker {

    private final ResponseHelper responseHelper = new ResponseHelper();

    @Step("Response is: {expectedCode}")
    public void checkResponseCodeEquals(int expectedCode, Response response) {
        assertEquals(expectedCode, response.statusCode(), "Response code is not as expected");
    }

    @Step("Response contains field: {fieldName}")
    public void checkResponseHasField(String fieldName, Response response) {
        responseHelper.getFieldValue(fieldName, response);
    }
}
