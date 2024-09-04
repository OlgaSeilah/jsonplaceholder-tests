package jsonplaceholder.tests.api.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:apiTests.properties"
})
public interface ConfigApi extends Config {

    @Key("baseUrl")
    String baseUrl();
}