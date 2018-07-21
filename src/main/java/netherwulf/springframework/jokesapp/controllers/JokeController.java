package netherwulf.springframework.jokesapp.controllers;

import netherwulf.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", " "})
    public String sayJoke(Model model){
        model.addAttribute("joke", jokeService.sayJoke());

        return "chuckNorris";
    }
}
