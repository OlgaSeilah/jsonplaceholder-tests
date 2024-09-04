package test.jsonplaceholder.api.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aeonbits.owner.ConfigFactory;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiConfig {

    @Getter
    @Setter
    private static String baseURL;

    static {
        loadConfigurations();
    }

    private static void loadConfigurations() {
        ConfigApi configProject = ConfigFactory.create(ConfigApi.class, System.getProperties());

        baseURL = configProject.baseUrl();
    }
}