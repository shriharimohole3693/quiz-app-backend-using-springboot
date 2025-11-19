package com.quizapp.repository;

import com.quizapp.entity.Question;
import com.quizapp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
