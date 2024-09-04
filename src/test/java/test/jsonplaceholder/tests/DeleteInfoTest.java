package test.jsonplaceholder.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteInfoTest extends BaseTest {

    @DisplayName("Successful deleting post with id")
    @Test
    void deletePostWithId() {
        response = postsApi.deletePost(1);

        checker.checkResponseCodeEquals(200, response);
    }
}
