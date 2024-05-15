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
//                authorize.requestMatchers(HttpMethod.GET, "/greeting", "/login-register", "/js/login-register.js", "/js/login-register.css").permitAll()
//                .anyRequest().authenticated()
//            )
//            .formLogin().permitAll()
//            .and()
//            .httpBasic();
//
//        return http.build();
//    }
//}