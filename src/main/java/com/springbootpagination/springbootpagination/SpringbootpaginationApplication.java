package com.springbootpagination.springbootpagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.controller","com.service"})
@EnableJpaRepositories("com.repo")
@EntityScan("com.dto")
public class SpringbootpaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpaginationApplication.class, args);
	}

}
