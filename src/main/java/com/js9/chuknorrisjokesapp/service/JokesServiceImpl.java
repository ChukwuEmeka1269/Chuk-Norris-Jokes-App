package com.js9.chuknorrisjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JokesServiceImpl implements JokesService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
