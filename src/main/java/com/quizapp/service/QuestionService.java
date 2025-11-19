package com.quizapp.service;

import com.quizapp.entity.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;


//@Service
public interface QuestionService {

    public ResponseEntity<List<Question>> getAllQuestions();

    public List<Question> getQuestionsByCategory(String category);

    public String addQuestion(Question question);

}

