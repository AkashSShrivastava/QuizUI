package com.Trivia.Quiz;

import com.Trivia.Quiz.Controller.ControllerClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class QuizApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);

		System.out.println("Akash");
	}

}
