package test.jsonplaceholder.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PostModel {
    @JsonProperty()
    private int userId;
    @JsonProperty()
    private int id;
    @JsonProperty()
    private String title;
    @JsonProperty()
    private String body;
}
