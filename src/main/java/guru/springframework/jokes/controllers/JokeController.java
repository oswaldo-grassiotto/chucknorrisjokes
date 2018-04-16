package guru.springframework.jokes.controllers;

import guru.springframework.jokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JokeController {

    private JokeService jokes;

    @Autowired
    public JokeController(JokeService jokes){
        this.jokes = jokes;
    }

    @RequestMapping("/")
    public String getJoke(Model model){

        model.addAttribute("joke", jokes.getQuote());

        return "chucknorris";
    }
}
