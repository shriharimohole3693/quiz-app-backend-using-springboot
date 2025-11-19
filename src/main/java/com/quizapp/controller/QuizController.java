package com.quizapp.controller;

import com.quizapp.entity.Question;
import com.quizapp.entity.QuestionWrapper;
import com.quizapp.entity.Response;
import com.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizservice;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title)  // to receive data from links of client
    {
        return quizservice.createQuiz(category, numQ, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@RequestParam Integer id)  // to receive data from links of client
    {
        return quizservice.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id,@RequestBody List<Response> responses)  // to receive data from links of client
    {

        return quizservice.calculateResult(id,responses);
    }


}
