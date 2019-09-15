package ir.sapp.bot.municipality.configuration.APIConfig;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "municipality.constructional")
@Getter
public class ConstructionalConfig {
}
