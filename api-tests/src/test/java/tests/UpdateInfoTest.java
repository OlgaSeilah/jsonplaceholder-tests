package tests;

import jsonplaceholder.tests.api.models.PostModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.apache.http.HttpStatus.SC_OK;


public class UpdateInfoTest extends BaseTest {

    @DisplayName("Response code when updating post body is 200 OK")
    @Test
    void createPostWithValidData() {
        PostModel postModel = PostModel.builder()
                .body("changed post body")
                .build();
        response = postsApi.updatePost(postModel, 1);

        checker.checkResponseCodeEquals(SC_OK, response);
    }
}
