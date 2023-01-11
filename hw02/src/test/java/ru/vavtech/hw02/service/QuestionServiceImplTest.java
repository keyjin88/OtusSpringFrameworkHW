package ru.vavtech.hw02.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.vavtech.hw02.dao.QuestionDAO;
import ru.vavtech.hw02.model.Question;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class QuestionServiceImplTest {

    @Mock
    private QuestionDAO questionDAO;
    private QuestionService questionService;

    @BeforeEach
    void setUp() {
        questionService = new QuestionServiceImpl(questionDAO);
    }

    @Test
    @DisplayName("Возвращаем список всех вопросов")
    void getAllQuestionTest() {
        given(questionDAO.getQuestions()).willReturn(List.of(
                new Question("Test question #1", "1"),
                new Question("Test question #2", "2"),
                new Question("Test question #3", "3")
        ));
        List<Question> result = questionService.getAllQuestions();
        assertThat(result.size()).isEqualTo(3);
    }
}