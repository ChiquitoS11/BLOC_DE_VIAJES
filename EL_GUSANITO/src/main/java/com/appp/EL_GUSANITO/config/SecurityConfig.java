//package com.appp.EL_GUSANITO.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests(authorize -> 
//                authorize.requestMatchers(HttpMethod.GET, "/login-register", "/publicacion", "/test", "/css/login-register.css", "/js/login-register.js").permitAll()
//                .anyRequest().authenticated()
//            );
//
//        return http.build();
//    }
//}