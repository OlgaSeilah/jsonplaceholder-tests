package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.apache.http.HttpStatus.SC_OK;

public class DeleteInfoTest extends BaseTest {

    @DisplayName("Successful deleting post with id is 200 OK")
    @Test
    void deletePostWithId() {
        response = postsApi.deletePost(1);

        checker.checkResponseCodeEquals(SC_OK, response);
    }
}
