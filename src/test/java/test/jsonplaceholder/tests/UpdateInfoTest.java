package test.jsonplaceholder.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.jsonplaceholder.api.models.PostModel;

import static org.apache.http.HttpStatus.SC_OK;

public class UpdateInfoTest extends BaseTest {

    @DisplayName("Update post body")
    @Test
    void createPostWithValidData() {
        PostModel postModel = PostModel.builder()
                .body("changed post body")
                .build();
        response = postsApi.updatePost(postModel, 1);

        checker.checkResponseCodeEquals(SC_OK, response);
    }


}
