package ru.vavtech.hw02.service;

import ru.vavtech.hw02.model.Question;

public interface ExamService {

    boolean checkQuestion(Question question, String userAnswer);

}
