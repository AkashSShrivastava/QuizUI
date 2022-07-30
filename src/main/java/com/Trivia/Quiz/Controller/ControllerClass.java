package com.Trivia.Quiz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerClass {

    @GetMapping("/{path}")
    public String getHtmlPage(@PathVariable String path)
    {
        GetHtmlPage htmlPage = new GetHtmlPage();
        return htmlPage.getHtmlPage(path);
    }
}
