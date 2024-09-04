package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.apache.http.HttpStatus.SC_OK;

public class GetInfoTest extends BaseTest {

    @DisplayName("Response code when getting all posts is 200 OK")
    @Test
    void checkGetPostsIs200() {
        response = postsApi.getPostInfo();

        checker.checkResponseCodeEquals(SC_OK, response);
    }

    @DisplayName("Posts contain field \"body\"")
    @Test
    void checkGetPostsContainsBody() {
        response = postsApi.getPostInfo();

        checker.checkResponseHasField("body", response);
    }
}
