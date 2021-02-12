package com.gcp.springboot.management.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.gcp.springboot.management.repository")
@ComponentScan(basePackages = { "com.gcp.springboot.management" })
public class AutoConfiguration {

}
