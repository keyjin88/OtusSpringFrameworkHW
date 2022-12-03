package ru.vavtech.hw02.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.vavtech.hw02.service.io.IOService;

import java.text.MessageFormat;
@Component
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
