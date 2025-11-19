package com.quizapp.service;

import com.quizapp.entity.QuestionWrapper;
import com.quizapp.entity.Quiz;
import com.quizapp.entity.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


public interface QuizService {

    public ResponseEntity<String> createQuiz(String category, int numQ, String title);

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id);

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses);


}
