package spa.simone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("external")
@PropertySource("file:/home/developer/external.properties")
public class ExternalConfig {
}
