package test.jsonplaceholder.api.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
//        "system:properties",
        "classpath:apiTests.properties"
})
public interface ConfigApi extends Config {

    @Key("baseUrl")
    String baseUrl();
}