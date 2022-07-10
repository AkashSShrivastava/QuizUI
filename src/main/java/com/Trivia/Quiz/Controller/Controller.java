package com.Trivia.Quiz.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/test")
    @ResponseBody
    public String test()
    {
        return "Hello World";
    }

    @GetMapping("/")
    public String HomePage()
    {
        return "home";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
