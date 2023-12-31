package com.gl.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.gl.springbootrest.repository")
@EntityScan("com.gl.springbootrest.model")
public class SpringbootrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrestApplication.class, args);
    }

}
