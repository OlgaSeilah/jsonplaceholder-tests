package jsonplaceholder.tests.api.apiService;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import jsonplaceholder.tests.api.models.PostModel;

import java.util.List;

import static jsonplaceholder.tests.api.endpoints.ApiTestsEndpoints.POSTS;
import static jsonplaceholder.tests.api.endpoints.ApiTestsEndpoints.POST_ID;
import static jsonplaceholder.tests.api.specs.SpecHelper.getBaseRequestSpec;
import static jsonplaceholder.tests.api.specs.SpecHelper.getResponseSpec;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

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

    @Step("Update post with Id")
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

    @Step("Delete post with Id")
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
