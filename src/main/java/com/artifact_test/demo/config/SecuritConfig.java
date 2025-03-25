package com.artifact_test.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecuritConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Allow all requests without authentication
                )
                .csrf(csrf -> csrf.disable()) // Disable CSRF (only if not using session-based auth)
                .headers(headers -> headers.frameOptions().disable()); // Optional: For H2 console

        return http.build();
    }
}
