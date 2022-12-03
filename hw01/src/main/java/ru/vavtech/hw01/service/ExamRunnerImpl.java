package ru.vavtech.hw01.service;

import lombok.RequiredArgsConstructor;
import ru.vavtech.hw01.service.io.IOService;

import java.text.MessageFormat;

@RequiredArgsConstructor
public class ExamRunnerImpl implements ExamRunner {

    private final ExamService examService;
    private final IOService ioService;

    @Override
    public void test() {
        var questions = examService.getAllQuestions();
        for (var question : questions) {
            var message = MessageFormat.format("Question: \"{0}\", Right answer: \"{1}\"", question.getQuestion(), question.getCorrectAnswer());
            ioService.printString(message);
        }
    }
}
