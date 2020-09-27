package io.elasticloyalty.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"io.elasticloyalty.*"})
@EntityScan(basePackages = {"io.elasticloyalty.*"})
@EnableJpaRepositories(basePackages = {"io.elasticloyalty.*"})
public class ELApplication {

    public static void main(String[] args) {

        SpringApplication.run(ELApplication.class);
    }}
