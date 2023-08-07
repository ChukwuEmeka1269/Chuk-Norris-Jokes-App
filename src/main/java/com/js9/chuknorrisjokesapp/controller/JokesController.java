package com.js9.chuknorrisjokesapp.controller;

import com.js9.chuknorrisjokesapp.service.JokesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class JokesController {

    private final JokesService jokesService;

    @RequestMapping({"/", "", "index", "index.html"})
    public String showARandomChukNorisJoke(Model model){

        model.addAttribute("joke", jokesService.getRandomJoke());

        return "index";
    }
}
