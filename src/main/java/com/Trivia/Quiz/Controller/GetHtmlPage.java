package com.Trivia.Quiz.Controller;

import java.util.HashMap;
import java.util.Map;

public class GetHtmlPage {
    public String getHtmlPage(String path)
    {

        Map<String, String> htmlPage = new HashMap<>();
        htmlPage.put("java","java");
        htmlPage.put("home","home");
        htmlPage.put(null,"home");
        htmlPage.put("index","index");
        htmlPage.put("cpp","cpp");
        htmlPage.put("generic","generic");
        htmlPage.put("test","<h1>Hello World</h1>");
        if(htmlPage.containsKey(path))
            return htmlPage.get(path);

        else
            return "notFound";
    }
}
