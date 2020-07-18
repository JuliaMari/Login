package com.programem.seguranca;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

 @EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {
   
  @Override
  public void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
        .inMemoryAuthentication()
        .withUser("Marcos").password("{noop}123")
            .roles("USER")
        .and()
        .withUser("Osvaldo").password("{noop}321")
        .roles("USER") 
        .and()
        .withUser("Alfreda").password("{noop}132")
        .roles("USER");
  }
}
 

