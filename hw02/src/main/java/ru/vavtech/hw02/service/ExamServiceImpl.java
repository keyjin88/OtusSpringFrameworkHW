package ru.vavtech.hw02.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.vavtech.hw02.dao.QuestionDAO;
import ru.vavtech.hw02.model.Question;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    private final QuestionDAO questionDAO;

    @Override
    public List<Question> getAllQuestions() {
        return questionDAO.getQuestions();
    }

    @Override
    public boolean checkQuestion(Question question, String userAnswer) {
        var correctAnswer = question.getCorrectAnswer();
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}
