package com.springsafe.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;



@Configuration
@EnableWebSecurity
public class springauth {

    @Bean

    public InMemoryUserDetailsManager userDetailsManager(){

        User.UserBuilder users= User.withDefaultPasswordEncoder();
        UserDetails userOne=users
                .username("testUserOne")
                .password("passwordone")
                .roles("USER")
                .build();

        UserDetails userTwo=users
                .username("testUserTwo")
                .password("passwordtwo")
                .roles("USER")
                .build();


        return new InMemoryUserDetailsManager(userOne, userTwo);

    }
}
