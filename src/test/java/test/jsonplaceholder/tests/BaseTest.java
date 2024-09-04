package test.jsonplaceholder.tests;

import io.restassured.response.Response;
import test.jsonplaceholder.api.apiService.PostsApi;
import test.jsonplaceholder.api.helpers.Checker;

public class BaseTest {
    protected final Checker checker = new Checker();
    protected PostsApi postsApi = new PostsApi();
//    public PostModel postModel = new PostModel();
    protected Response response;
}
