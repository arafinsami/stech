package com.stech.repository.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.stech.repository")
@EnableMongoRepositories(basePackages = "com.stech.repository.mongo")
public class RepositoryConfig {
}
