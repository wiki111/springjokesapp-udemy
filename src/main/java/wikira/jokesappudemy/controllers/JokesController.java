package wikira.jokesappudemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wikira.jokesappudemy.services.JokeService;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJokesView(Model model){
        model.addAttribute("joke", jokeService.sayJoke());
        return "jokespage";
    }
}
