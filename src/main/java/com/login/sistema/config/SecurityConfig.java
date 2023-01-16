package com.login.sistema.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
    http.authorizeHttpRequests(
      authorizeConfig->{
        authorizeConfig.requestMatchers("/public", "/logout","/users").permitAll();
        authorizeConfig.anyRequest().authenticated();
      }
    ).formLogin()
    .and()
    .httpBasic()
    .and()
    .csrf().disable();


    return http.build();

  }

  @Autowired
  public void configure(AuthenticationManagerBuilder auth) throws Exception{
    auth.inMemoryAuthentication()
    .withUser("juliao")
    .password("{noop}juliao")
    .roles("ADMIN");
  }

}
