package edu.adhira.adhira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableEurekaClient
public class AdhiraApplication {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(AdhiraApplication.class, args);
    }

}
