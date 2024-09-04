package test.jsonplaceholder.api.apiService;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import test.jsonplaceholder.api.models.PostModel;

import java.util.List;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static test.jsonplaceholder.api.endpoints.ApiTestsEndpoints.POSTS;
import static test.jsonplaceholder.api.endpoints.ApiTestsEndpoints.POST_ID;
import static test.jsonplaceholder.api.specs.SpecHelper.getBaseRequestSpec;
import static test.jsonplaceholder.api.specs.SpecHelper.getResponseSpec;

public class PostsApi extends ApiService {

    @Step("Get all posts")
    public Response getPostInfo() {
        return given()
                .spec(getBaseRequestSpec())
                .when()
                .get(POSTS.getEndPoint())
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .response();
    }

    @Step("Get all body texts")
    public List<String> getPostInfoAsList() {
        return given()
                .spec(getBaseRequestSpec())
                .when()
                .get(POSTS.getEndPoint())
                .then()
                .statusCode(SC_OK)
                .extract()
                .jsonPath()
                .getList("body", String.class);
    }

    @Step("Create post with useId, body and title")
    public Response createPost(PostModel postModel) {
        return given()
                .spec(getBaseRequestSpec())
                .when()
                .body(postModel)
                .post(POSTS.getEndPoint())
                .then()
                .spec(getResponseSpec(SC_CREATED))
                .extract()
                .response();
    }

    @Step("Create post with useId, body and title")
    public Response createPostWithoutBody() {
        return given()
                .spec(getBaseRequestSpec())
                .when()
                .post(POSTS.getEndPoint())
                .then()
                .spec(getResponseSpec(SC_CREATED))
                .extract()
                .response();
    }

    public Response updatePost(PostModel postModel, int postId) {
        return given()
                .spec(getBaseRequestSpec())
                .when()
                .body(postModel)
                .put(POST_ID.getEndPoint(), postId)
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .response();
    }

    public Response deletePost(int postId) {
        return given()
                .spec(getBaseRequestSpec())
                .when()
                .delete(POST_ID.getEndPoint(), postId)
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .response();
    }


}
