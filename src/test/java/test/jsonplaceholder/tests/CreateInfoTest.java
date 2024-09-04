package test.jsonplaceholder.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.jsonplaceholder.api.models.PostModel;

import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_CREATED;

public class CreateInfoTest extends BaseTest {

    @DisplayName("Successful creating new post with valid data")
    @Test
    void createPostWithValidData() {
        PostModel postModel = PostModel.builder()
                .title("post title")
                .body("post body")
                .userId(7564)
                .build();
        response = postsApi.createPost(postModel);

        checker.checkResponseCodeEquals(SC_CREATED, response);
        checker.checkResponseHasField("id", response);
    }

    @DisplayName("Error when trying to create new post without body")
    @Test
    void createPostWithoutValidData() {
        response = postsApi.createPostWithoutBody();

        checker.checkResponseCodeEquals(SC_BAD_REQUEST, response);
    }
}
