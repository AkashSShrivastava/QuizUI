package com.Trivia.Quiz.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/test")
    @ResponseBody
    public String test()
    {
        return "Hello World";
    }
}
