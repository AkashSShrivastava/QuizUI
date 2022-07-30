package com.Trivia.Quiz.Controller;

import com.Trivia.Quiz.Services.SaveRatingService;
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
@RequestMapping("/index")
public class ReviewController {

    @Autowired
    SaveRatingService saveRatingService;

    @GetMapping
    public String formGet(Model model) {
        model.addAttribute("user",new UserContact());
        return "index";
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

            return new ModelAndView("index", (Map<String, ?>)model);
        }

        if(user.getRate()==0)
        {
            model.addAttribute("user",new UserContact("","","",true,"Add Rating 🙏"));
            return new ModelAndView("index", (Map<String, ?>)model);
        }

        model.addAttribute("user",new UserContact("","","",false,"Submitted 😁"));
        saveRatingService.saveRating("subject", user.getMessage());
        System.out.println(user.toString());
        return new ModelAndView("index", (Map<String, ?>) model);
    }

//    @GetMapping
//    public String main(Model model) {
//        model.addAttribute("rating", new Rating());
//        return "index";
//    }
//
//    @PostMapping
//    public String save(Rating rating, Model model) {
//        model.addAttribute("rating", rating);
//        return "index";
//    }
}
