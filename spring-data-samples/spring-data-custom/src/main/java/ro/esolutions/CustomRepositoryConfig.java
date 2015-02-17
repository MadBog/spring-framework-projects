package ro.esolutions;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Bogdan Stoean on 17.02.2015.
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(repositoryImplementationPostfix = "CustomImpl")
public class CustomRepositoryConfig {
}
