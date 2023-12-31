package com.js9.chuknorrisjokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChukNorrisJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChukNorrisJokesAppApplication.class, args);
    }

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
