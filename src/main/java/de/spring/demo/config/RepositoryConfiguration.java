package de.spring.demo.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@AutoConfigureAfter({MongoDataAutoConfiguration.class})
@EnableMongoRepositories(basePackages = "de.spring.demo")
public class RepositoryConfiguration {

}
