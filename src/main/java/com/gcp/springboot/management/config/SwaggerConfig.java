package com.gcp.springboot.management.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@Configuration
@EnableWebMvc
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {

}