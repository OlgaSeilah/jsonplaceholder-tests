package test.jsonplaceholder.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetInfoTest extends BaseTest {

    @DisplayName("Response when getting all posts is 200 OK")
    @Test
    void checkGetPostsIs200() {
        response = postsApi.getPostInfo();

        checker.checkResponseCodeEquals(200, response);
    }

    @DisplayName("Posts contain field \"body\"")
    @Test
    void checkGetPostsContainsBody() {
        response = postsApi.getPostInfo();

        checker.checkResponseHasField("body", response);
    }
}
