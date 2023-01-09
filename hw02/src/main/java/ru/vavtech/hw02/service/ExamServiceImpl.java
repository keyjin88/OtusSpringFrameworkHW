package ru.vavtech.hw02.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vavtech.hw02.model.Question;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    @Override
    public boolean checkQuestion(Question question, String userAnswer) {
        var correctAnswer = question.getCorrectAnswer();
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}
