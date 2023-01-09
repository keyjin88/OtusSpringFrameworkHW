package ru.vavtech.hw02.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.vavtech.hw02.model.Question;

import static org.assertj.core.api.Assertions.assertThat;

class ExamServiceImplTest {

    private Question q1;

    @BeforeEach
    void setUp() {
        q1 = new Question("The capital of Russia is", "Moscow");
    }

    @Test
    @DisplayName("Проверяем, что пользователь дал правильный ответ")
    void checkQuestionRightAnswerTest() {
        ExamServiceImpl examService = new ExamServiceImpl();
        var studentAnswer = "Moscow";
        boolean result = examService.checkQuestion(q1, studentAnswer);
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Проверяем, что пользователь дал неверный ответ")
    void checkQuestionWrongAnswerTest() {
        ExamServiceImpl examService = new ExamServiceImpl();
        var studentAnswer = "Tula";
        boolean result = examService.checkQuestion(q1, studentAnswer);
        assertThat(result).isFalse();
    }

}