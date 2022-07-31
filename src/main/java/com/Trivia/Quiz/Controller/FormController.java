package com.Trivia.Quiz.Controller;

import com.Trivia.Quiz.Services.SaveMessageService;
import com.Trivia.Quiz.model.UserContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class FormController  {

    @Autowired
    SaveMessageService saveMessageService;

    @GetMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @GetMapping
    public String formGet(Model model) {
        model.addAttribute("user",new UserContact());
        return "home";
    }

    @PostMapping
    public ModelAndView formPost(@Valid UserContact user, BindingResult bindingResult, Model model)
    {

        if (bindingResult.hasErrors())
        {
            if(bindingResult.hasFieldErrors("email"))
                model.addAttribute("user",new UserContact("","","",true,"InValid Email! 😠"));
            else
                model.addAttribute("user",new UserContact("","","",true,"Add Message 🙏"));

            return new ModelAndView("home", (Map<String, ?>)model);
        }

        model.addAttribute("user",new UserContact("","","",false,"Message Sent! 😁"));
        saveMessageService.saveMessage("subject", user.getMessage());
        System.out.println(model+ user.toString());
        return new ModelAndView("home", (Map<String, ?>) model);
    }
}
