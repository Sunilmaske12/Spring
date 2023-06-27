package com.springAPI.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.springAPI.controller", "exceptionHandling"})
@EnableWebMvc
public class DemoAppConfig {

}
