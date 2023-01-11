package ru.vavtech.hw02.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.vavtech.hw02.exceptions.QuestionsReadException;
import ru.vavtech.hw02.model.Question;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class QuestionDaoCsvTest {

    @Test
    @DisplayName("Проверка успешного чтения из файла, когда он есть")
    void getQuestionsTest() {
        var questionDao = new QuestionDaoCsv("/questions.csv");
        var questions = questionDao.getQuestions();

        var q1 = new Question("The capital of Russia is", "Moscow");
        var q2 = new Question("3 * 3 = ", "9");
        assertThat(questions).containsExactlyInAnyOrder(q1, q2);
    }

    @Test
    @DisplayName("Проверка вылетающей ошибки при чтении файла с вопросами")
    void getQuestionsWithErrorTest() {
        var questionDao = new QuestionDaoCsv("/dummy.csv");
        assertThatThrownBy(questionDao::getQuestions).isInstanceOf(QuestionsReadException.class);
    }
}