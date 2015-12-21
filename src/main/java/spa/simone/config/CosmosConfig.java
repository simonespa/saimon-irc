package spa.simone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("cosmos")
@PropertySource("classpath:cosmos.properties")
public class CosmosConfig {
}
