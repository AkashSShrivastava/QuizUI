package com.Trivia.Quiz;

import com.Trivia.Quiz.Controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class);
		SpringApplication.run(QuizApplication.class, args);

		System.out.println("Akash");
	}

}
