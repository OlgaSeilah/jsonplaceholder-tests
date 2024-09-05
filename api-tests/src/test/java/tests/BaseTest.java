package tests;


import io.restassured.response.Response;
import jsonplaceholder.tests.api.apiService.PostsApi;
import helpers.Checker;

public class BaseTest {
    protected final Checker checker = new Checker();
    protected PostsApi postsApi = new PostsApi();
    protected Response response;
}
