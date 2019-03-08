package nl.tue.base.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Saba.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
