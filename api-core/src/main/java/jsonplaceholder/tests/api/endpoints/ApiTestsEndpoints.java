package jsonplaceholder.tests.api.endpoints;

import lombok.Getter;

public enum ApiTestsEndpoints {

    POSTS("/posts"),
    POST_ID("/posts/{postId}");

    @Getter
    private final String endPoint;

    ApiTestsEndpoints(String endPoint) {
        this.endPoint = endPoint;
    }
}
