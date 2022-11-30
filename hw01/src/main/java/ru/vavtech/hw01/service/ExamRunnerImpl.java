package ru.vavtech.hw01.service;

import lombok.RequiredArgsConstructor;
import ru.vavtech.hw01.service.io.IOService;

@RequiredArgsConstructor
public class ExamRunnerImpl implements ExamRunner {

    private final ExamService examService;
    private final IOService ioService;

    @Override
    public void test() {
        var questions = examService.getAllQuestions();
        for (var question : questions) {
            ioService.printQuestionWithAnswer(question);
        }
    }
}
