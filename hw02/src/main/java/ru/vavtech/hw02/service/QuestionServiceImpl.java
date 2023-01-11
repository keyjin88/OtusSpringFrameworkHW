package ru.vavtech.hw02.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vavtech.hw02.dao.QuestionDAO;
import ru.vavtech.hw02.model.Question;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDAO questionDAO;

    @Override
    public List<Question> getAllQuestions() {
        return questionDAO.getQuestions();
    }
}
