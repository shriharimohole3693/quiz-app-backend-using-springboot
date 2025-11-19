package com.quizapp.serviceimplementation;

import com.quizapp.entity.Question;
//import com.quizapp.repository.Questionrepo;
import com.quizapp.repository.QuestionRepo;
import com.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImple implements QuestionService {

    @Autowired
    QuestionRepo questionrepo;

    @Override
    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionrepo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(questionrepo.findAll(), HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionrepo.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionrepo.save(question);
        return "success";
    }

}





