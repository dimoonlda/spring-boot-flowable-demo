package ua.dimoon.research.flowable.spring.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"ua.dimoon.research.flowable.spring.repositories"})
@EntityScan(
        basePackages = {"ua.dimoon.research.flowable.spring.model"}
)
public class JpaConfig {
}
