package ru.vavtech.hw01.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;
@Slf4j
@RequiredArgsConstructor
public class ExamRunnerImpl implements ExamRunner {

    private final ExamService examService;

    @Override
    public void runExamination() {

    }

    @Override
    public void test() {
        var questions = examService.showAllQuestions();
        for (var question : questions) {
            System.out.println(MessageFormat.format("Вопрос: \"{0}\", Правильный ответ: \"{1}\"", question.getQuestion(), question.getCorrectAnswer()));
            log.info("{}", question);
        }
    }
}
