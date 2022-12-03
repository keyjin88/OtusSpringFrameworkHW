package ru.vavtech.hw02.service;

import lombok.RequiredArgsConstructor;
import ru.vavtech.hw02.service.io.IOService;

import java.text.MessageFormat;

@RequiredArgsConstructor
public class ExamRunnerImpl implements ExamRunner {

    private final ExamService examService;
    private final IOService ioService;

    @Override
    public void test() {
        var questions = examService.getAllQuestions();
        System.out.println("Hello world!!!");
        for (var question : questions) {
            var message = MessageFormat.format("Question: \"{0}\", Right answer: \"{1}\"", question.getQuestion(), question.getCorrectAnswer());
            ioService.printString(message);
        }
    }
}
